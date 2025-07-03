import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;

    Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class Node {
    Student data;
    Node next;

    Node(Student data) {
        this.data = data;
        this.next = null;
    }
}

public class StudentRecordManagement {
    private Node head;

    public StudentRecordManagement() {
        this.head = null;
    }

    // Add at the beginning
    public void addAtBeginning(Student student) {
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addAtEnd(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(Student student, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addAtBeginning(student);
            return;
        }

        Node newNode = new Node(student);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search by Roll Number
    public Student searchByRollNumber(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.rollNumber == rollNumber) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null; // not found
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        Node temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            Student s = temp.data;
            System.out.println("Roll Number: " + s.rollNumber + ", Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade);
            temp = temp.next;
        }
    }

    // Update grade based on Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + rollNumber);
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement sr = new StudentRecordManagement();
        Scanner sc = new Scanner(System.in);
        int choice, rollNumber, age;
        String name, grade;
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Display All Records");
            System.out.println("7. Update Student's Grade");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    sr.addAtBeginning(new Student(rollNumber, name, age, grade));
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    sr.addAtEnd(new Student(rollNumber, name, age, grade));
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    grade = sc.nextLine();
                    sr.addAtPosition(new Student(rollNumber, name, age, grade), position);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    rollNumber = sc.nextInt();
                    sr.deleteByRollNumber(rollNumber);
                    break;

                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    rollNumber = sc.nextInt();
                    Student s = sr.searchByRollNumber(rollNumber);
                    if (s != null) {
                        System.out.println("Student Found: Roll Number: " + s.rollNumber + ", Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 6:
                    sr.displayAll();
                    break;

                case 7:
                    System.out.print("Enter Roll Number: ");
                    rollNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Grade: ");
                    grade = sc.nextLine();
                    sr.updateGrade(rollNumber, grade);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}