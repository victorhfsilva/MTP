/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static Runnable t1 = new Runnable(){
    
        @Override
        public void run(){    
            for(int i = 0; i<60; i++){
                System.out.println("Thread 1: "+i);
            }
        }
    };
   
    public static Runnable t2 = new Runnable(){
        @Override
        public void run(){    
            for(int i = 0; i<60; i++){
                System.out.println("Thread 2: "+i);
            }
        }
    };
    
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static Runnable t3 = () -> array.stream().forEach(i -> System.out.println("Thread 3: "+i));
    
    public static void main(String[] args) {
        for (int i = 0; i<60; i++){
            array.add(i);
        }
        new Thread(t1).start();
        new Thread(t2).start();        
        //Usando funções Lambda
        new Thread(t3).start();
        new Thread( () -> array.stream().forEach(i -> System.out.println("Thread 4: "+i))).start();    
    }
    
}
