package cs4q1ec;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class Teacher {
    private String name, subject;
    private ArrayList<Section> sections = new ArrayList();
    
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    // getter methods
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public ArrayList<Section> getSections() {
        return sections;
    }
    
    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void addSection(Section c) {
        sections.add(c);
    }
    
    public void removeSection(Section c) {
        sections.remove(c);
    }
    
    public void giveAssignment(Assignment a) {
        for (Section c : sections) {
            for (Student s : c.getStudents()) {
                s.getAssignments().add(a);
            }
        }
    }
}
