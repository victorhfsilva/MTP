/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author ufavictorhfsilva
 */
public class Retangulo {
    private int base;
    private int altura;
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public Retangulo(int lado){
        base = lado;
        altura = lado;
    }
    
    public Retangulo(){
        
    }
    
    public void print(){
        System.out.println("Base: "+base+" "+"Altura: "+altura);
    }
    
    public void printArea(){
        System.out.println("Área: "+base*altura);
    }
    
}
