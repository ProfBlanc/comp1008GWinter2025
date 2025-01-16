package wk2;

public class SeatingArrangement {

    String[] names;
    private int rows, columns, numberOfStudents,
            numberOfDeskBorderChars = 6,
    numberOfSpacesBetweenDesks = 2,
    numberOfTabs = 2,
    namesIndexTracker = -1;
    ;

    private char deskBorderChar = '*';
    private String defaultName = "John";

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
        String content = "";
        for(int i = 0; i < columns; i++)
            content += String.valueOf(deskBorderChar).repeat(numberOfDeskBorderChars)
                    + "\t".repeat(numberOfTabs);
        return content ;
    }





    public String writeName(){
        //return (defaultName + "\t".repeat(3)).repeat(columns);
        String content = "";
        for(int i = 0; i < columns; i++)
            content += names[++namesIndexTracker] + "\t".repeat(numberOfTabs);
        return content;
    }

    public String displaySeatingArrangement(){
        String content = "This is the seating arrangement";
        content += "\n";
        namesIndexTracker = -1;
        for(int i = 0; i < rows; i++) {
            content += writeDesk() + "\n";
            content += writeName() + "\n";
            content += writeDesk() + "\n";

            content += "\n".repeat(numberOfSpacesBetweenDesks);
        }

        return content;
    }




    public void setNames(String... names) {


        //System.out.println(names.getClass().getSimpleName());

        this.names = new String[getNumberOfStudents()];
        if(names.length != getNumberOfStudents()){
            System.out.println("Not enough names");
            for(int i = 0; i < getNumberOfStudents(); i++){
                this.names[i] = defaultName;
            }
        }
        else{
            for(int i = 0; i < names.length; i++){
                this.names[i] = names[i];
            }
        }

    }
}