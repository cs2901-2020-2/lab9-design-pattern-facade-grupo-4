package cs.lab;

public class Screen {
    Boolean rolls;

    public void rollDown() {
        this.rolls = Boolean.TRUE;
    }

    public void rollUp() {
        this.rolls = Boolean.FALSE;
    }

    public Boolean getRolls() {
        return rolls;
    }
}