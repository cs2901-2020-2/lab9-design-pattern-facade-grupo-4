package cs.lab;

public class Projector {
    Boolean state;
    public void turnOn() {
        this.state = Boolean.TRUE;
    }

    public void turnOff() {
        this.state = Boolean.FALSE;
    }

    public Boolean getState() {
        return state;
    }
}
