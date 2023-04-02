package org.example.patterns.gof.behavioral.command;

public class OffCommand implements Command {
    Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.off();
    }
}
