package ValidadorDeContraseñas;

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
