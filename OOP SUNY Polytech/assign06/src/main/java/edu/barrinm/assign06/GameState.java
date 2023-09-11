package edu.barrinm.assign06;

import edu.barrinm.assign04.CharBoard;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable{
    private ArrayList<Loadable> LoadableList = new ArrayList<Loadable>();
    private CharBoard map = new CharBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException {
        if(typeName.equalsIgnoreCase("Skeleton")) {
            return new Skeleton();
        }
        else if(typeName.equalsIgnoreCase("Rat")) {
            return new Rat();
        }
        else if(typeName.equalsIgnoreCase("Book")) {
            return new Book();
        }
        else if(typeName.equalsIgnoreCase("Item")) {
            return new Item();
        }
        else {
            throw new GameFileException("Unknown type: " + typeName);
        }
    }
    public void load(Scanner input) throws GameFileException {
        //clears charboard
        map.clear();
        //clears arraylist
        LoadableList.clear();
        int numLines = input.nextInt();
        for(int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            LoadableList.add(m);
            if(m instanceof Drawable) {
                //cast m as drawable; will cause child class to be called since Drawable is interface
                ((Drawable)m).draw(map);
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(map.getMapString());
        sb.append("\n");
        sb.append("CREATURES:\n");
        for(int i = 0; i < LoadableList.size(); i++) {
            if(LoadableList.get(i) instanceof Creature) {
                sb.append("* ");
                sb.append(LoadableList.get(i));
                sb.append("\n");
            }
        }
        sb.append("INVENTORY:\n");
        for(int i = 0; i < LoadableList.size(); i++) {
            if(LoadableList.get(i) instanceof Item) {
                sb.append("* ");
                sb.append(LoadableList.get(i));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public void save(String fileName) throws GameFileException {
        try {
            PrintWriter output = new PrintWriter(fileName);
            output.print(this.toString());
            output.close();
        }
        catch(Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
