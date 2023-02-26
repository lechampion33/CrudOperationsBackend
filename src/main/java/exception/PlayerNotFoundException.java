package exception;


@SuppressWarnings("serial")
public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException(int id) {
    	super("Could Not Found the Player with the id "+id);
    }
}
