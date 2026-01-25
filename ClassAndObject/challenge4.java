package ClassAndObject;

public class challenge4 {
  public static void main(String[] args) {

  Employee x = new Employee(2, "Jagruti");
  x.display();
  x.updateName("Shravani");
  x.display();

    
  }
 

  
}


class Employee{
  private int id;
  private String name;




  Employee(int id, String name){
    this.id = id;
    this.name = name;
  }

   void display(){
    System.out.println("ID before updating" + id);
    System.out.println("Name before updating" +name);
  }


  void updateName(String name){
    this.name = name;
  }


  

 

}
