package org.namast.demo.command_pattern;

public interface Command {
    void undo();

    void redo();
}
