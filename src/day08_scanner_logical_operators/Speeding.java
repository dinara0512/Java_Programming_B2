package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {
        double currentSpeed =40;
        double speedLimit = 25;
        boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.println("You are in school zone. Are you speeding? " + isSpeeding);

    }
}
