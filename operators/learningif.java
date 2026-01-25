package operators;

public class learningif {
  public static void main(String[] args) {
    boolean isMale = false;
    String name = "Bob";
    System.out.println("before if");
    if (isMale){
      System.out.println("Mr."+ name);

    }
    else{
      System.out.println("Ms." + name);
    }
    System.out.println("after if");






    //Second 
    boolean isSeniorCitizen = false;
    boolean isAnAdult = false;
    if (isSeniorCitizen){
      System.out.println("Hello Senior Citizen");
    }
    else if (isAnAdult){
      System.out.println("Adult");
    }
    else{
      System.out.println("Child");
    }


  }
  
}
