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
public class Aluno extends Pessoa {
    private String numMatricula;
    private Curso curso;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList();

    public Aluno(String nome, String cpf, int idade, String numMatricula, Curso curso) {
        super(nome, cpf, idade);
        this.numMatricula = numMatricula;
        this.curso = curso;
    }
    
    public Aluno(String nome, String cpf, int idade, String numMatricula, Curso curso, ArrayList<Disciplina> listaDisciplinas) {
        super(nome, cpf, idade);
        this.numMatricula = numMatricula;
        this.curso = curso;
        this.listaDisciplinas = listaDisciplinas;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
    
    @Override
    public String toString() {
        return  super.toString()+" número de matrícula=" + numMatricula;
    }
    

    
    public Boolean matricularDisciplina(String codigo){
    
        try {
            //Caso a disciplina não faça parte do curso do aluno
            boolean b1 = true;
            for (Disciplina d : curso.getListaDisciplinasGrade()){
                if(d.getCodigo().equals(codigo)) {
                    b1 = false;
                    break;
                }
            }
            if(b1) throw new NotInTheCourse();
            //Caso a disciplina já esteja inserida na lista de disciplinas do aluno
            for (Disciplina d : listaDisciplinas){
                if(d.getCodigo().equals(codigo)) throw new Duplicated();
            }
            listaDisciplinas.add(curso.consultarDisciplinaPorCodigo(codigo));
            curso.consultarDisciplinaPorCodigo(codigo).listaAlunos.add(this);
            return true;
        }
        catch (NotInTheCourse e){
            System.out.println("Erro: A disciplina não faz parte do curso.");
            return false;
        }
        catch (Duplicated d){
            System.out.println("Erro: O aluno já está matriculado na disciplina.");
            return false;
        } 
        
  
    }

}
    

