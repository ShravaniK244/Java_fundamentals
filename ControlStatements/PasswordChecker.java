package ControlStatements;

import java.util.Scanner;

class PasswordChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Setting your password\n");
    // boolean isValid;
    String password;

    
    input.close();
    do{
      System.out.println("Please enter your Password: ");
      password = input.next();

    }while(!isValid(password));
  }
  public static boolean isValid(String password){
    return false;

  }

  
}
