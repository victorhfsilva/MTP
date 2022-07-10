/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotelas;

/**
 *
 * @author ufavictorhfsilva
 */
public abstract class Tela {
    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String obterInformacao();

    public void imprimir() {
        System.out.println(this.titulo);
        System.out.println("");
        System.out.println(obterInformacao());
    }
        
}
