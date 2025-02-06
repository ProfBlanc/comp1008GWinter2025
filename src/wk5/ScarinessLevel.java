package wk5;

public interface ScarinessLevel {

    int MAX_LEVEL = 10;
    int MIN_LEVEL = 1;

    double dangerLevel(int lastTimeAnimalHasEaten);
}
