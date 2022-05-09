/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author ufavictorhfsilva
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo(14,12);
        System.out.println("Retângulo 1");
        r1.print();
        r1.printArea();
        
        System.out.println("\nEdição da Altura");
        r1.setAltura(13);
        r1.print();
        r1.printArea();
        
        Retangulo q1 = new Retangulo(12);
        System.out.println("\nQuadrado 1");
        q1.print();
        System.out.println("Lado: "+q1.getBase());
        q1.printArea();
        
        System.out.println("\nTriângulo 1");
        Triangulo t1 = new Triangulo(12.31,23.43,43.12);
        double perimetro1 = t1.perimetro();
        String tipoTriangulo1 = t1.tipoTriangulo();
        
        System.out.println("\nTriângulo 2");
        Triangulo t2 = new Triangulo(14.3);
        double perimetro2 = t2.perimetro();
        String tipoTriangulo2 = t2.tipoTriangulo();
        
        System.out.println("\nTriângulo 3");
        Triangulo t3 = new Triangulo(21.14,52.34,21.14);
        double perimetro3 = t3.perimetro();
        String tipoTriangulo3 = t3.tipoTriangulo();
    }
    
}
