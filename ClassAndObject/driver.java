package ClassAndObject;

public class driver {
  static int age = 18;
  String name;
  String dateOfLicense;
  int ageDriver;



  public boolean isAllowed(){
    return this.ageDriver>= age;

  }
  public static void main(String[] args) {
    car swift = new car("Red");
    swift.addFuel(6);
    swift.start().drive();



    driver myDriver = new driver();
    myDriver.dateOfLicense = "1/Jan/2024";
    System.out.println("age");
    
  }
  
}
