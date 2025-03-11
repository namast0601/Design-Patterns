package org.namast.demo.state;

public class RejectedState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
