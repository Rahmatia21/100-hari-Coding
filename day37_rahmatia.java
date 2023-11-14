
package isc;

import java.util.LinkedList;


public class day37_rahmatia {
    public static void main(String[] args) {
         
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
   
}
