package edu.barrinm.assign05;

import java.util.ArrayList;

public class Woods {
    private ArrayList<Giant> Giants = new ArrayList<Giant>();
    public Giant createGiant(String name, String typeName) {
        if(name.equals("")) {return null;}
        else if(typeName.equalsIgnoreCase("GIANT")) {
            return new Giant(name);
        }
        else if(typeName.equalsIgnoreCase("TROLL")) {
            return new Troll(name);
        }
        else if(typeName.equalsIgnoreCase("TREE")) {
            return new Tree(name);
        }
        else if(typeName.equalsIgnoreCase("ENT")) {
            return new Ent(name);
        }
        else if(typeName.equalsIgnoreCase("HUORN")) {
            return new Huorn(name);
        }
        else {return null;}
    }

    public boolean addGiant(String name, String typeName) {
        Giant g = createGiant(name, typeName);
        if(g==null) {
            return false;
        }
        else {
            Giants.add(g);
            return true;
        }
    }

    public Giant getGiant(int index) {
        if (index >= 0 && index < Giants.size()) {
            return Giants.get(index);
        }
        else {return null;}
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for(int i = 0; i < Giants.size(); i++) {
            System.out.println("- " + Giants.get(i).toString());
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for(int i = 0; i < Giants.size(); i++) {
            if(Giants.get(i) instanceof Ent) {
                System.out.println("- " + Giants.get(i).toString() + ": " + ((Ent)Giants.get(i)).speak());
            }
            else if(Giants.get(i) instanceof Huorn) {
                System.out.println("- " + Giants.get(i).toString() + ": " + ((Huorn)Giants.get(i)).speak());
            }
            else if(Giants.get(i) instanceof Tree) {
                System.out.println("- " + Giants.get(i).toString() + ": " + ((Tree)Giants.get(i)).speak());
            }
        }
    }

    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for(int i = 0; i < Giants.size(); i++) {
            if(Giants.get(i) instanceof Troll) {
                System.out.println("- " + Giants.get(i).toString() + ": " + ((Troll)Giants.get(i)).cook());
            }
        }
    }
}

