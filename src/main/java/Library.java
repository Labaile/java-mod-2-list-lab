import java.util.ArrayList;
import java.util.List;

public class Library {
//library class to simply hold books

public static List<Book> collection(Book book){

ArrayList<Book> libraryHome = new ArrayList<Book>();
    libraryHome.add(book);
    System.out.println(libraryHome);
    return libraryHome;

}   
    
}
