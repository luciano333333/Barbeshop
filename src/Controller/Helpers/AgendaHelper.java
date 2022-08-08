
package Controller.Helpers;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class AgendaHelper implements IHelper {
    
    private final Agenda View;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      
        DefaultTableModel tableModel =  (DefaultTableModel) View.getjTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o table MODEL.
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                
              agendamento.getId(),
              agendamento.getCliente().getNome(),
              agendamento.getServico().getDescricao(),
              agendamento.getValor(),
              agendamento.getDataFormatada(),
              agendamento.getHoraFormatada(),
              agendamento.getObsevacao()
           
            });
        }
        
        
        
        
        
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
     DefaultComboBoxModel comboBoxModel=(DefaultComboBoxModel) View.getjComboBoxCliente().getModel();
       
     for (Cliente cliente : clientes) {
           comboBoxModel.addElement(cliente);
        }
    
    }

  
    public void preecherServico(ArrayList<Servico> servicos) {
         
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) View.getjComboBoxServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
    public Cliente obterCliente(){
         return (Cliente)View.getjComboBoxCliente().getSelectedItem();
    }
   
    public Servico obterServico() {
      return (Servico)View.getjComboBoxServico().getSelectedItem();

    }

    public void setarValor(float valor) {
     View.getTextValor().setText(valor+"");

    }

    @Override
    public Agendamento obterModelo() {
     
   String idString=View.getTextID().getText();
   int id=Integer.parseInt(idString);
   Cliente cliente=obterCliente();
   Servico servico=obterServico();
   String valorString=View.getTextValor().getText();
   float valor=Float.parseFloat(valorString);
   String data=View.getTextData().getText();
   String hora=View.getTextHora().getText();
   String dataHora=data+" "+hora;
   String obsevacao=View.getTextObsevacao().getText();
   
   Agendamento agendamento=new Agendamento(id,cliente,servico,valor,dataHora,obsevacao);
   return agendamento;
   
   
   
    }

    @Override
    public void limparTela() {
      View.getTextID().setText("0");
      View.getTextData().setText("");
      View.getTextHora().setText("");
      View.getTextObsevacao().setText("");
      

    }
    
    
    
    
    
    
    
}
