package com.LiYing.mProject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc{

    @Test
    void add() {
        Calc  addCalc=new Calc();
        assertEquals(3,addCalc.add(1,2));
    }
/*
    @Test
    void subtract() {
        Calc  subCalc=new Calc();
        Assert.assertEquals(-1,subCalc.subtract(1,2));
    }
 */
}