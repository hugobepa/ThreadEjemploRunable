/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadejemplo;

/**
 *
 * @author hugo
 */
public class ThreadEjemplo  extends Thread { 
    public ThreadEjemplo(String str) 
    { 
        super(str); 
    }    

    private ThreadEjemplo() {
        
    }
    public void run()
    { 
        for( int i = 0; i < 10 ; i++)   System.out.println(i + " " + getName()); 
        System.out.println("Termina thread " + getName()); 
    }    
    public static void main (String [] args) 
    { 
        /*
         ThreadEjemplo ejemplo = new ThreadEjemplo(); 
         Thread thread = new Thread (ejemplo, "Pepe"); thread.start();
        */
        new Thread (new ThreadEjemplo(),"Pepe").start(); 
        new Thread(new ThreadEjemplo(),"Juan").start(); 
        System.out.println("Termina    thread    main");    
    }    
}
