package lesson021;

public enum EErrorType {

	OUT_OF_BOUNDS(1000, "Sınırların dışında yük yeri"),
	SEAT_ALREADY_OCCPUIED(1001, "Seçilen yer dolu"),
	INVALID_WEIGHT(1002, "Seçilen yer dolu"),
	OUT_OF_SHIFT_DAY(1003, "Cuma günleri ürün kabul edilemiyor"),
	PAST_DATE(1004, "Geçmiş bir tarih giremezsiniz");
	
	private String message;
	private int code;
	
	
	
	private EErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
}
