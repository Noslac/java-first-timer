import java.util.Scanner.*;

/**
 *
 * @author noslac
 */
public class Secondday 
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        int n=9;
        double m=10;//when the calculation is carried out, the final answer is a double
        System.out.print("When "+n+ " and "+m+ " are multiplied, " +m*n +"is the answer.");
        System.out.println("");
        String greeting="Hello";
        System.out.print(greeting+"\n");//prints "hello"
        System.out.println("---------------");
        int x=16;
        if(x==10)
            System.out.println("Yah i got here");
        else
            System.out.println("Opps i didn't get it right!");  
        for(int i=0;i<=10;i++)
            System.out.println(i);
        int i=10;//redeclaring since i above is limited to for loop.
        while(i!=0)
        {
            System.out.println(i--); 
           // i--;
        }
        Scanner text = new Scanner(System.in);
        System.out.println(text.nextLine());
    }   
}
