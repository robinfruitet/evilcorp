package main.com.evilcorp;

import main.com.evilcorp.activity.Activity;
import main.com.evilcorp.worker.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 24/01/2017.
 */
public class TaskFactory {

    public static Task registerNewTask(String taskName, Worker worker, String act, String startH, String endH, String date) {
        Task task = new Task();

        Activity activity = stringToActvity(act);
        int startHour = Integer.parseInt(startH);
        int endHour = Integer.parseInt(endH);

        Working working = new Working(worker, activity, startHour, endHour);
        List<Working> workingList = new ArrayList<>();
        workingList.add(working);

        task.setNameTask(taskName);
        task.setDate(date);
        task.setWorkingList(workingList);

        return task;
    }

    private static Activity stringToActvity(String act) {
        if (act.equals("Eat"))
            return Activity.EAT;
        else if (act.equals("Work"))
            return Activity.WORK;
        else if (act.equals("Standby"))
            return Activity.STANDBY;
        else if (act.equals("Sleep"))
            return Activity.SLEEP;
        else
            return Activity.OTHER;
    }

}
