package wk5;

public class Wolf extends Canine implements ScarinessLevel, Arm {


    @Override
    public double swing() {
        return 0.5; //Why? Why not!
    }

    @Override
    public boolean isBent() {
        return true;
    }

    @Override
    public boolean isInFist() {
        return true;
    }

    @Override
    public void wave() {
        System.out.println("Wolves do not wave!");
    }

    @Override
    public double punch(String objectOrPerson) {
        return MAX_LEVEL;
    }

    @Override
    public double dangerLevel(int lastTimeAnimalHasEaten) {

        if(lastTimeAnimalHasEaten < 3){
            return MIN_LEVEL;
        } else if (lastTimeAnimalHasEaten < 10) {
            return MAX_LEVEL / 2.0;
        }
        return MAX_LEVEL;

    }
}
