import java.time.LocalDateTime;
public class Transcation {

		    private String type;
		    private double amount;
		    private LocalDateTime timestamp;

		    public void Transaction(String type, double amount)
		    {
		        this.type = type;
		        this.amount = amount;
		        this.timestamp = LocalDateTime.now();
		    }

		   
		    public String toString() {
		        return "[" + timestamp + "] " + type + ": $" + amount;
		    }
		}

