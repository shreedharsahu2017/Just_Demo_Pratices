import java.util.*;

public class Student implements Comparable<Student> {
	int rollname;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollname=rollno;
		this.name=name;
		this.age=age;
	}
	  
	
	public int compareTo(Student s1) {
      if(age==s1.age) 
    	  return 0;
	
      else if(age>s1.age) 
    	  return 1;
      else 
    	  return -1;
  }
}

	class ExampleComparable{
	 public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"Vijay",24));
		al.add(new Student(102,"Akash",25));
		al.add(new Student(103,"Jai",28));
		Collections.sort(al);
		 for(Student s:al) {
			 System.out.println(s.rollname+""+s.name+""+s.age);
		 }
	}	
}