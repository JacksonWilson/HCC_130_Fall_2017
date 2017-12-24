package labs.lab28;

import java.io.IOException;

import utils.KeyboardReader;

public class Driver {

    public static void main(String[] args) {
        try {
            KeyboardReader keyReader = KeyboardReader.getInstance();

            HCCStudent[] students = getStudents(keyReader);

            int selection;
            while ((selection = keyReader.readInt(1, 3, "1. View all students\n2. Change the data for a student\n3. Exit\n: ")) != 3) {
                switch (selection) {
                case 1:
                    printStudents(students);
                    break;
                case 2:
                    changeStudentData(students[keyReader.readInt(0, students.length, "Enter student index: ")], keyReader);
                    break;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static HCCStudent[] getStudents(KeyboardReader keyReader) throws IOException {
        HCCStudent[] students = new HCCStudent[keyReader.readPositiveInt("Enter number of students: ")];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter data for student #" + i + " of " + students.length);
            students[i] = new HCCStudent(keyReader.readDouble("GPA: "), keyReader.readLong("Number of credits: "), keyReader.readLine("Name: "));
            System.out.println();
        }
        return students;
    }

    private static void printStudents(HCCStudent[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + i);
            students[i].printData();
            System.out.println();
        }
    }

    private static void changeStudentData(HCCStudent student, KeyboardReader keyReader) throws IOException {
        student.setGPA(keyReader.readDouble("Enter new GPA: "));
        student.setNumberOfCredits(keyReader.readLong("Enter new number of credits: "));
    }
}