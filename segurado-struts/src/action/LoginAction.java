package action;

import com.opensymphony.xwork2.ActionSupport;

import persistence.DaoLogin;

public class LoginAction extends ActionSupport { 
	
    private String usuario; 
    private String senha; 
  
    public String execute() { 
    	
    	DaoLogin dao_login = new DaoLogin();
    	
        if ( ) {
            return "success"; 
        } else { 
            addActionError(getText("error.login")); 
            return "error"; 
        } 
    } 
  
    public String getUsuario() { 
        return usuario; 
    } 
  
    public void setUsuario(String usuario) { 
        this.usuario = usuario; 
    } 
  
    public String getSenha() { 
        return senha; 
    } 
  
    public void setSenha(String senha) { 
        this.senha = senha; 
    } 
} 
