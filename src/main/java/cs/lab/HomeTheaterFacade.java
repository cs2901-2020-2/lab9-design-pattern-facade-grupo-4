package cs.lab;

public class HomeTheaterFacade {
    Item amplifier;
    CDPlayer cdPlayer;
    DVDPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheatherLights theatherLights;

    public HomeTheaterFacade(
        Item amplifier,
        CDPlayer cdPlayer,
        DVDPlayer dvdPlayer,
        PopcornPopper popcornPopper,
        Projector projector,
        Screen screen,
        TheatherLights theatherLights){
            
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theatherLights = theatherLights;
    }

    public HomeTheaterFacade(){}

    public void playMovie() {
        amplifier.turnOn();
        dvdPlayer.turnOn();
        cdPlayer.turnOn();
        projector.turnOn();
        screen.rollDown();
        theatherLights.turnOn();
        popcornPopper.turnOn();
    }

    public void endMovie() {
        amplifier.turnOff();
        dvdPlayer.turnOff();
        cdPlayer.turnOff();
        projector.turnOff();
        screen.rollUp();
        theatherLights.dimLights(20);
        popcornPopper.turnOff();
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public PopcornPopper getPopcornPopper() {
        return popcornPopper;
    }

    public Projector getProjector() {
        return projector;
    }

    public Screen getScreen() {
        return screen;
    }

    public TheatherLights getTheatherLights() {
        return theatherLights;
    }
}
