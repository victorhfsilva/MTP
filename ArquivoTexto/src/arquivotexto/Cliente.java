/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivotexto;

import java.util.Date;

/**
 *
 * @author ufavictorhfsilva
 */
public class Cliente {
    
    String nome;
    String cpf;
    Date dataNascimento;
    String email;

    public Cliente(String nome, String cpf, String dataNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        try {
            this.dataNascimento = ArquivoTexto.formato.parse(dataNascimento);
        }
        catch (Exception e){
            System.err.println("Data Inválida");
        }
        this.email = email;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + ArquivoTexto.formato.format(dataNascimento) + ", email=" + email + '}';
    }
    
    public String toCSV(){
        return nome + ";" + cpf + ";" + ArquivoTexto.formato.format(dataNascimento) + ";" + email;
    }
}
