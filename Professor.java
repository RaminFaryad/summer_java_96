import java.io.*;
import java.util.*;

public class Professor extends Person{
	public Professor(String _name,String house , String blood_status , String _school ,Date _birthday,String _course,String _year){
		super(_name,house ,blood_status ,_school ,_birthday);	
		year = _year;
		course = _course;
	}
	public String get_year(){ return year;}
	public String getCourse(){return course; }
	public void setCourse(String _course){ course = _course;}
	public void setYear(String _year){ year = _year ; }
	private String course;
	private String year;
}
