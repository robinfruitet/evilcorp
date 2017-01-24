package main.com.evilcorp;

import main.com.evilcorp.activity.Activity;
import main.com.evilcorp.worker.Worker;

/**
 * Created by Robin on 23/01/2017.
 */
public class Working {
    private Worker worker;
    private Activity activity;
    private int startHour;
    private int endHour;

    public Working(Worker worker, Activity activity, int startHour, int endHour) {
        this.activity = activity;
        this.worker = worker;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Working{" +
                "worker=" + worker +
                ", activity=" + activity +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                '}';
    }
}
