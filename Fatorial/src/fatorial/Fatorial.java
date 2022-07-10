/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ufavictorhfsilva
 */
public class Fatorial {

    public static int fatorial(int n) throws InputMismatchException {
        if (n == 0) return 1;
        if (n < 0) throw new InputMismatchException();
        for (int i = n; i > 1; i--){
            n *= i-1;
        }
        return n;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número Inteiro.");
        try {
            System.out.println(fatorial(scanner.nextInt()));
        }
        catch(InputMismatchException e){
            System.err.println("Entrada Inválida");
        }
    }
    
}
