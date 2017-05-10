/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorcycle;

/**
 *
 * @author noslac
 */
public class Motorcycle
{

    String make;
    String color;
    Boolean engineState=false;//always initialize
    void startEngine()
    {
        if(engineState == true)
            System.out.println("The engine is already on.");
        else
        {
            engineState = true;
            System.out.println("The engine is now on.");
        } 
    }
    void showAtts() 
    {
        System.out.println("This motorcycle is a "+ color + "" + make);
        if (engineState == true)
            System.out.println("The engine is on.");
        else 
            System.out.println("The engine is off.\n");
    }
    public static void main(String args[])
    {
       /* Motorcycle m= new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();*/
        Motorcycle n= new Motorcycle();
        n.make="Toyota";
        n.color="red";
        System.out.println("Calling showAtts...");
        n.showAtts();
    }
    
}




