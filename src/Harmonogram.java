import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Harmonogram {
    ArrayList<String> lekcje;
    ArrayList<String> nauczyciele;
    ArrayList<String> sale;
    ArrayList<String> godziny;
    private static Map<Integer, String> harmonogramMap = new HashMap<>();

    public static void getHarmonogram(int studentID) {
        // Implement the logic for retrieving and displaying the schedule/harmonogram for a student
        // This could include fetching data from a database or other data source.
        System.out.println("Harmonogram for student with ID " + studentID + ": ");
        // Add logic to print the schedule based on the student ID
        if (harmonogramMap.containsKey(studentID)) {
            System.out.println("Harmonogram for student with ID " + studentID + ": ");
            System.out.println(harmonogramMap.get(studentID));
        } else {
            System.out.println("Harmonogram not available for student with ID " + studentID);
        }
    }

    // czytanie z plikow i logika wyboru pliku


/*
    Dynamic Schedule: Instead of a static schedule, you could dynamically generate a schedule based on subjects, teachers, and time slots.
            Reminders: Implement a system to send reminders to students for upcoming classes or events.
    // Additional method to update or set the harmonogram for a student */
    public static void setHarmonogram(int studentID, String schedule) {
        harmonogramMap.put(studentID, schedule);
    }
}
