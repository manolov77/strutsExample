package strutsTutorial;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import javax.servlet.http.HttpServletRequest;

public class UserRegistrationForm extends ActionForm {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String passwordCheck;
	private String email;
	private String phone;
	private String fax;
	private boolean registered;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		firstName = null;
		lastName = null;
		userName = null;
		password = null;
		passwordCheck = null;
		email = null;
		phone = null;
		fax = null;
		registered = false;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (firstName == null || firstName.trim().equals("")) {
			errors.add("firstName", new ActionError(
					"userRegistration.firstName.problem"));
		}
		
		if(userName == null || userName.trim().equals("")){
			errors.add("userName",new ActionError("userRegistraion.userName.problem"));
		}
			
		return errors;
	}

}
