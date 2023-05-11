/*
 * File:TestInput.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-05-11
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

import controllers.MainController;

public class TestInput {
    MainController mainController;

    @Before
    public void setUp(){
        mainController = new MainController();
    }

    @Test
    public void testInputCheck1(){
        Boolean inp = mainController.inputCheck("m");
        assertFalse(inp);
    }
    @Test
    public void testInputCheck2(){
        Boolean inp = mainController.inputCheck("7");
        assertTrue(inp);
    }
    @Test
    public void testInputCheck3(){
        Boolean inp = mainController.inputCheck("3");
        assertFalse(inp);
    }
    @Test
    public void testInputCheck4(){
        Boolean inp = mainController.inputCheck("-1a");
        assertFalse(inp);
    }
    @Test
    public void testInputCheck5(){
        Boolean inp = mainController.inputCheck("1.12");
        assertTrue(inp);
    }
    
}
