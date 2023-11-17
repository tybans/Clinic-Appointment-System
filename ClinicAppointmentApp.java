import java.util.ArrayList;
import java.util.Scanner;

class Visitor {
    private String name;
    private int age;
    private String appointmentDate;
    private String appointmentTime;

    // Constructor
    public Visitor(String name, int age, String appointmentDate, String appointmentTime) {
        this.name = name;
        this.age = age;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    // Display Visitor details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println();
    }
}

class ClinicAppointmentSystem {
    private ArrayList<Visitor> visitorList;

    // Constructor
    public ClinicAppointmentSystem() {
        this.visitorList = new ArrayList<>();
    }

    // Add new Visitor
    public void addVisitor(Visitor visitor) {
        visitorList.add(visitor);
        System.out.println("Visitor added successfully!");
    }

    // View list of all Visitors
    public void viewAllVisitors() {
        System.out.println("List of All Visitors:");
        for (Visitor visitor : visitorList) {
            visitor.displayDetails();
        }
    }


}

public class ClinicAppointmentApp {
    public static void main(String[] args) {
        ClinicAppointmentSystem clinicSystem = new ClinicAppointmentSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. View list of all Visitors");
            System.out.println("2. Add new Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    clinicSystem.viewAllVisitors();
                    break;
                case 2:
                    System.out.print("Enter Visitor Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Visitor Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Appointment Date: ");
                    String appointmentDate = scanner.nextLine();
                    System.out.print("Enter Appointment Time: ");
                    String appointmentTime = scanner.nextLine();

                    Visitor newVisitor = new Visitor(name, age, appointmentDate, appointmentTime);
                    clinicSystem.addVisitor(newVisitor);
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
