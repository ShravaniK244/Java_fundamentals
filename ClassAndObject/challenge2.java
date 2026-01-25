package ClassAndObject;

public class challenge2 {


  public static void main(String[] args) {
    Person p1 = new Person("Shravani" , 21);
    Person p2 = new Person("Jagruti", 20);
    p1.display();
    p2.display();


  }
}




class Person {
  private String name;
  private int age;
    

  Person(String name, int age){
    this.name = name;
    this.age = age;
    }

  void display(){
    System.out.println("The name: " +name);
    System.out.println("the age: " +age);
  }

}
  

