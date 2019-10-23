package interceptors;

import model.Login;

public interface UserAware {
	public void setLogin(Login login);
}
