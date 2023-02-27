package edu.barrinm.assign03;

public class Letterhead {

    private String name;
    private String [] sloganLines;
    private char boundaryChar;
    private final int WIDTH = 40;
    private final int HEIGHT = 8;

    public Letterhead(String name, String [] sloganLines, char boundaryChar) {
        this.name = name; //sets the name for this object
        this.sloganLines = new String[sloganLines.length]; //reallocate slogan string array
        for(int i = 0; i < sloganLines.length; i++) { //fill this slogan string array
            this.sloganLines[i] = sloganLines[i];
        }
        this.boundaryChar = boundaryChar; //set the boundary character for the current object
    }

    public String getName() {
        return this.name;
    }

    public char getBoundaryChar() {
        return this.boundaryChar;
    }

    public String getSlogan() {
        StringBuilder sb = new StringBuilder();
        String stringSlogan;
        for(int i = 0; i < sloganLines.length; i++) {
            sb.append(sloganLines[i]);
            sb.append('\n');
        }
        stringSlogan = sb.toString();
        return stringSlogan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar) {
        this.boundaryChar = boundaryChar;
    }

    public void setSlogan(String [] sloganLines) {
        this.sloganLines = new String[sloganLines.length];
        for(int i = 0; i < sloganLines.length; i++) {
            this.sloganLines[i] = sloganLines[i];
        }
    }

    public String toString() {
        String letterHead;
        StringBuilder sb = new StringBuilder(); //new StringBuilder object
        sb.append(getBoundaryLine()); //upper boundary
        sb.append(getContentLine(this.name)); //business name line
        sb.append(getContentLine("")); //blank content line
        for(String sloganLine: this.sloganLines) { //for each slogan line
            sb.append(getContentLine(sloganLine)); //append the slogan line
        }
        for(int i = 0; i < HEIGHT - this.sloganLines.length - 4; i++) { //append blank lines to reach HEIGHT
            sb.append(getContentLine(""));
        }
        sb.append(getBoundaryLine());
        letterHead = sb.toString();
        return letterHead;
    }

    private String getBoundaryLine() {
        StringBuilder sb = new StringBuilder(); //new StringBuilder object
        String boundaryLine; //string to be returned
        for(int i = 0; i < WIDTH; i++) { //appends WIDTH boundary characters
            sb.append(this.boundaryChar);
        }
        sb.append('\n'); //appends a newline
        boundaryLine = sb.toString(); //creates a string to return
        return boundaryLine;
    }

    private String getContentLine(String content) {
        String contentLine; //string to be returned
        StringBuilder sb = new StringBuilder(); //new StringBuilder object
        sb.append(this.boundaryChar); //left boundary character
        sb.append(" "); //space between left boundary and content
        sb.append(content); //content between left boundary and whitespace
        for(int i = 0; i < WIDTH - content.length() - 3; i++) { //whitespace between content and right boundary
            sb.append(" ");
        }
        sb.append(this.boundaryChar); //right boundary character
        sb.append('\n'); //appends a newline
        contentLine = sb.toString(); //creates a string to return
        return contentLine;
    }
}
