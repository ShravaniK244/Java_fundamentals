package ClassAndObject;



public class challenge3 {
  public static void main(String[] args) {
    laptop x = new laptop();
    x.display();
    x.applyDiscount(20);
    
  }
  
}
class laptop{
  private String brand;
  private int price;




  laptop(){
    brand = "Dell";
    price = 54000;

  }



  void  applyDiscount(int percent){
    
    
    int discount = price* percent/100;
    price = price - discount;
    System.out.println("After Discount: " +price);
  
   
}


  void display(){
    System.out.println("The laptop brand: " + brand);
    System.out.println("The original price: " +price);
  

    

  }





}
