public class CompressedString
{
     public String compstr(String str)
     {
         int size = countcompressed(str);
         
         if(size >= str.length())
         return str;
         
         StringBuffer mystr = new StringBuffer();
         char last=str.charAt(0);
         int count=1;
         for(int i=1;i<str.length();i++)
         {
             if(last==str.charAt(i))
             count++;
             else
             {
                mystr.append(last);
                mystr.append(count);
                last=str.charAt(i);
                count=1;
             }
         }
         mystr.append(last);
         mystr.append(count);
         return mystr.toString();
     }
    
     public int countcompressed(String str)
     {
         char last=str.charAt(0);
         int count=1;
         int size=0;
         for(int i=1;i<str.length();i++)
         {
            if(last==str.charAt(i))
            {
                count++;
            }
            else
            {
                size+=1+String.valueOf(count).length();
                last=str.charAt(i);
                count=1;
            }
         }
         return size+1+String.valueOf(count).length();
     }
     
     public static void main(String []args)
     {
         
         CompressedString h = new CompressedString();
         String newstring= h.compstr("aabccccaaa");
         System.out.println("result"+newstring);
     }
}
