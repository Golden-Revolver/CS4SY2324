package cs4q1ec;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class Student {
    private String name;
    private ArrayList<Assignment> assignments = new ArrayList();
    
    public Student(String name) {
        this.name = name;
    }
    
    // getter methods
    public String getName() {
        return name;
    }
    
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }
    
    public double getTimeNeeded() {
        double time = 0;
        for (Assignment a : assignments) {
            time += a.getTimeAlloted();
        }
        return time;
    }
    
    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void giveAssignment(Assignment a) {
        assignments.add(a);
    }
        
    public void finishAssignment(Assignment a) {
        assignments.remove(a);
    }
    
    @Override
    public String toString() {
        return name;
    }
}
