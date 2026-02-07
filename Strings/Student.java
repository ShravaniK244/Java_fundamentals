package Strings;

class Student {
  String name;
  int age;
  String rollNo;
  String house;

  public Student (String name, int age, String rollNo, String house){
    this.name = name;
    this.age = age;
    this.rollNo = rollNo;
    this.house = house;

  }


  @Override
  public String toString() {
    return "Student details: { name:"  +name + " , age:"+age + " , roll number:" +rollNo+  ", house:" +house;
  }
  public static void main(String[] args) {
    Student stu = new Student("Shravani", 21, "001", "Shivaji");
    System.out.println(stu);
  }
}

