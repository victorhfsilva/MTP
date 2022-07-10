/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarquivotexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ufavictorhfsilva
 */
public class ExemploArquivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File arquivo = new File("exemplo.txt");
        try{ 
            Scanner entrada = new Scanner(arquivo);
            while (entrada.hasNext()){
                String leitura = entrada.nextLine();
                System.out.println(leitura);
            }       
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }
        
        try {
            FileReader arquivo2 = new FileReader("exemplo.txt");
            BufferedReader entrada2 = new BufferedReader(arquivo2);
            while (entrada2.ready()){
                String linha = entrada2.readLine();
                System.out.println(linha);
            }  
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }
        catch (IOException e){
            System.out.println("Arquivo não encontrado.");
        }
        
        try{
            FileWriter arquivo3 = new FileWriter("exemplo2.txt");
            arquivo3.write("Sequência Fibonacci");
            long j = 1;
            long jAnt = 1;
            long jAntAnt = 0;
            while (j<999999999){
              j=jAnt+jAntAnt;
              jAntAnt = jAnt;
              jAnt = j;
              arquivo3.write("\n"+j);
            }
            arquivo3.flush();
            arquivo3.close();
        }
        catch (IOException e){
            System.err.println("Problema na escrita do arquivo.");
        }
    }
}
