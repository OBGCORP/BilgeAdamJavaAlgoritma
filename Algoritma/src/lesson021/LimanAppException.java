package lesson021;

public class LimanAppException extends RuntimeException{

	private EErrorType eErrorType;

	public LimanAppException(EErrorType eErrorType) {
		super(eErrorType.getMessage());
		this.eErrorType = eErrorType;
	}
	
	public LimanAppException(EErrorType eErrorType, String message) {
		super("message");
		this.eErrorType = eErrorType;
	}

	public EErrorType geteErrorType() {
		return eErrorType;
	}

	public void seteErrorType(EErrorType eErrorType) {
		this.eErrorType = eErrorType;
	}
	
}
