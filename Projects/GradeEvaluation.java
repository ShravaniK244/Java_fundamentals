package Projects;

import java.util.Scanner;

public class GradeEvaluation {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcomet to Grage Evaluation ");
  System.out.println("Enter the marks of physics: ");
  int marks1 = input.nextInt();
  System.out.println("Enter the marks of Maths: ");
  int marks2 = input.nextInt();
  System.out.println("Enter the marks of Chemistry: ");
  int marks3 = input.nextInt();
  int total = marks1 + marks2 + marks3;
  double percentage = (double)total / 3.0;
  input.close();
  if (percentage >= 90){
    System.out.println("Total marks: " + total + ", The percentage: " + percentage+ ", The Grade: A+");
  }
  else if(percentage>= 75){
    System.out.println("Total marks: " + total + ", The percentage: " + percentage+ ", The Grade: A");
  }
  else if(percentage>= 60){
    System.out.println("Total marks: " + total + ", The percentage: " + percentage+ ", The Grade: B");
  }
  else if(percentage >= 50 ){
    System.out.println("Total marks: " + total + ", The percentage: " + percentage+ ", The Grade: C");
  }
  else{
    System.out.println("Total marks: " + total + ", The percentage: " + percentage+ ", The Grade: F");

  }


  }
  
  
}
