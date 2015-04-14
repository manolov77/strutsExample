package strutsTutorial;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DisplayUsersAction extends Action {
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	
	List<User> users = new ArrayList<User>();
	users.add(new User("Peter Manolov"));
	users.add(new User("Iva Manolova"));
	request.setAttribute("users", users);
	
	return mapping.findForward("success");
}
}
