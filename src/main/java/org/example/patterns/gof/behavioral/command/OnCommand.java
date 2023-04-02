package org.example.patterns.gof.behavioral.command;

public class OnCommand implements Command {
    Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.on();
    }
}
