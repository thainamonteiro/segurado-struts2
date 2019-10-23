package interceptors;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import model.Login;

public class AuthenticationInterceptor implements Interceptor{
	
	private static final long serialVersionUID = -5011962009065225959L;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		ActionInvocation actionInvocation = null;
		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		
		Login login = (Login) sessionAttributes.get("Login");
		
		if(login == null) {
			return Action.LOGIN;
		}else {
			Action action = (Action) actionInvocation.getAction();
			if(action instanceof Login) {
				((UserAware) action).setLogin(login);
			}
			return actionInvocation.invoke();
		}
	}

}
