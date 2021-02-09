package duke.command;

import duke.DukeException;
import duke.Ui;
import duke.Storage;

import duke.task.TaskList;

public class DoneCommand implements Command {
    private int taskNum;

    public DoneCommand(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        if (this.taskNum > tasks.size()) {
            throw new DukeException("No such task exists!");
        }
        tasks.done(taskNum);

        ui.printMessage("Nice! I've marked this task as done:\n" + tasks.get(taskNum).toString());
    }
}
