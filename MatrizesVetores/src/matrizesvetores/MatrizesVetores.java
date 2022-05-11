/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizesvetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ufavictorhfsilva
 */
public class MatrizesVetores {
    
    static int[] vetor1 = new int[10];
    static int[][] matriz1 = new int[3][3];
    
    static int[] vetor2 = {0,1,2,3,4,5,6,7,8,9};
    static int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
    
    static ArrayList lista1 = new ArrayList();
    static ArrayList<Integer> lista2 = new ArrayList();
    
    static List<Integer> lista3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vetores
        for (int i: vetor2){
            vetor1[i]=i*i;
        }
        for (int i: vetor2) System.out.print(i+" ");
        System.out.println();
        for (int i: vetor1) System.out.print(i+" ");
        System.out.println();
        
        //Matrizes
        for (int i = 0; i<matriz2.length; i++){
            for (int j = 0; j<matriz2[i].length;j++){
                matriz1[i][j]=matriz2[i][j]*matriz2[i][j];
            }
        }
        for (int i = 0; i<matriz2.length; i++){
            for (int j = 0; j<matriz2[i].length;j++){
            System.out.print(matriz2[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1[i].length;j++){
            System.out.print(matriz1[i][j]+"\t");
            }
            System.out.println();
        }        
        
        //Lista 1
        lista1.add(1);
        lista1.add(1.2);
        lista1.add("Hello World");
        System.out.println(lista1);
        
        //Lista 2
        for(int i=0; i<10;i++){
            lista2.add(i);
        }
        System.out.println(lista2);
        
    }
    
}
