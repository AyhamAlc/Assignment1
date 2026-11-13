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
    private static void volvoPointLocation(){
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.gas(1);
        System.out.println("Facing North," + " x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
    }

    private static  void saabPointLocation(){
        Saab95 car = new Saab95();
        car.setTurboOn();
        car.startEngine();
        car.gas(1);
        System.out.println("Facing North," + " x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
        car.turnLeft();
        car.move();
        System.out.println("x position = " + car.getPosX() + "," + " y position = " + car.getPosY());
    }

    static void main() {
        testTurbo();
        volvoPointLocation();
        saabPointLocation();
        //TODO: add and run more test
    }
}

