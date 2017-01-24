package main.com.evilcorp;

import java.util.List;

/**
 * Created by Robin on 03/01/2017.
 */
public class Factory {

    private List<Task> tasks;

    public Factory() {
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Factory(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "tasks=" + tasks +
                '}';
    }
}
