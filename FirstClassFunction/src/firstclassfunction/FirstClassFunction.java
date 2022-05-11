/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstclassfunction;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ufavictorhfsilva
 */
public class FirstClassFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2,3,4,5);
        System.out.println(array+"\n");
        //First Class Functions can be treated as variables
        SquareMaker squareMaker = item -> item * item;
        CubeMaker cubeMaker = item -> (int) Math.pow((double) item, 3);
        for (Integer i : array){
            System.out.print(squareMaker.square(i)+" ");
        }
        System.out.println();
        for (Integer i : array){
            System.out.print(cubeMaker.cube(i)+" ");
        }
        System.out.println();
    }
    
}
interface SquareMaker {
    int square(int item);
}
interface CubeMaker{
    int cube(int item);
}
