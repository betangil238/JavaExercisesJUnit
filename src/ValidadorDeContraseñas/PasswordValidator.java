package ValidadorDeContraseñas;
//Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
//reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
//Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
//correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
public class PasswordValidator {
	private int lengthPassword=15;
	private boolean haveUpper;
	private boolean haveSpecialChar;
	
	
	public PasswordValidator() {
		super();
	}


	public PasswordValidator(int lengthPassword, boolean haveUpper, boolean haveSpecialChar) {
		super();
		this.lengthPassword = lengthPassword;
		this.haveUpper = haveUpper;
		this.haveSpecialChar = haveSpecialChar;
	}


	public int getLengthPassword() {
		return lengthPassword;
	}


	public void setLengthPassword(int lengthPassword) {
		this.lengthPassword = lengthPassword;
	}


	public boolean isHaveUpper() {
		return haveUpper;
	}


	public void setHaveUpper(boolean haveUpper) {
		this.haveUpper = haveUpper;
	}


	public boolean isHaveSpecialChar() {
		return haveSpecialChar;
	}


	public void setHaveSpecialChar(boolean haveSpecialChar) {
		this.haveSpecialChar = haveSpecialChar;
	}
	
}
