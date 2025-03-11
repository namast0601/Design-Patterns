package org.namast.demo.mediator_pattern;

public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}
