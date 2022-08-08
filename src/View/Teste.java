
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;




public class Teste {
   public static void main(String[] args){
       
       
       Servico servico=new Servico(1,"bARBA",30);
       System.out.println(servico.getDescricao()+  servico.getValor());
       
       Cliente cliente = new Cliente(1,"PAMELA","rua A","36031536");
       System.out.println(cliente.getNome());
       
       
       
       Usuario usuario = new Usuario(123,"Lucas","234");
       System.out.println(usuario);
       
      
      


   
       Agendamento agendamento=new Agendamento(1,cliente,servico,30,"09/07/2021 11:50");
       System.out.println(agendamento.getCliente().getNome()+ agendamento.getData()+ agendamento.getServico().getDescricao());
       
       
      
     
       
      
   
   } 
}
