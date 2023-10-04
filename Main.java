
public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        System.out.println("Student 1 Info:");
        student1.displayInfo();

 
        Student student2 = new Student("Alice", 18, 'A');
        System.out.println("\nStudent 2 Info:");
        student2.displayInfo();

     
        Student student3 = new Student("Bob", 20);
        System.out.println("\nStudent 3 Info:");
        student3.displayInfo();
    }
}
