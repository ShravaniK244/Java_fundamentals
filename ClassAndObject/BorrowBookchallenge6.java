package ClassAndObject;

public class BorrowBookchallenge6 {

  public static void main(String[] args) {
    Book designOfThings = new Book("1", "Design", "Author");
    Book myBook = new Book("2");
   
    System.out.println(Book.getTotalBooks());
    designOfThings.borrowBook();
    myBook.borrowBook();
    
    designOfThings.returnBook();
  }
}


class Book{
  static int totalBooks;
  String title;
  String author;
  
  String isbn;
  boolean isBorrowed;

  static {
    totalBooks = 0;
  }

  {
    totalBooks++;
  }


  Book(String isbn, String title, String author){
    this.title = title;
    this.author = author;
   
    this.isbn = isbn;

  }
  Book(String isbn){
    this(isbn, "Unknown", "Unknown");
  }
  static int getTotalBooks(){
    return totalBooks;
  }

  void borrowBook(){
    if(isBorrowed){
      System.out.println("Book is already borrowed");
    }
    else{
      this.isBorrowed = true;
      System.out.println("Enjoy " + this.title);

    }
}
 void returnBook(){
  if (isBorrowed){
    this.isBorrowed = false;
    System.out.println("Hope you enjoyed the book, Please leave the review");

  }
  else{
    System.out.println("This book is already in the library");
  }
      
    }

 
  
  


}












