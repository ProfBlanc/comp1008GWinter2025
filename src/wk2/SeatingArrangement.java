package wk2;

public class SeatingArrangement {

    enum Floor {BASEMENT, FIRST, SECOND, THIRD}  //enum aka list of constant
    private Floor floor = Floor.SECOND;
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

    public SeatingArrangement(){

        this(1, 1);
    }
    public SeatingArrangement(int rows, int columns) {
        setRows(rows);
        setColumns(columns);
        setNumberOfStudents();
        setNames();
    }
    public SeatingArrangement(int rows, int columns, String... names) {
        this(rows, columns);
        setNames(names);
    }


        //toString: a special method that is implicitly called when user outputs the object
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
        String content = "This is the seating arrangement.";
        content += "The classroom is located on " + floor + " floor";
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
            //System.out.println("Not enough names");
            for(int i = 0; i < getNumberOfStudents(); i++){
                this.names[i] = defaultName;
            }
        }
        else{
            for(int i = 0; i < names.length; i++){
                this.names[i] = formatName(names[i]);
            }
        }

    }

    public static SeatingArrangement SquaredLargeClass(int rowsAndColumns){

        return new SeatingArrangement(rowsAndColumns, rowsAndColumns);
    }
    private String formatName(String name){
            if(name.isEmpty())
                name = defaultName;
        return name.length() >= 4 ? name : name + " ".repeat(4 - name.length());
    }
    public void setSingleStudent(int index, String name){
        names[index] = formatName(name);
    }

    public static SeatingArrangement LargeClass(){
        return new SeatingArrangement(10, 10);
    }
    public static SeatingArrangement LargeClass(int rows, int columns){

        return new SeatingArrangement(Math.max(10, rows), Math.max(10, columns));
    }

    public static boolean isValidData(int numberOfStudents, int rows, int columns){
        return rows * columns >= numberOfStudents;
    }

    public void setFloor(String floor){

        this.floor = switch (floor.toUpperCase()){
            case "BASEMENT" -> Floor.BASEMENT;
            case "FIRST" -> Floor.FIRST;
            case "SECOND" -> Floor.SECOND;
            default -> Floor.THIRD;
        };



    }

    public static SeatingArrangement IncreaseClassSize(SeatingArrangement sa, int additionalRows){
        additionalRows = Math.max(1, additionalRows);
        int rows = sa.getRows() + additionalRows;
        int columns = sa.getColumns();
        String[] names = new String[rows * columns + columns * additionalRows];
        for(int i = rows * columns; i < names.length ; i++){
            names[i] = sa.defaultName;
        }

        return new SeatingArrangement(rows, columns, names);
    }

}