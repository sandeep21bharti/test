package com.learn.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


class StudentMarks{
	String name;
	int marks;
	
	
	public StudentMarks(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentMarks [name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
class Grade{
	 public Function<StudentMarks,String> studentMarkGradeFunction=(s) -> {
		  if(s.marks>=80){
			  return "Distinction";
		  }else if(s.marks>=60) {
			  return "A";
		  }else if(s.marks>=50) {
			  return "B";
		  }else if(s.marks>=30) {
			  return "C";
		  } else {
			  return "Fail";
		  }
	 };
}


public class FunctionStudentGradeEample {
	public static void main(String[] args) {
		StudentMarks[] s={  new StudentMarks("Nitin", 80),
		    		        new StudentMarks("summit", 40),
		    		        new StudentMarks("Yogendra", 60)};
		
		  Grade grade=new Grade();
		
		  Map<StudentMarks,String> map = new FunctionStudentGradeEample().getGradeofMarks(s,grade.studentMarkGradeFunction);
		 
		  map.forEach((k,v)->System.out.println(k + "Grade="+v));
		
	}
	
	public Map<StudentMarks,String> getGradeofMarks(StudentMarks[] s,Function<StudentMarks,String>function) {
		Map<StudentMarks,String>map =new HashMap<StudentMarks,String>();
		 for (StudentMarks studentMarks : s) {
			String grade=function.apply(studentMarks);
			map.put(studentMarks, grade);
		}
		
		
		return map;
		
		
	}

}
