package transport;

public class DamagedRover extends MarsRover {

    private int metersTraveled;
    private boolean fell;

    private static final int MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY = 10000;
    private static final int METERS_FROM_START_TO_CLIFF = 1000;
    private static final int N_SIMULATIONS = 500;

    public double getMetersTraveled() {
        return metersTraveled;
    }

    public boolean getFell() {
        return fell;
    }

    public void simulateStormDamageTravel() {
        setPosition(0, 0);
        metersTraveled = 0;
        fell = false;

        while (metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY) {
            
            int distanceNextTurn = 1 + (int) (4 * Math.random());
            boolean forwardNotBack = Math.random() > 0.5;

            move(distanceNextTurn, forwardNotBack);
            metersTraveled += distanceNextTurn;

            if (Math.abs(getXPosition()) >= METERS_FROM_START_TO_CLIFF) {
                fell = true;
                break;
            }
        }
    }

    private void move(double distance, boolean forward) {
        if (forward) {
            changePosition(distance, 0);
        } else {
            changePosition(-distance, 0);
        }
    }

    public static void main(String[] args) {
        DamagedRover rover = new DamagedRover();
        int fellCount = 0;

        for (int i = 0; i < N_SIMULATIONS; i++) {
            rover.simulateStormDamageTravel();

            if (rover.getFell()) {
                fellCount++;
            }
        }

        System.out.println(
            "Out of " + N_SIMULATIONS
            + " simulations, the rover fell off a cliff "
            + fellCount + " times."
        );
    }
}