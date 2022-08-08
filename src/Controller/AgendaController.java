
package Controller;

import Controller.Helpers.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    private final Agenda View;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda View) {
        this.View = View;
        this.helper=new AgendaHelper(View);
    }
    
    public void atualizarTabela(){
        //Busca lista de agendamentos no banco de dados.
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibe lista na view.
        helper.preencherTabela(agendamentos );
        
    }
    public void atualizaCliente(){
        //Busca clientes do banco de dados.
        ClienteDAO clienteDAO= new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir clientes no Combobox Cliente.
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        //Busca servico do banco de dados.
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibir servicos no Combobox servico.
        helper.preecherServico(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor()); 
        
    }
   
    public void agendar(){
        //Buscar objeto agendamento na tela.
        Agendamento agendamento=helper.obterModelo();
        
        //Salvar objeto no banco de dados.
        new AgendamentoDAO().insert(agendamento);
        Correio correio = new Correio();
        correio.notificarPorEmail(agendamento);
        //Inserir elemento na tabela.
        atualizarTabela();
        helper.limparTela();
    }
}
