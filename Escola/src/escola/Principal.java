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
public class Principal {
    
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    private ArrayList<Curso> listaCursos = new ArrayList();

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public void cadastrarCurso(String nome, String sigla){
        try{
            for (Curso c : listaCursos){
                    if(c.getSigla().equals(sigla)) throw new Duplicated();
                }
            listaCursos.add(new Curso(nome,sigla));
        }
        catch (Duplicated d){
            System.out.println("Erro: Sigla do Curso Duplicado!");
        }
    }
    
    public void cadastraDisciplinaCurso(String siglaCurso, String nomeDisc,String codDisc, int cargaHor){
        boolean b = true;
        try{
            for (Curso c : listaCursos){
                if(c.getSigla().equals(siglaCurso)) {
                    c.cadastrarDisciplina(nomeDisc, codDisc, cargaHor);
                    b = false;
                }
            }
            if (b) throw new NotInTheCourse();
        }
        catch (NotInTheCourse n){
            System.out.println("O curso não está presente na lista de cursos.");
        }    
    }   
    
    @Override
    public String toString() {
        return "listaAlunos=" + listaAlunos + ", listaCursos=" + listaCursos;
    }   
    
}
