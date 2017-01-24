package main.com.evilcorp.utils;

import main.com.evilcorp.Factory;
import main.com.evilcorp.Task;
import main.com.evilcorp.Working;

import java.io.FileWriter;

/**
 * Created by Robin on 23/01/2017.
 */
public class CSVFile {
    private static final String DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void generate(Factory factory) throws Exception {
        String csvFile = "./log.csv";
        FileWriter writer = new FileWriter(csvFile);

        for (Task taks: factory.getTasks()) {
            for (Working working: taks.getWorkingList()) {
                writer.append(taks.getNameTask());
                writer.append(DELIMITER);
                writer.append(taks.getDate());
                writer.append(DELIMITER);
                writer.append(working.getWorker().getName());
                writer.append(DELIMITER);
                writer.append(working.getActivity().toString());
                writer.append(DELIMITER);
                writer.append(String.valueOf(working.getStartHour()));
                writer.append(DELIMITER);
                writer.append(String.valueOf(working.getEndHour()));
                writer.append(NEW_LINE_SEPARATOR);
            }
        }
        writer.close();
    }
}
