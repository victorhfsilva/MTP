/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;

import java.util.ArrayList;

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
        
        System.out.println("\nTriângulo 2");
        Triangulo t2 = new Triangulo(14.3);
        
        System.out.println("\nTriângulo 3");
        Triangulo t3 = new Triangulo(21.14,52.34,21.14);
        
        //Exercício 1
        Retangulo r2 = new Retangulo((int) ((Math.random() *10) + 1),(int) ((Math.random() *15) + 1));
        Retangulo r3 = new Retangulo((int) ((Math.random() *10) + 1),(int) ((Math.random() *15) + 1));
        Retangulo r4 = new Retangulo((int) ((Math.random() *10) + 1),(int) ((Math.random() *15) + 1));
        
        Retangulo[] vetorRetangulos = new Retangulo[5];
        vetorRetangulos[0] = r1;
        vetorRetangulos[1] = r2;
        vetorRetangulos[2] = r3;
        vetorRetangulos[3] = r4;
        
        //Exercício 2
        vetorRetangulos[4] = new Retangulo((int) ((Math.random() *10) + 1),(int) ((Math.random() *15) + 1));
        
        //Exercício 3
        for (Retangulo i : vetorRetangulos) System.out.println(i.toString());
        
        //Exercício 4
        ArrayList formasGeometricas1 = new ArrayList();
        formasGeometricas1.add(t1);
        formasGeometricas1.add(t2);
        formasGeometricas1.add(t3);
        formasGeometricas1.add(r2);
        formasGeometricas1.add(r3);
        
        //Exercício 5
        for (int i = 0; i<formasGeometricas1.size(); i++) System.out.println(formasGeometricas1.get(i).toString());
        
        //Exercício 6
        ArrayList<Triangulo> triangulos = new ArrayList();
        triangulos.add(t1);
        triangulos.add(t2);
        triangulos.add(t3);
        
        //Exercício 7
        for (Triangulo i : triangulos) System.out.println(i.getTipoTriangulo());
        
        TrianguloColorido tc1 = new TrianguloColorido(1.14, "Amarelo");
        System.out.println(tc1.toString());
    }
    
}
