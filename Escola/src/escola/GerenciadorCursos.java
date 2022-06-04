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
public class GerenciadorCursos {
    
    private ArrayList<Curso> listaCursos = new ArrayList();
    
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
            System.out.println("Erro: O curso já faz parte da lista de cursos.");
        }
    }
    
    public void cadastrarCurso(Curso curso){
        try{
            for (Curso c : listaCursos){
                    if(c.equals(curso)) throw new Duplicated();
                }
            listaCursos.add(curso);
        }
        catch (Duplicated d){
            System.out.println("Erro: O curso já faz parte da lista de cursos.");
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
    
    public Curso consultarCursoPorSigla(String sigla){
        try{
            for (Curso c : listaCursos){
                if (c.getSigla().equals(sigla)) return c;
            }
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("O curso não está presente na lista de cursos.");
            return null;
        }
    }
    
    public Curso consultarCursoPorNome(String nome){
        try{
            for (Curso c : listaCursos){
                if (c.getNome().equals(nome)) return c;
            }
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("O curso não está presente na lista de cursos.");
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "listaCursos=" + listaCursos;
    }
    
}
