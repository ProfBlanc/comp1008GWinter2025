package wk4;

import java.util.ArrayList;
import java.util.Random;

public class FightingGame {

    private String title;
    private ArrayList<Fighter> fighters = new ArrayList<Fighter>();
    private Fighter winner;
    private StringBuilder sb = new StringBuilder();

    public String getFightSummary(){
        return sb.toString();
    }
    private boolean isGameOver(){

        return fighters.size() == 2 &&
                !fighters.get(0).isAlive() || !fighters.get(1).isAlive();
    }

    public FightingGame(Fighter player1, Fighter player2){
        fighters.add(player1);
        fighters.add(player2);
        setTitle();
        fight();
    }
    private void setTitle(){
        title = String.format("Welcome to today's fight between %s and %s. " +
                "Ladies and gentlemen, let's get ready to rummmmmmmmbbbbbbbbbblllllle!",
                fighters.get(0).getName(), fighters.get(1).getName()
                );
    }
    private String getTitle(){
        return title;
    }
    private void fight(){

        Random random = new Random();
        int whoWillAttack, whoIsBeingAttacked;
        Fighter attacker, victim;


        sb.append(getTitle());
        sb.append("\n");
        sb.append("Fighter 1 = ");
        sb.append(fighters.getFirst());
        sb.append("Fighter 2 = ");
        sb.append(fighters.getLast());
        sb.append("\n");


        while(!isGameOver()){
             whoWillAttack = random.nextInt(fighters.size());
             whoIsBeingAttacked = whoWillAttack == 0 ? 1 : 0;

             attacker = fighters.get(whoWillAttack);
             victim = fighters.get(whoIsBeingAttacked);

             victim.attacked(attacker.getPower());
             sb.append(String.format(
                     "%s attacked %s. %s health is now at %.1f\n",
                     attacker.getName(), victim.getName(), victim.getName(), victim.getHealth())
             );
        }
        winner = fighters.getFirst().isAlive() ? fighters.getFirst() : fighters.getLast();

        sb.append(winner.getName() + " won the fight! (Disclaimer: in fighting, no one is a winner)");
    }

}
