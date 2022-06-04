/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author ufavictorhfsilva
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public Pessoa(String nome, String cpf, int idade, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Cadastra o Endereço
     * @param logradouro Logradouro
     * @param numero Número
     * @param bairro Bairro
     * @param cep CEP
     */
    public void cadastrarEndereco(String logradouro, int numero, String bairro, String cep){
        try{
            if(numero<=0) throw new Exception();
            endereco = new Endereco(logradouro, numero, bairro, cep);
        }
        catch (Exception e){
            System.out.println("Erro: Número Inválido.");
        }
    }
    
    @Override
    public String toString() {
        return "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", "+endereco;
    }
    
}
