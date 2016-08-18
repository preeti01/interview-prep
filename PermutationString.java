import java.util.*;
public class PermutationString
{
   public boolean ispermutation(String s, String t)
   {
       if(s.length()!=t.length())
       {
           return  false;
       }
       else
       {
           return sort(s).equals(sort(t));
       }
       
   }
    
   public String sort(String str)
   {
       char[] content = str.toCharArray();
       java.util.Arrays.sort(content);
       return new String(content);
   }
   
   public static void main(String []args)
   {
        PermutationString obj= new PermutationString();
        boolean b= obj.ispermutation("baby","abyb");
        System.out.println("result "+b);
   }
}
