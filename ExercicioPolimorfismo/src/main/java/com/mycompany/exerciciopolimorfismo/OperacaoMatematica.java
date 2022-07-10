/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

/**
 *
 * @author ufavictorhfsilva
 */
public class OperacaoMatematica {
    private double x;
    private double y;
    public String simbolo;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
        
    public double calcular(){
        return 0.0;
    }

    @Override
    public final String toString() {
        return getX() + simbolo + getY() + "=" + calcular();
    }
    
    
}
