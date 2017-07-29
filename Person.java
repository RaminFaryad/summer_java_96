import java.io.*;
import java.util.*;
public class Person{
  public Person(String _name){ name = _name; }
  public Person(String _name,String house , String blood_status , String _school ,Date _birthday)
  {
    name = _name;
    houseName = house;
    bloodStatus = blood_status;
    school = _school ;
    birthday = _birthday;
  }

  public String getName(){return name; }
  public String getHouseName(){return houseName ;}
  public String getBloodStatus(){ return bloodStatus ; }
  public String getSchool(){ return school ;}
  public void setName(String _name ){ name = _name ;}
  public void setHouseName(String house){ houseName = house ; }
  public void setBloodStatus(String blood_status ){ bloodStatus = blood_status ; }
  public void setSchool(String _school){ school = _school ; }

  private String name;
  private String houseName;
  private String bloodStatus;
  private String school;
  private Date  birthday;
}
