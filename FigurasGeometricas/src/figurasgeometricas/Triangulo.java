/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author ufavictorhfsilva
 */
public class Triangulo {
    
     private double lado1;
     private double lado2;
     private double lado3;
     
     private double perimetro;
     private String tipoTriangulo;

    public double getLado1() {
        return lado1;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        perimetro = perimetro();
        tipoTriangulo = tipoTriangulo();
    }

    public Triangulo(double lado) {
        lado1 = lado;
        lado2 = lado;
        lado3 = lado;
        perimetro = perimetro();
        tipoTriangulo = tipoTriangulo();
    }
    
    private double perimetro(){
        perimetro = lado1+lado2+lado3;
        System.out.println("Perímetro: "+perimetro);
        return perimetro;
    }
    
    private String tipoTriangulo(){
        if (lado1==lado2 && lado1==lado3){
            tipoTriangulo = "Equilátero";
        }
        else if (lado1==lado2 || lado1==lado3 || lado2==lado3){
            tipoTriangulo = "Isósceles";
        }
        else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
            tipoTriangulo = "Escaleno";
        }
        else {
            System.out.println("Erro no Condicional!");
        }
        //System.out.println(tipoTriangulo);
        return tipoTriangulo;
    }

    @Override
    public String toString() {
        return "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", perimetro=" + perimetro + ", tipoTriangulo=" + tipoTriangulo;
    }
    
    
    
}
