import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

class compareTo22 {

    private String name;

        public compareTo22(String str){
            name=str;
        }

    
}

public class compareTo2{

    public static void main(String args[]){
        compareTo22 obj1=new compareTo22("Rishabh");
        compareTo22 obj2=new compareTo22("Rahul");
        compareTo22 obj3=new compareTo22("Sachin");

        ArrayList<compareTo22> al=new ArrayList<>();
        al.add(obj3);
        al.add(obj2);
        al.add(obj1);

        Collections.binarySearch(al,obj1,null);
    }

}
