package cs4q1ec;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class CS4Q1EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating class instances
        Teacher t1 = new Teacher("Pumpkin", "Mathematics");
        Teacher t2 = new Teacher("Tuna", "Statistics");
        Teacher t3 = new Teacher("Shrimp", "Research");
        
        Section c1 = new Section("Proton");
        Section c2 = new Section("Neutron");
        
        Assignment a1 = new Assignment("Research proposal", 2);
        Assignment a2 = new Assignment("Math homework", 3);
        Assignment a3 = new Assignment("Lab activity", 5);
        
        Student s1 = new Student("Gold");
        Student s2 = new Student("Silver");
        Student s3 = new Student("Bronze");
        
        // linking classes
        t1.addSection(c1);
        t1.addSection(c2);
        t2.addSection(c2);
        t3.addSection(c1);
        
        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s3);
        
        // given code
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        s2.finishAssignment(a1);
        
        System.out.printf("%s remaining work: %.2f%n", 
                s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", 
                s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s remaining work: %.2f%n", 
                s3.getName(), s3.getTimeNeeded());  
    }
    
}
