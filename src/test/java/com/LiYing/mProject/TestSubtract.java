package com.LiYing.mProject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubtract{
    @Test
    void subtract() {
        Calc  subCalc=new Calc();
        assertEquals(-1,subCalc.subtract(1,2));
    }
}