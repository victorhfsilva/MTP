/*
 * Parte 1: É sim recomendado o uso de heranças. A classe Cidade deve ser uma subclasse de País pois herdará atributos e métodos de País.
 * Victor Hugo Ferreira Silva
 * 42111ETE024 
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class Escola {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercício 3
        Pessoa p1 = new Pessoa("João","123.456.789-00");
        Pessoa p2 = new Pessoa("Maria","987.654.321-00");
        
        //Exercício 4
        Pessoa[] vetorPessoas = new Pessoa[3];
        vetorPessoas[0]=p1;
        vetorPessoas[1]=p2;
        vetorPessoas[2]=new Pessoa("Antônio","999.888.777-00");
        
        //Exercício 5
        for (Pessoa i : vetorPessoas) System.out.println(i.getNome());
        
        //Exercício 7
        Aluno a1 = new Aluno("Amanda","666.555.444-00","123ABC");
        Aluno a2 = new Aluno("Carlos","333.222.111-00","321CBA");
        Aluno a3 = new Aluno("Joana","999.666.333-00","456DEF");
        Aluno a4 = new Aluno("Antônio","888.444.222-00","654FED");
        
        //Exercício 8
        ArrayList<Aluno> listaAlunos = new ArrayList();
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        
        //Exercício 9
        for (Aluno i : listaAlunos) {
            System.out.println("Nome: "+i.getNome()+" Número de Matrícula: "+i.getNumMatricula());
        }
    }
    
}
