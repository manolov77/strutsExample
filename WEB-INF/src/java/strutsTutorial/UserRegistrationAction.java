package strutsTutorial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;




public class UserRegistrationAction extends Action {
	private static Log log = LogFactory.getLog(UserRegistrationAction.class);
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		log.trace("In execute method of UserRegistrationAction");
		
		if (isCancelled(request)){
			log.debug("Cancel Button was pushed!");
			return mapping.findForward("welcome");
		}
//		return new ActionRedirect(mapping.findForward("sdfsdf"));
		return mapping.findForward("success");
	}
}