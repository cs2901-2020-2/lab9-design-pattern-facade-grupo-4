package cs.lab;

public class Amplifier implements Item{
    Boolean amplified;
    String source;
    Integer volume;

    public void turnOn() {
        this.amplified = Boolean.TRUE;
    }

    public void turnOff() {
        this.amplified = Boolean.FALSE;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getAmplified() {
        return amplified;
    }

    public String getSource() {
        return source;
    }

    public Integer getVolume() {
        return volume;
    }

}