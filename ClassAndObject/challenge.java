// QUESTION 1:-

// Write a class Student with:

// instance variables: name, rollNo

// a method display() that prints student details

// Create two different objects in main() and show that each object holds its own data.






package ClassAndObject;

public class challenge {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.rollNo = 22;
    s1.name = "Devesh";
    s2.rollNo = 23;
    s2.name = "Jagruti";
    s1.display();
    s2.display();


  }


  
}
class Student{
  int rollNo = 21;
  String name = "Shravani";





 void display(){
  System.out.println("Name of student : "+ name);
  System.out.println("The roll number: " +rollNo);
    
  }
}
