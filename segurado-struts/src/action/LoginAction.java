package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Login;
import persistence.DaoLogin;

public class LoginAction extends ActionSupport { 
	
    private String usuario; 
    private String senha; 
  
    public String execute() { 
    	
    	DaoLogin dao = new DaoLogin();
    	Login login = new Login(this.usuario, this.senha);
    	
        if (dao.checkLogin(login)) {
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
