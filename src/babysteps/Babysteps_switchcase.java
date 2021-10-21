package babysteps;

public class Babysteps_switchcase {

	int x = 3;
	int y = 5;
	
	public void switchCase() {
	int op_type = 5;
	int the_result = 0;
	boolean error_flag = false;
	
	switch(op_type) {
	case 0:
		the_result = x + y;
		break;
	case 1:
		the_result = x - y;
		break;
	case 2:
		the_result = x*y;
		break;
	case 3:
		the_result = (int)(x/y);
		break;
	default:
		error_flag = true;
	}
	
	if(error_flag)
		System.out.println("Error babycakes.");
	else
		System.out.println("Result is: " + the_result);
	
	}
}
