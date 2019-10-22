package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class DeleteSeguroAction extends ActionSupport {
	
	int idseguro;
	
	@Override
	public String execute() throws Exception{
		try {
			DaoSeguro dao = new DaoSeguro();

			dao.delete(idseguro);
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	public int getIdseguro() {
		return idseguro;
	}

	public void setIdseguro(int idseguro) {
		this.idseguro = idseguro;
	}		
}
