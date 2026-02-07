package Strings;
public class car {
  int noOfWheels ;
  int noOfDoors;
  int maxSpeed;
  String name;
  String model;
  String company;

  public car (int noOfWheels,int noOfDoors,int maxSpeed,String name,String model,String company){
    this.noOfWheels = noOfWheels;
    this.noOfDoors = noOfDoors;
    this.maxSpeed = maxSpeed;
    this.name = name;
    this.model = model;
    this.company = company;
  }

  public static void main(String[] args) {
    car Swift = new car(4, 4, 140,  "Swift","SW876" , "maruti");
    System.out.println(Swift);
  }
}
