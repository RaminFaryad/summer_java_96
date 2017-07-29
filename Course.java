import java.io.*;
import java.util.*;

public class Course{
  public Course(String _name){ name = _name ; }

  public void setStudentNames(Vector<String> students){ studentNames = students ; }
  public Course(String _name, String professor,char min_grade ,int _year){
    name = _name;
    professorName = professor;
    minGrade = min_grade;
    year = _year;
  }

  public String getProfessorName(){ return professorName ; }
  public char getMinGrade(){return minGrade ; }
  public void setProffesorName(String professor){ professorName = professor; }
  public void setName(String _name){ name = _name ; }

  private String name;
  private char minGrade;
  private String professorName;
  private int year;
  private Vector<String> studentNames;
}
