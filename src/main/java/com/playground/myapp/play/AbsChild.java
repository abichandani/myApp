package com.playground.myapp.play;

public abstract class AbsChild extends Play {

    public String calculatePayments(String abc, String xyz){

        return doSomething(abc);
    }

    private String doSomething(String abc){

        return super.calculate(abc);
    }
}
