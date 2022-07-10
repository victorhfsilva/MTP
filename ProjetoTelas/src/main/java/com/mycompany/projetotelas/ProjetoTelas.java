/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetotelas;

/**
 *
 * @author ufavictorhfsilva
 */
public class ProjetoTelas {

    public static void main(String[] args) {
        TelaKilometragem tk = new TelaKilometragem();
        tk.imprimir();
        System.out.println("\n-------------------------------------\n");
        tk.imprimir();
        System.out.println("");
        
        /**
         * Exemplos de Erros
         * 
         * Tela t1 = new Tela();
         * Não implementar obterinformacao() em Tela Kilometragem
         * Implementar métodos estáticos como sendo abstratos
         */
        
        System.out.println("\n-------------------------------------\n");
        System.out.println("");
        
        TelaCombustivel tc = new TelaCombustivel(6.7, 21);
        tc.imprimir();
        System.out.println("\n-------------------------------------\n");
        tc.imprimir();
        System.out.println("");
    }
}
