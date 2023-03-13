import java.lang.Thread;
import java.io.PrintStream;
import java.io.*;;
class demo
{
   
   
    public static void main(String[] args) throws InterruptedException,IOException
    {
        PrintStream pt=new PrintStream(System.out);
        int i=0;
        while(i<10)
        {
         pt.println("shiva");
         Thread.sleep(4000);
         i++;
            
        }
       
    }
}