package atividade;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Sistema {
    static int op;
    static ArrayList<Conta> contas = new ArrayList<>();
    public static void main(String[] args) {
        acessarMenu();
    }
    
    public static void acessarMenu() {
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "0 - SAIR \n 1 - CADASTRAR CONTA\n 2 - CONSULTAR CONTA\n 3 - TRANSFERIR SALDO"));

                switch(op){
                    case 1: cadastrarConta(); break;
                    case 2: consultarConta(); break;
                    case 3: transferirPConta(); break;
                }
        }while(op!=0);
    
    }
    public static void cadastrarConta() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "0 - CANCELAR \n 1 - PROSSEGUIR"));

        
        contas.add(c); 
    }

    public static void consultarConta() {
    }

    public static void transferirPConta() {
    }


    
    
}
