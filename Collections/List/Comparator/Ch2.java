import java.util.ArrayList;
import java.util.List;

class Ch2{
    
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.8));
        students.add(new Student("Charlie", 3.2));

        // Sorting students by GPA in descending order using a lambda expression
        
        // o1 - Alice o2 - bob
        // we need bob to come after alice since her grade is higher, this can be done by a +1 value of comparison
        // o2 - o1 will result in +1 and thus bob will come after alice

        /*
        students.sort((o1, o2) -> {
                
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1; 
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1; 
            } else {
                return 0;
            }
            }
        );
        */
        
        // shorthand way of doing it
        students.sort((o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()));



        for (Student student : students) {
            System.out.println(student);
        }
    }

}