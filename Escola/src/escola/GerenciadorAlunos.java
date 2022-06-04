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
public class GerenciadorAlunos {
    
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    public void cadastrarAluno(Aluno aluno){
        try{
            for (Aluno a : listaAlunos){
                if (a.getCpf().equals(aluno.getCpf()) || a.getNumMatricula().equals(aluno.getNumMatricula())) throw new Duplicated();
            }
            listaAlunos.add(aluno);
        }
        catch (Duplicated d){
            System.out.println("O aluno já está cadastrado");
        }
    }
    
    public void matricularAluno(String numMatricula, String siglaCurso){
        Curso c = new Curso();
        try {
            boolean b = true;
            for (int i = 0; i<Escola.gCursos.getListaCursos().size(); i++){
                if(Escola.gCursos.getListaCursos().get(i).getSigla().equals(siglaCurso))  {
                    c = Escola.gCursos.getListaCursos().get(i);
                    b = false;
                    break;
                }
            }
            if (b) throw new NotInTheCourse();
        }
        catch (NotInTheCourse n){
            System.out.println("O curso não existe.");
        }
        
        for (int i = 0; i<listaAlunos.size(); i++){
            if (listaAlunos.get(i).getNumMatricula().equals(numMatricula)){
                listaAlunos.get(i).setCurso(c);
            }
        }
    }
    
    public Aluno consultarAlunoPorMatricula(String numMatricula){
        try{
            for (Aluno a : listaAlunos){
                if (a.getNumMatricula().equals(numMatricula)) return a;
            }
            throw new NotInTheCourse();
        }
        catch (NotInTheCourse d){
            System.out.println("O aluno não está presente na lista de alunos.");
            return null;
        }
    }
    
    public Aluno consultarAlunoPorNome(String nome){
        try{
            for (Aluno a : listaAlunos){
                if (a.getNome().equals(nome)) return a;
            }
            throw new NotInTheCourse();
        }
        catch (NotInTheCourse d){
            System.out.println("O aluno não está presente na lista de alunos.");
            return null;
        }
    }
    
    public ArrayList<Aluno> consultarAlunoPorCurso(String siglaCurso){
        ArrayList<Aluno> alunosPorCurso = new ArrayList();
        boolean b1 = true;
        try{
            for (Aluno a : listaAlunos){
                if (a.getCurso().getSigla().equals(siglaCurso)) {
                    alunosPorCurso.add(a);
                    b1 = false;
                }
            }
            if (b1) throw new NotInTheCourse();
        }
        catch (NotInTheCourse d){
            System.out.println("Nenhum aluno está matriculado no curso.");
        }
        return alunosPorCurso;
    }
        
    @Override
    public String toString() {
        return "listaAlunos=" + listaAlunos;
    } 
}
