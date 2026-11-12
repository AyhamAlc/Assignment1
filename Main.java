public class Main {
    public static void main(String[] args) {
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
}