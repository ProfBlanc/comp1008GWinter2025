package wk4;

/**
 * This is our cool Fighter class
 * @author Ben
 * @since 2025-01-30
 * @version 1.0
 *
 * @implNote This is how to implement the class
 *
 * @implSpec These are the specs of the class
 *
 *
 * */

public class Fighter {

    private String name;
    private double power, health;

    private enum SpecialMove {DOUBLE_POWER, BLOCK_SHIELD, NONE}

    private SpecialMove specialMove = SpecialMove.NONE;

    public static final int MIN_LENGTH_NAME = 3,
            MAX_LENGTH_NAME = 10, MIN_HEALTH = 30, MAX_HEALTH = 50, MIN_POWER = 5, MAX_POWER = 10;

    //constructors (3 & 4-args), getters and setters for all instance variables
    //toString, isAlive, factoryMethods: Weak & String Fighter: sets all values to
    //lowest or highest


    public String getName() {
        return name;
    }

    /**
     * This is the setter for the Fighter class
     *
     * @param name The name of the fighter
     * @throws IllegalArgumentException if name is less than 3 or greater than 10
     */
    public void setName(String name) {
        if (name.length() < MIN_LENGTH_NAME)
            throw new IllegalArgumentException(name + " is too short. Name must " +
                    "be at least " + MIN_LENGTH_NAME + " characters.");
        if (name.length() > MAX_LENGTH_NAME)
            throw new IllegalArgumentException(name + " is too long. Name must " +
                    "be at no more than " + MAX_LENGTH_NAME + " characters.");

        this.name = name;
    }

    /**
     * This is the getter for Power
     *
     * @return the value of power
     */
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power >= MIN_POWER && power <= MAX_POWER)
            this.power = power;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if (health < MIN_HEALTH || health > MAX_HEALTH)
            throw new IllegalArgumentException(health + " is invalid");
        this.health = health;
    }

    public SpecialMove getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = switch (specialMove.toUpperCase()) {
            case "DOUBLE_POWER" -> SpecialMove.DOUBLE_POWER;
            case "BLOCK_SHIELD" -> SpecialMove.BLOCK_SHIELD;
            default -> SpecialMove.NONE;
        };
    }

    public boolean isAlive() {
        return health > 0;
    }

    public Fighter(String name, double power, double health, String specialMove) {
        setName(name);
        setPower(power);
        setHealth(health);
        setSpecialMove(specialMove);
    }

    public Fighter(String name, double power, double health) {
        this(name, power, health, SpecialMove.NONE.toString());
    }

    public Fighter() {
    }

    public static Fighter WeakPlayer() {
        return new Fighter("WeakPlayer", MIN_POWER, MIN_HEALTH);
    }

    public static Fighter StrongPlayer(){
        return new Fighter("StrongPlayer", MAX_POWER, MAX_HEALTH, SpecialMove.DOUBLE_POWER.toString());
    }

}
