/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class Curso {
    private String nome;
    private String sigla;
    private ArrayList<Disciplina> listaDisciplinasGrade = new ArrayList();

    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public Curso(String nome, String sigla, ArrayList<Disciplina> listaDisciplinasGrade) {
        this.nome = nome;
        this.sigla = sigla;
        this.listaDisciplinasGrade = listaDisciplinasGrade;
    }
    
    public Curso(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Disciplina> getListaDisciplinasGrade() {
        return listaDisciplinasGrade;
    }

    public void setListaDisciplinasGrade(ArrayList<Disciplina> listaDisciplinasGrade) {
        this.listaDisciplinasGrade = listaDisciplinasGrade;
    }

    @Override
    public String toString() {
        return "curso=" + nome + ", sigla=" + sigla + ", lista de disciplinas=" + listaDisciplinasGrade;
    }
    
    
    
    /**
     * Cadastra Disciplina
     * @param nome Nome da Disciplina
     * @param codigo Código da Disciplina
     * @param cargaHoraria Carga Horária da Disciplina
     */
    public void cadastrarDisciplina(String nome,String codigo, int cargaHoraria){
        try{
            for (Disciplina d : listaDisciplinasGrade){
                if(d.getCodigo().equals(codigo)||d.getNome().equals(nome)) throw new Exception();
            }
            listaDisciplinasGrade.add(new Disciplina(nome,codigo,cargaHoraria));
        }
        catch (Exception e){
            System.out.println("Erro: Código da Disciplina Duplicado!");
        }
    }
    /**
     * Cadastra Disciplina
     * @param disciplina 
     */
    public void cadastrarDisciplina(Disciplina disciplina){
        try{
            for (Disciplina d : listaDisciplinasGrade){
                if(d.getCodigo().equals(disciplina.getCodigo()) || d.getNome().equals(disciplina.getNome())) throw new Exception();
            }
            listaDisciplinasGrade.add(disciplina);
        }
        catch (Exception e){
            System.out.println("Erro: Disciplina Duplicada!");
        }
    }
    
    /**
     * Retorna a Disciplina através do Código da Disciplina
     * @param codigo
     * @return Disciplina
     */
    public Disciplina consultarDisciplinaPorCodigo(String codigo){
        for (Disciplina d : listaDisciplinasGrade){
            if(d.getCodigo().equals(codigo)) return d;
        }
        return null;
    }
}
