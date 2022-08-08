
package Controller;

import Controller.Helpers.LoguinHelpers;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Loguin;
import View.MenuPrincipal;

public class LoguinController {

    private final Loguin View;
    private LoguinHelpers helper; 
    
    public LoguinController(Loguin view){
     this.View=view;   
     this.helper=new LoguinHelpers(view);
    
    }
    public void entrarNoSistema(){
       //Pegar um usuario na view.
        Usuario usuario=helper.obterModelo();
    
        //Pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
          MenuPrincipal menu=new MenuPrincipal();
          menu.setVisible(true); 
          this.View.dispose();
        }else{
          this.View.exibeTarefa("Usuario ou senha Invalidos!!!");
        }
       
    
    }
   
    
    
    
    
    public void fizTarefa(){
        
        System.out.println("Busquei do Banco de Dados. ");
        
        this.View.exibeTarefa("Executei o fiz tarefa");
    }
    
    
}
