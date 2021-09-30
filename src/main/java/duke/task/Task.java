package duke.task;

public abstract class Task {
    private final String name;
    private Boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public String getName() {
        return name;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public void markAsDone() {
        isDone = true;
    }

    public abstract TaskType getTaskType();

    public abstract String getTime();

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + getName();
    }

    public abstract String getStandardTime();
}
