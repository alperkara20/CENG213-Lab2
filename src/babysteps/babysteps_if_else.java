package babysteps;

public class babysteps_if_else {

	int x = 5;
	int y = 6;
	
	public void compare() {
	if (x > y)
		System.out.println("X is greater than Y");
	else
		System.out.println("X is NOT greater than Y");
	
	String message = (x>y) ? "X is greater than Y" : "X is NOT greater than Y";
	System.out.println(message);
	}
}
