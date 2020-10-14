package cs.lab;

public class PopcornPopper {
    Boolean state;
    Boolean pop;

    public void turnOn() {
        this.state = Boolean.TRUE;
    }

    public void turnOff() {
        this.state = Boolean.FALSE;
    }

    public void popOn() {
        this.pop = Boolean.TRUE;
    }

    public void popOff() {
        this.pop = Boolean.FALSE;
    }

    public Boolean getState() {
        return state;
    }

    public Boolean getPop() {
        return pop;
    }
}