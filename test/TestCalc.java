/*
 * File:TestInput.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-05-11
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MainModel;

public class TestCalc {
    MainModel mainModel = new MainModel();

    @Before
    public void setUp(){
        mainModel = new MainModel();
    
    }

    @Test
    public void testCalcRecVol(){
        Double vol = mainModel.calcVolume(10,10,10);
        assertEquals(vol, 1000.0);
    
    }

    @Test
    public void testCalcRecVol2(){
        Double vol = mainModel.calcVolume(-10,10,10);
        assertEquals(vol, -1000.0);

    }

    @Test
    public void testCalcRecVol3(){
        Double vol = mainModel.calcVolume(0,100,10);
        assertEquals(vol, 0.0);

    }

    @Test
    public void testCalcRecVol4(){
        Double vol = mainModel.calcVolume(345,-600,10);
        assertEquals(vol, -2070000.0);

    }

}
