import java.awt.*;

public class Volvo240 extends car{

    public final static double trimFactor = 1.25;
    
    public Volvo240() {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }
    
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to assignment instructions
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to assignment instructions
    public void brake(double amount) {
        decrementSpeed(amount);
    }
}
