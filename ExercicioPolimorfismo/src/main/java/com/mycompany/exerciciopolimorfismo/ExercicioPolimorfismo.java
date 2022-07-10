/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        Soma s = new Soma();
        s.setX(6.8);
        s.setY(9.2);
        System.out.println(s.calcular());
        System.out.println("");
        
        ArrayList<OperacaoMatematica> lista = new ArrayList();
        lista.add(new Soma());
        lista.add(new Subtracao());
        lista.add(new Multiplicacao());
        lista.add(new Divisao());
        for (OperacaoMatematica i: lista){
            i.setX(3);
            i.setY(3);
            System.out.println(i.toString());
        }
        System.out.println("");
        
        System.out.println(Soma.calcular(2, 3));
        System.out.println(Subtracao.calcular(2,3));
        System.out.println(Multiplicacao.calcular(2, 3));
        System.out.println(Divisao.calcular(2,3));
    }
}
