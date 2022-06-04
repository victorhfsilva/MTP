
package escola;


/**
 *
 * @author ufavictorhfsilva
 */
public class Teste {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cadastra disciplinas
        Disciplina calc1 = new Disciplina("Cálculo 1", "calc1", 60);
        Disciplina calc2 = new Disciplina("Cálculo 2", "calc2", 60);
        Disciplina bancoDados = new Disciplina("Bancos de Dados", "bancoDados", 40);
        Disciplina gestaoProj = new Disciplina("Gestão de Projetos", "gestaoProj", 40);
        
        //Cadastra o curso de Engenharia de Produção
        Curso engProd = new Curso("Engenharia de Produção", "engProd");
        engProd.cadastrarDisciplina(calc1);
        engProd.cadastrarDisciplina(calc2);
        engProd.cadastrarDisciplina(gestaoProj);
        
        //Cadastra o curso de Tecnologia da Informação
        Curso tecInf  = new Curso("Tecnologia da Informação", "tecInf");
        tecInf.cadastrarDisciplina(calc1);
        tecInf.cadastrarDisciplina(calc2);
        tecInf.cadastrarDisciplina(bancoDados);
        
        //Cadastra Aluno João
        Aluno joao = new Aluno("João","123.456.789-00", 21, "ABC1234", engProd);
        joao.cadastrarEndereco("Rua Major Jerônimo", 452, "Centro", "12345-789");
        System.out.println(joao);
        
        //Cadastra Aluno Maria
        Aluno maria = new Aluno("Maria","987.654.321-00", 22, "ABC1241", engProd);
        maria.cadastrarEndereco("Rua Major Jerônimo", 456, "Centro", "12345-789");
        System.out.println(maria);
        
        //Matricula Alunos em Cálculo Dois
        joao.matricularDisciplina("calc2");
        maria.matricularDisciplina("calc2");
        System.out.println(engProd.consultarDisciplinaPorCodigo("calc2"));
        System.out.println(calc2.listaAlunos);
        
        //Cadastra alunos na lista de alunos
        Escola.gAlunos.cadastrarAluno(joao);
        Escola.gAlunos.cadastrarAluno(maria);
        
        //Cadastra cursos
        Escola.gCursos.cadastrarCurso(engProd);
        Escola.gCursos.cadastrarCurso(tecInf);
        Escola.gCursos.cadastrarCurso("Psicologia","psi");
        Escola.gCursos.cadastraDisciplinaCurso("tecInf", "Redes", "redes", 40);
        System.out.println(Escola.gCursos);
        
        //Transferir Maria para Tecnologia da Informação
        Escola.gAlunos.matricularAluno("ABC1241", "tecInf");
        
        //Testando métodos de gAlunos
        System.out.println(Escola.gAlunos.consultarAlunoPorMatricula("ABC1241"));
        System.out.println(Escola.gAlunos.consultarAlunoPorCurso("engProd"));
        System.out.println(Escola.gAlunos.consultarAlunoPorNome("Maria"));
        
        //Testando métodos de gCursos
        System.out.println(Escola.gCursos.consultarCursoPorSigla("engProd"));
        System.out.println(Escola.gCursos.consultarCursoPorNome("Tecnologia da Informação"));
    }
    
}
