//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class Book {
    // instance fields
    private String title;
    private String genre;
    private String numOfPages;

    //constructor method
    public Book(String bookName, String typeGenre, String numofBookPages){
        this.title = bookName;
        this.genre = typeGenre;
        this.numOfPages = numofBookPages;
    }//close constructor

    @Override
    public String toString() {
        return "Book [genre=" + genre + ", numOfPages=" + numOfPages + ", title=" + title + "]";
    }

    




//     public static void main(String[] args) {
        

//         //ask the user for the information about a single book
//         Scanner reader = new Scanner(System.in);
//         String bookName = getUserInput(reader, "Enter the book name: ");
//         String bookGenre = getUserInput(reader, "Enter the genre: ");
//         String pages = getUserInput(reader, "Enter the Number of Pages: ");
//         int numOfPages = Integer.valueOf(pages);


//         //create the book

//         //add the book to the library

//         //loop again and ask the user if they want to add another book

//        // Book book1 = new Book("Xena", "Fiction", 30);

//        System.out.println(bookName);
//        System.out.println(bookGenre);
//        System.out.println(numOfPages);
    
// }//close main


//     public static String getUserInput(Scanner reader, String msg){
//         System.out.println(msg);
//         String bookName = reader.nextLine();
//         return bookName;
//     }





}//close Book class
