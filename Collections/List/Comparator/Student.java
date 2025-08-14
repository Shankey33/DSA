class Student{

    // Attributes for name and GPA
    private String name;
    private double gpa;

    // Constructor to initialize name and gpa
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    // Getters for name and gpa
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return ("Name =  "+ name + ", gpa = " + gpa);
    }
} 