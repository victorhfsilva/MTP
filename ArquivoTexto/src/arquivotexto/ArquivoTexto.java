/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivotexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class ArquivoTexto {

    public static ArrayList<Cliente> listaClientes = new ArrayList();
    
    public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void importarCSV(String nomeArq){
        try {
            FileReader arq = new FileReader(nomeArq);
            BufferedReader in = new BufferedReader(arq);
         
            while (in.ready()){
                String linha = in.readLine();
                String[] info = linha.split(";");
                Cliente c = new Cliente(info[0], info[1], info[2], info[3]);
                System.out.println(c.toString());
                listaClientes.add(c);
            }  
        }
        catch (FileNotFoundException e){
            System.err.println("Arquivo não encontrado.");
        }
        catch (IOException e){
            System.err.println("Problema na leitura do arquivo.");
        }
    }
    
    public static void exportarCSV(String nomeArq){
        String conteudo = "";
        for (int i = 0; i<listaClientes.size(); i++){
           conteudo += listaClientes.get(i).toCSV()+ "\n";
           System.out.println(listaClientes.get(i).toCSV());
        }
        try{
            FileWriter arq = new FileWriter(nomeArq);
            arq.write(conteudo);
            arq.flush();
            arq.close();
        }
        catch (IOException e){
            System.err.println("Erro na escrita do arquivo.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente victor = new Cliente("Victor Silva","123.456.789-00","09/06/1994","victor@ufu.br");
        System.out.println(victor.toString());
        
        importarCSV("ArquivoTextoClientes3.csv");
        
        System.out.println("");
        listaClientes.add(victor);
        listaClientes.add(new Cliente("Bárbara Oliveira", "987.654.321-00","06/09/2000","barbara@ufu.br"));
        for (int i = 0; i<listaClientes.size(); i++){
            System.out.println(listaClientes.get(i).toString());
        }
        
        System.out.println("");
        exportarCSV("ArquivoTextoClientes2.csv");
    }
    
}
