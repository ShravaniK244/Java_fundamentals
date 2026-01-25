package ControlStatements;

import java.util.Scanner;

public class StudentScoreChallenege {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number :");
    int a = input.nextInt();
    input.close();

    String score = a>=80 ? "High" : (a>=50)? "Moderate" : "Low";
    
    System.out.println("The marks are: " + score);
  }
  
}
