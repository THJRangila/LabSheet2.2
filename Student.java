
class Student {
    
    private String name;
    private int age;
    private char grade;

  
    public Student() {
       
        name = "Unknown";
        age = 0;
        grade = 'N';
    }


    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

