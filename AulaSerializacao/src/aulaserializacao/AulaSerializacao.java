/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaserializacao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ufavictorhfsilva
 */
public class AulaSerializacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList();
        listaClientes.add(new Cliente("Ana","1111"));
        listaClientes.add(new Cliente("João","2222"));
        listaClientes.add(new Cliente("Maria","3333"));
        listaClientes.add(new Cliente("Geovana","4444"));
        
        
        try {
            //Abrir
            String nomeArq = "clientes.bin";
            FileOutputStream arqEscrita = new FileOutputStream(nomeArq);
            ObjectOutputStream objSaida = new ObjectOutputStream(arqEscrita);
            
            //Gravar
            for (Cliente cliente : listaClientes){
                objSaida.writeObject(cliente);
            }
            
            //Fechar
            objSaida.close();
            
        }
        catch (FileNotFoundException ex){
            System.err.println("Arquivo não encontrado.");
        }
        catch (IOException ex){
            System.err.println("Problema no arquivo.");
        }
        
        ArrayList<Cliente> novaLista = new ArrayList();
        try {
            //Abrir
            String nomeArq = "clientes.bin";
            FileInputStream arqEscrita = new FileInputStream(nomeArq);
            ObjectInputStream objEntrada = new ObjectInputStream(arqEscrita);
            
            //Ler
            boolean continua = true;
            while (continua){
                try{
                Cliente ana = (Cliente)objEntrada.readObject();
                novaLista.add(ana); //readObject retorna Object
                System.out.println(ana);
                }
                //End of File Exception
                catch(EOFException e){ 
                    continua = false;
                }
            }
            
            //Fechar
            objEntrada.close();
            
        }
        catch (FileNotFoundException ex){
            System.err.println("Arquivo não encontrado.");
        }
        catch (IOException ex){
            System.err.println("Problema no arquivo.");
        }
        catch (ClassNotFoundException ex){
            System.err.println("Classe Errada.");
        }
    }
    
}
