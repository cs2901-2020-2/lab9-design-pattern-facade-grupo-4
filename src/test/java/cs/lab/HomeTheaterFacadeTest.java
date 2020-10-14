package cs.lab;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.nashorn.internal.AssertsEnabled;

public class HomeTheaterFacadeTest {
    static final Logger logger = Logger.getLogger(HomeTheaterFacadeTest.class.getName());    

    private HomeTheaterFacadeTest() {
    }

    @Test
    public void testCase0(){
        Item amplifier = new Amplifier();
        CDPlayer cdPlayer = new CDPlayer();
        DVDPlayer dvdPlayer = new DVDPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatherLights theatherLights = new TheatherLights();
        HomeTheaterFacade  homeTheaterFacade = new HomeTheaterFacade(amplifier, cdPlayer, dvdPlayer, popcornPopper, projector, screen, theatherLights);
        homeTheaterFacade.playMovie();
        assertEquals(Boolean.TRUE, homeTheaterFacade.getAmplifier().getAmplified());
        assertEquals(Boolean.TRUE, homeTheaterFacade.getCdPlayer().getState());
        assertEquals(Boolean.TRUE, homeTheaterFacade.getDvdPlayer().getState());
        assertEquals(Boolean.TRUE, homeTheaterFacade.getProjector().getState());
        assertEquals(Boolean.TRUE, homeTheaterFacade.getScreen().getRolls());
        homeTheaterFacade.endMovie();
        assertEquals(Boolean.FALSE, homeTheaterFacade.getAmplifier().getAmplified());
        assertEquals(Boolean.FALSE, homeTheaterFacade.getCdPlayer().getState());
        assertEquals(Boolean.FALSE, homeTheaterFacade.getDvdPlayer().getState());
        assertEquals(Boolean.FALSE, homeTheaterFacade.getProjector().getState());
        assertEquals(Boolean.FALSE, homeTheaterFacade.getScreen().getRolls());
    }

    @Test
    public void testCase1() {
        Amplifier amplifier = new Amplifier();
        Integer volumeLevel = 12;
        amplifier.setVolume(volumeLevel);
        assertEquals(volumeLevel, amplifier.getVolume());
    }

    @Test
    public void testCase2(){
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.turnOn();
        cdPlayer.stopOn();
        cdPlayer.ejectOn();
        assertEquals(Boolean.TRUE, cdPlayer.getEject());
        assertEquals(Boolean.TRUE, cdPlayer.getState());
        assertEquals(Boolean.TRUE, cdPlayer.getStop());
        cdPlayer.turnOff();
        cdPlayer.stopOff();
        cdPlayer.ejectOff();
        assertEquals(Boolean.FALSE, cdPlayer.getEject());
        assertEquals(Boolean.FALSE, cdPlayer.getState());
        assertEquals(Boolean.FALSE, cdPlayer.getStop());
    }



}