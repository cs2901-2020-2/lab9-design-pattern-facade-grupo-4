package cs.lab;

public class CDPlayer {
    Boolean state;
    Boolean stop;
    Boolean eject;

    public void turnOn() {
        this.state = Boolean.TRUE;
    }

    public void turnOff() {
        this.state =Boolean.FALSE;
    }

    public void stopOn() {
        this.stop = Boolean.TRUE;
    }

    public void stopOff() {
        this.stop = Boolean.FALSE;
    }

    public void ejectOn() {
        this.eject = Boolean.TRUE;
    }

    public void ejectOff() {
        this.eject = Boolean.FALSE;
    }


    public Boolean getState() {
        return state;
    }

    public Boolean getStop() {
        return stop;
    }

    public Boolean getEject() {
        return eject;
    }
}