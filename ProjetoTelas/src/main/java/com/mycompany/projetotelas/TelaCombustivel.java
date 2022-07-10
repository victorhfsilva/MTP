/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotelas;

/**
 *
 * @author ufavictorhfsilva
 */
public class TelaCombustivel extends Tela {
    
    private double qtdCombustivelRestante_L;
    private double consumoMedio_Km_L;
    private double kmRestantes_Km;
    
    TelaCombustivel(double consumoMedio_Km_L, double qtdCombustivelRestante_L){
        super.setTitulo("Combustível");
        this.consumoMedio_Km_L = consumoMedio_Km_L;
        this.qtdCombustivelRestante_L = qtdCombustivelRestante_L;
        this.kmRestantes_Km = qtdCombustivelRestante_L*consumoMedio_Km_L;
    }
    
    @Override
    public String obterInformacao(){
        qtdCombustivelRestante_L -= 5;
        kmRestantes_Km = qtdCombustivelRestante_L*consumoMedio_Km_L;
        return "Combustível Restante: " + qtdCombustivelRestante_L + " l\n" 
                + "Kilometros Restantes: " + kmRestantes_Km + " Km\n"
                + "Consumo Medio: " + consumoMedio_Km_L + " Km/l\n";
    }
    
}
