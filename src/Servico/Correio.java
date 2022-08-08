
package Servico;

import Model.Agendamento;


public class Correio {
    public void notificarPorEmail(Agendamento agendamento){
        String emailFormatado=formarEmail(agendamento);
        String destinatario=agendamento.getCliente().getEmail();
        
        //Uso da classe email.
        
        Email email = new Email("Agendamento Barbearia",emailFormatado,destinatario);
        email.enviar();
    }

    private String formarEmail(Agendamento agendamento) {
        String nomeCliente=agendamento.getCliente().getNome();
        String servico=agendamento.getServico().getDescricao();
        String dataAgendamento=agendamento.getDataFormatada();
        String horaAgendamento=agendamento.getHoraFormatada();
        float valor =agendamento.getValor();
        
        return "Ola"+nomeCliente+"  Muito prazer em recebleo em nossa barbearia... Seu agendamento para "
                + servico + " , esta marcado para o dia"+ dataAgendamento + " ás "
                + horaAgendamento + " O precoço para voce sai baratin fica "+ valor + " Forte Abraço!!!";

    }
}
