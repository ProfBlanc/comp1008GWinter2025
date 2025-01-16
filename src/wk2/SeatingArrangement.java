package wk2;

public class SeatingArrangement {

    String[] names;
    private int rows, columns, numberOfStudents,
            numberOfDeskBorderChars = 6,
    numberOfSpacesBetweenDesks = 2;

    private char deskBorderChar = '*';

    //constructor: an official request to INSTANTIATE (initialize, create, order) an instance of
    //this class
    //public same name of class: params needed to run an instance of this class

    public SeatingArrangement(int rows, int columns) {
        setRows(rows);
        setColumns(columns);
        setNumberOfStudents();
    }
        //toString: a special method that is implicitly called when user outputs the objecgt
        //summarize the values of the object
    public String toString(){

        return String.format("Rows=%d, Columns=%d", rows, columns);
    }

    private void setRows(int rows){
        this.rows = Math.max(1, rows);
    }

    private void setColumns(int columns){
        this.columns = Math.max(1, columns);
    }
    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }

    //right-click OR press alt+insert
    //choose the item Generate....
    //choose getters and setters
    //chose the private instance variables for which you want to generate setters and getters

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    private void setNumberOfStudents() {
        this.numberOfStudents = rows * columns;
    }

    public int getNumberOfDeskBorderChars() {
        return numberOfDeskBorderChars;
    }

    public void setNumberOfDeskBorderChars(int numberOfDeskBorderChars) {
        this.numberOfDeskBorderChars = numberOfDeskBorderChars;
    }

    public int getNumberOfSpacesBetweenDesks() {
        return numberOfSpacesBetweenDesks;
    }

    public void setNumberOfSpacesBetweenDesks(int numberOfSpacesBetweenDesks) {
        this.numberOfSpacesBetweenDesks = numberOfSpacesBetweenDesks;
    }

    public char getDeskBorderChar() {
        return deskBorderChar;
    }

    public void setDeskBorderChar(char deskBorderChar) {
        this.deskBorderChar = deskBorderChar;
    }
    public String writeDesk(){
        return deskBorderChar + "";
    }
    public String writeName(){
        return "Ben";
    }
    public String displaySeatingArrangement(){
        String content = "This will display the seating arrangement";
        content = "\n";
        content +=writeDesk();
        content +=writeName();
        content +=writeDesk();

        return content;
    }

}