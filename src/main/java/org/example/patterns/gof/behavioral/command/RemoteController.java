package org.example.patterns.gof.behavioral.command;

public class RemoteController {
    Command commmand;

    public void pressButton() {
        this.commmand.execute();
    }

    public Command getCommmand() {
        return commmand;
    }

    public void setCommmand(Command commmand) {
        this.commmand = commmand;
    }
}
