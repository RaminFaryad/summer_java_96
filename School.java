import java.io.*;
import java.util.*;

public class School{
 public School(String _name){ name= _name; }
 public School(String _name, ArrayList<String> houses, ArrayList<String> courses,ArrayList<Integer> years, Vector<String> students, Vector<String> professors)
  {
    name =_name;
    houseNames = houses;
    courseNames = courses;
    studentNames = students;
    professorNames = professors;
  }
 public String getName(){return name;}
 public ArrayList<String> getCourseNames(){return courseNames;}
 public ArrayList<String> getHouseNames(){return houseNames; }
 public Vector<String> getStudentNames(){return studentNames;}
 public Vector<String> getProfessorNames(){return professorNames;}
 public void setCourseNames(ArrayList<String> courses){ courseNames=courses ;}
 public void setHouseNames(ArrayList<String> houses){ houseNames = houses ;}
 public void setStudentNames(Vector<String>students){studentNames =students ; }
 public void setProfessorNames(Vector<String>professors){professorNames = professors ; }
 private ArrayList<Integer> years;
 private String name;
 private int numOfStudents;
 private boolean housed;
 private ArrayList<String> houseNames;
 private Vector<String> studentNames;
 private Vector<String> professorNames;
 private ArrayList<String> courseNames;
}
