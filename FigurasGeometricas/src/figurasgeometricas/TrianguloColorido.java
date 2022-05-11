/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author ufavictorhfsilva
 */
public class TrianguloColorido extends Triangulo {

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public TrianguloColorido(double lado1, double lado2, double lado3, String cor) {
        super(lado1, lado2, lado3);
        this.cor = cor;
    }

    public TrianguloColorido(double lado, String cor) {
        super(lado);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString()+ " cor=" + cor;
    }
    
    
}
