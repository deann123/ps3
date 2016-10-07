import java.util.Calendar;
import java.util.Date;



public class Test {
	public static void main(String[] args) {
        // create a new account with specific information   
		Account a = new Account(1122,20000,0.045);
       
		// withdraw and deposite 
		a.withdraw(2500);
		a.deposit(3000);
		
        //print all the information down
		System.out.println("Your balance is " + a.getBalance());
		System.out.println("Your monthly interest is"+ a.getMonthlyInterestRate());
		System.out.println("The date you created your account is"+ a.getDateCreated());

	}
}
