
public class CarRegisterException extends RuntimeException{
	
	public CarRegisterException(){
		super("Error in Car Application");
	}
	
	public CarRegisterException(String message) {
		super(message);
	}
}
