
package isc;

import java.util.LinkedList;


public class day38_rahmatia {
    public static void main(String[] args) {
       
        LinkedList<String> list = new LinkedList<>();
        
        list.add("rahma");
        list.add("tiya");
        list.add("rahmatia");
        
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }
    }
  
}
