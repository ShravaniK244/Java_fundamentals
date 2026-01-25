package ClassAndObject;

public class BookChallenge5 {
  public static void main(String[] args) {
  Book x = new Book("Ikigai");
  Book y = new Book("Yes", "Me");
  Book z = new Book("A", "B", 300);
  x.display();
  y.display();
  z.display();



    
  }

  Book x = new Book("Ikigai");
  Book y = new Book("Yes", "Me");
  Book z = new Book("A", "B", 300);


  
}
class Book{
  static int totalBooks;
  String title;
  String author;
  int price;
  String isb;
  boolean isBorrowed;

  static {
    totalBooks = 0;
  }


  Book(String title){
    this(title, "unknown", 0);

  }



   Book(String title, String author){
    this(title, author,0);


  }

  Book(String title, String author, int price){
    this.title = title;
    this.author = author;
    this.price = price; 

  }


  void display(){
    System.out.println("Title of the book: " +title);
    System.out.println("Author of the book: " +author);

    System.out.println("Price of the book: " +price);

  }
  void borrowBook(){

  }

 
  
  


}

