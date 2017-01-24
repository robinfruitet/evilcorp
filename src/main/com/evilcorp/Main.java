package main.com.evilcorp;

import main.com.evilcorp.activity.Activity;
import main.com.evilcorp.utils.CSVFile;
import main.com.evilcorp.utils.GetDate;
import main.com.evilcorp.utils.JSONFile;
import main.com.evilcorp.worker.Worker;
import main.com.evilcorp.worker.impl.Human;
import main.com.evilcorp.worker.impl.Robot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Robin on 03/01/2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Task task = null;

        if ("--file".equals(args[1])) {
            JSONFile.generateJson(args[2]);
        }

        String taskName = args[2];
        String activity = args[4];
        String startHour= args[5];
        String endHour= args[6];
        String date = GetDate.stringDate(args[7]);

        if ("activity".equals(args[1])) {
            Human human = new Human(args[3]);
            task = TaskFactory.registerNewTask(taskName, human, activity, startHour, endHour, date);

        } else if ("robot".equals(args[1])) {
            Robot robot = new Robot(args[3]);
            task = TaskFactory.registerNewTask(taskName, robot, activity, startHour, endHour, date);
        }

        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        Factory factory = new Factory(taskList);
        try {
            CSVFile.generate(factory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
