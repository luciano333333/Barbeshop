
package Controller.Helpers;

import Model.Usuario;
import View.Loguin;


public class LoguinHelpers implements IHelper {
  private final Loguin view;

    public LoguinHelpers(Loguin view) {
        this.view = view;
    }

  @Override
  public Usuario obterModelo(){
      String nome=view.getTxtUsuario().getText();
      String senha=view.getTxtsenha().getText();
      Usuario modelo=new Usuario(0,nome,senha);
      return modelo;
  }  
  
  public void setarModelo(Usuario modelo){
      String nome=modelo.getNome();
      String senha= modelo.getSenha();
      
      view.getTxtUsuario().setText(nome);
      view.getTxtsenha().setText(senha);
      
  }
  
  @Override
  public void limparTela(){
     view.getTxtUsuario().setText("");
     view.getTxtsenha().setText("");
 
  
  
  
  }

  
   







}
