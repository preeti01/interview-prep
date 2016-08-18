public class UniqueString
{	
   int i;
   public boolean isunique(String s)
   {
        if(s.length()>256)
        {
            return false;
        
        }
        
        boolean[] char_set = new boolean[256];

        for(i=0;i<s.length();i++)
        {
            int val=s.charAt(i);
            if(char_set[val])
            {
                return false;
            }
            else
            {
                char_set[val]=true;
            }
        
        }
    return true;
    }
     
    public static void main(String []args)
    {
         UniqueString s= new UniqueString();
         boolean b = s.isunique("Helo");
         System.out.println("result is "+b);
     }
}
