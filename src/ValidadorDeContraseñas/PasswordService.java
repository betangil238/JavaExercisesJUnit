package ValidadorDeContraseñas;

public class PasswordService {
	PasswordValidator ps= new PasswordValidator();
	
	public boolean containSpecialChar(String password) {
		String special = "+-*/=%&#!?^“‘~|<>()[]{}:;.,\'";
		char[] arrayPassword = password.toCharArray();

		for (int x=0;x<arrayPassword.length;x++) {
			if(special.indexOf(arrayPassword[x])!=-1) {
				  return true;
			  }
		}
		return false;	  
	}
	
	public boolean containUpper(String password) {
		char[] arrayPassword = password.toCharArray();
		for (int x=0;x<arrayPassword.length;x++) {
			if(Character.isUpperCase(arrayPassword[x])) {
				  return true;
			  }
		}
		return false;	  
	}
	
	public boolean minimumlength(String password) {
		if (password.length()<ps.getLengthPassword()) {
			return false;
		}else {
			return true;
		}
	}



}
