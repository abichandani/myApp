package com.playground.myapp.play;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class AbsChildTest {

    // System Under Test (sut)
    private static class AbsChildWrapper extends AbsChild {
        // provide methods and constructors from AbsChild required to be overidden
    }

    @Test
    public void testCalculatePayments(){

        AbsChildWrapper sut = Mockito.spy(new AbsChildWrapper());
        Mockito.when(sut.calculate(ArgumentMatchers.anyString())).thenReturn("test method called");

        String result = sut.calculatePayments("abc", "xyz");
        Assertions.assertEquals("test method called", result);
    }
}
