import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> myStringList = new ArrayList<String>();
        myStringList.add("first string");
        myStringList.add("second string");
        myStringList.add("third string");

        for (String myString: myStringList) {
        System.out.println(myString);
}
   
}//close main
    
}//close ListExample
    
