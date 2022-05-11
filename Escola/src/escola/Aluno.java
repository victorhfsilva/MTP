/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author ufavictorhfsilva
 */
public class Aluno extends Pessoa {
    private String numMatricula;

    public Aluno(String nome, String cpf, String numMatricula) {
        super(nome, cpf);
        this.numMatricula = numMatricula;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return  super.toString()+" numMatricula=" + numMatricula;
    }
    
    
}
