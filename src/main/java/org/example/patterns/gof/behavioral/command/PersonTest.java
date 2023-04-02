package org.example.patterns.gof.behavioral.command;

// Adv of CommandPattern is Invoker(RemoteController) is completely decoupled from Receiver (Television)
public class PersonTest {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteController remoteController = new RemoteController();

        Command command = new OnCommand(television);
        remoteController.setCommmand(command);
        remoteController.pressButton();

        command = new OffCommand(television);
        remoteController.setCommmand(command);
        remoteController.pressButton();

    }
}
