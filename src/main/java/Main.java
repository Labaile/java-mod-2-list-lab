//import java.util.ArrayList;
//import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            //int i = 0;
            System.out.println("Enter title: ");
            String title = scanner.nextLine();
            System.out.println("Enter genre; ");
            String genre = scanner.nextLine();
            System.out.println("Enter number of pages; ");
            String numOfPages = scanner.nextLine();
            Book book = new Book(title,genre,numOfPages);

            //add book to Library class
            Library.collection(book);

            System.out.println("Do you want to continue: Y or N");
            String user = scanner.nextLine();
            if(Objects.equals(user, "N"))
            break;
            }
        
           // scanner.close();
    }

        
    

    }
//close class
