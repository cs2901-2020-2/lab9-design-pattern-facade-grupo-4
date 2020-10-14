package cs.lab;

public interface Item {
    public void turnOn();

    public void turnOff();

    public void setSource(String source);

    public void setVolume(Integer volume);

    public Boolean getAmplified();

    public String getSource();

    public Integer getVolume();
}
