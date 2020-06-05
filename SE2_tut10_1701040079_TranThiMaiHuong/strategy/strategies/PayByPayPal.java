package tuts.tut10.to_dos.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete strategy. Implements PayPal payment method.
 */
public class PayByPayPal implements PayStrategy {
	private static final Map<String, String> DATA_BASE = new HashMap<>();
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private String email;
	private String password;
	private boolean signedIn;

	static {
		// TO-DO: 'put' some test data (password & email) to DATA_BASE
		DATA_BASE.put("1234", "example@email.com");
		DATA_BASE.put("s2020", "se2@email.vn");

	}

	// TO-DO: Implement the collectPaymentDetails() method
	/**
	 * Collect customer's data.
	 */
	@Override
	public void collectPaymentDetails() {
		// TO-DO: Add 'try-catch' block to catch the IO error
		try {
			while (!signedIn) {
				// TO-DO: Ask for email & password then save them to suitable variables
				System.out.println("Enter user's email: ");
				email = READER.readLine();
				System.out.println("Enter password: ");
				password = READER.readLine();
				// TO-DO: Verify the input values then display suitable message
				if (verify()) {
					System.out.println("successful verification!");
				} else {
					System.out.println("Invalid email or password!!");
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private boolean verify() {
		setSignedIn(email.equals(DATA_BASE.get(password)));
		return signedIn;
	}

	// TO-DO: Implement the pay() method
	/**
	 * Save customer data for future shopping attempts.
	 */
	@Override
	public boolean pay(int paymentAmount) {
		/*
		 * if customer already 'signedIn' => display a message to show that customer is
		 * paying with PayPal with money amount then return true else return false
		 */
		if (signedIn) {
			System.out.println("You're paying " + paymentAmount + " using PayPal!");
			return true;
		} else {
			return false;
		}
	}

	private void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}
}