package FirstOOPIntroduction.Lecture.Ferrari;

public class Ferrari implements Car {
    private String driver;
    private final String model = "488-Spider";

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String pushBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.model,this.pushBrakes(),this.pushGas(),this.driver);
    }
}
