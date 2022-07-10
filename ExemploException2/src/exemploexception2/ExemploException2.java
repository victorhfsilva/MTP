/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploexception2;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ufavictorhfsilva
 */
public class ExemploException2 {
    
    public static int divide(int numerador, int denominador)
            throws ArithmeticException, InputMismatchException {
        return numerador / denominador;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continua = true;
        do{
            try{
                System.out.println("Entre com o numerador");
                int numerador = entrada.nextInt();
                System.out.println("Entre com o denominador");
                int denominador = entrada.nextInt();
                
                int resultado = divide(numerador,denominador);
                System.out.println(numerador + " dividido por " + denominador +
                        " = " + resultado);
                continua = false;
                
            }
            catch (InputMismatchException excecaoEntradaInvalida){
                System.err.println("\nExceção: "+excecaoEntradaInvalida);
                entrada.nextLine(); //descarta entrada para nova tentativa
                System.out.println("Os números inseridos devem ser inteiros. Tente Novamente.\n");
            }
            catch (ArithmeticException excecaoAritmetica){
                System.err.println("\nExceção: "+excecaoAritmetica);
                System.out.println("Zero não é um denominador válido.\n");
            }
        }
        while (continua);
    }
}
