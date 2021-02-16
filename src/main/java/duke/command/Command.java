package duke.command;

import duke.Storage;
import duke.task.TaskList;

/**
 * Represents a command to duke
 */
public interface Command {
    /**
     * Checks if the command is an exit command
     * @return True if is an exit command, false otherwise
     */
    public boolean isExit();

    /**
     * Executes the command
     * @param tasks List of tasks to operate on
     * @param storage Storage manager for loading and saving task files
     */
    public String getResponString(TaskList tasks, Storage storage);
}
