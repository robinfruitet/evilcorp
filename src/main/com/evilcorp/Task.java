package main.com.evilcorp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 03/01/2017.
 */
public class Task {

    private String nameTask;
    private String date;
    private List<Working> workingList;

    public Task() {
    }

    public Task(String nameTask, String date, List<Working> workingList) {
        this.nameTask = nameTask;
        this.date = date;
        this.workingList = workingList;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Working> getWorkingList() {
        return workingList;
    }

    public void setWorkingList(List<Working> workingList) {
        this.workingList = workingList;
    }

    @Override
    public String toString() {
        return "Task{" +
                "date='" + date + '\'' +
                ", workingList=" + workingList +
                '}';
    }
}
