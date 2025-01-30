package wk4;

public class Week4 {

    public static void main(String[] args) {

        Fighter fighter = new Fighter();

        String s;
        try {
            fighter.setHealth(-1);
        }
        catch (Exception e){
            System.err.println( e.getClass().getSimpleName() + ":" + e.getMessage());
        }
    }
}
