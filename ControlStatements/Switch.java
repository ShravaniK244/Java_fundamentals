package ControlStatements;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome of the week detector:");
    System.out.print("Enter your day in number: ");
    int day = input.nextInt();
    // oldSwitch(day);
    newSwitch(day);
    input.close();
  }
    
    
    
    public static void newSwitch(int day){
      String dayStr = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tueday";
        case 3 -> "wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid";
      };
      System.out.println(dayStr);

    }





  //   public static void oldSwitch(int day){
  //     switch(day){
  //     case 1 :
  //       System.out.println("Monday");
  //       break;
  //     case 2:
  //       System.out.println("Tuesday");
  //       break;
  //     case 3:
  //       System.out.println("Wednesday");
  //       break;
  //     case 4:
  //       System.out.println("Thursday");
  //       break;
  //     case 5:
  //       System.out.println("Friday");
  //       break;
  //     case 6:
        
  //     case 7:
  //       System.out.println("Holiday");
  //       break;
  //     default:
  //       System.out.println("Invalid Day");
  //       break; 

  //   }
    


  
    
  // }
  
}
