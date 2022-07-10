/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

/**
 *
 * @author ufavictorhfsilva
 */
public class Multiplicacao extends OperacaoMatematica {
    Multiplicacao(){
        simbolo = "*";
    }
    
    @Override
    public double calcular(){
        return getX()*getY();
    }
    
    static public double calcular(double x, double y){
        return x*y;
    }
}
