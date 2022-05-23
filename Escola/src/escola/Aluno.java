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

    public Aluno(String nome, String cpf, String numMatricula, Curso curso) {
        super(nome, cpf);
        this.numMatricula = numMatricula;
        this.curso = curso;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return  super.toString()+" número de matrícula=" + numMatricula;
    }
    

    
    public Boolean matricularDisciplina(String codigo){
        boolean b1 = true;
        new Thread(){
            @Override
            public void run(){
                try {
                    boolean b2 = false;
                    //Caso a disciplina não faça parte do curso do aluno
                    for (Disciplina d : curso.getListaDisciplinasGrade()){
                        if(d.getCodigo().equals(codigo)) b2 = true;
                    }
                    if (b2 == false) throw new Exception();
                }
                catch (Exception e){
                    System.out.println("Erro: A disciplina não faz parte do curso.");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                try{                
                    //Caso a disciplina já esteja inserida na lista de disciplinas do aluno
                    for (Disciplina d : listaDisciplinas){
                        if(d.getCodigo().equals(codigo)) throw new Duplicated();
                    }
                }
                catch (Duplicated e){
                System.out.println("Erro: O aluno já está matriculado na disciplina.");
                } 
            }
        }.start();
        listaDisciplinas.add(curso.consultarDisciplinaPorCodigo(codigo));
        curso.consultarDisciplinaPorCodigo(codigo).listaAlunos.add(this);
        return true;
        //Aluno(getNome(),getCpf(),numMatricula,curso)
        

        }

    }
    

