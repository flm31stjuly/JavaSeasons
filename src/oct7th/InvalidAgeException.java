package oct7th;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException()
	{
		super("Invalid age ..not eligible for registraion ...");
	}

}
