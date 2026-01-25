package operators;

import java.util.Scanner;

public class logical {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter age: ");
    int age = input.nextInt();
    System.out.print("Are you a female?  (true/false) ");
    boolean isFemale = input.nextBoolean();
    if (age<5){
      System.out.println("You get 75% discount");
    }
    else if (isFemale){
      System.out.println("you get 50%discount");

    }
    else if (age>60 && !isFemale){
      System.out.println("You get 25%discount");
    }
    else{
      System.out.println("You got no discount");
    }
    input.close();

  }
}
