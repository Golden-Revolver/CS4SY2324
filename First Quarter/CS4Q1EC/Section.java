package cs4q1ec;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class Section {
    private String name;
    private ArrayList<Student> students = new ArrayList();
    
    public Section(String name) {
        this.name = name;
    }
    
    // getter methods
    public String getName() {
        return name;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public void removeStudent(Student s) {
        students.remove(s);
    }
    
    @Override
    public String toString() {
        return name;
    }
}
