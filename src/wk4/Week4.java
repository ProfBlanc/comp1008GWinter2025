package wk4;

public class Week4 {

    public static void main(String[] args) {

        FightingGame game = new FightingGame(new Fighter("Batman", 5, 35),
                new Fighter("Superman", 6, 36)
                );
        System.out.println(game.getFightSummary());

//        Fighter fighter = new Fighter();
//
//        String s;
//        try {
//            fighter.setHealth(-1);
//        }
//        catch (Exception e){
//            System.err.println( e.getClass().getSimpleName() + ":" + e.getMessage());
//        }
    }
}
