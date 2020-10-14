package cs.lab;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTheaterFacadeTest {
    static final Logger logger = Logger.getLogger(HomeTheaterFacadeTest.class.getName());    

    private HomeTheaterFacadeTest() {
    }

    // constructor (empty = true, boiled = false)
    @Test
    public void testCase0(){
        HomeTheaterFacade  homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.playMovie();

        assertEquals(Boolean.TRUE, homeTheaterFacade.getAmplifier().getAmplified());


    }

    // fill (empty = false, boiled = false)
    @Test
    public void testCase1() {

    }



}