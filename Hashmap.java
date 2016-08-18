import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Hashmap{
 
     public static void main(String []args)
     {
        Map<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("ram",89);
        hm.put("shaam",34);
        
        for(String key:hm.keySet())
        {
            System.out.println(key+":"+hm.get(key));
          
        }
       
     }
}

