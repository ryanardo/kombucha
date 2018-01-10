package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class KombuchaTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void CreateApple() {
        Kombucha apple = new Kombucha("TEST_REVIEW", "apple") ;
        assertEquals(1, Kombucha.getAllApple().size());
    }

    @Test
    public void CreateGrape() {
        Kombucha grape = new Kombucha("TEST_REVIEW", "grape") ;
        assertEquals(1, Kombucha.getAllGrape().size());
    }

}