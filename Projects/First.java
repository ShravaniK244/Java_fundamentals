package Projects;

public class First {
  public static void main(String[] args) {
    System.out.println("JVM started");
    System.out.println("No. of arguments: " +args.length);
    if (args.length > 0) {
    System.out.println("First argument: " + args[0]);
}

if (args.length > 1) {
    System.out.println("Second argument: " + args[1]);
}

    System.out.println("Program ended");
  }
  
}
