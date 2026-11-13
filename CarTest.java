public class CarTest {
    private static void reportResult(String testName, boolean success) {
        IO.println((success ? "SUCCESS: " : "FAILURE: ") + testName);
    }

    /** Tests whether a Saab95 with turbo enabled
     *  gains more speed than one without.
     */
    private static void testTurbo() {
        Saab95 slowSaab = new Saab95();
        Saab95 fastSaab = new Saab95();
        fastSaab.setTurboOn();
        slowSaab.setTurboOff();
        fastSaab.gas(0.5);
        slowSaab.gas(0.5);
        boolean result = slowSaab.getCurrentSpeed() < fastSaab.getCurrentSpeed();
        reportResult("Turbo yields more speed", result);
        System.out.println("No turbo: " + slowSaab.getCurrentSpeed() +", Turbo: " + fastSaab.getCurrentSpeed());
    }


    /** tests the coordinates of the car on x and y-axis
    *   moves the car by an amount based on its relative speed
    * */

    private static void carPointLocation() {
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();
        volvo.startEngine();
        volvo.gas(1);
        System.out.println("Volvo Facing North," + " x position = " + volvo.getPosX() + "," + " y position = " + volvo.getPosY());

        for (int i = 0; i < 5; i++) ;
        {
            volvo.turnLeft();
            volvo.move();
            System.out.println("x position = " + volvo.getPosX() + "," + " y position = " + volvo.getPosY());
        }
        saab.startEngine();
        saab.gas(1);
        System.out.println("Saab Facing North," + " x position = " + saab.getPosX() + "," + " y position = " + saab.getPosY());

        for (int i = 0; i < 5; i++) {
            saab.turnRight();
            saab.move();
            System.out.println("x position = " + saab.getPosX() + "," + " y position = " + saab.getPosY());
        }
    }

    static void main() {
        testTurbo();
        carPointLocation();
        //TODO: add and run more test
    }
}

