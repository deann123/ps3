
import java.util.Date;


public class Account {
// create a data field id
	private int id=0;
	
// create a double field balance
	private double balance=0;

//create a double date field annualInterestRate
	private double Rate=0;

//stores data when the account is created
    private Date dateCreated;
	
//create an account
	public Account(){
 
	}
	
//A constructor gives specific value
	public Account(int i, double b, double r)
	{

	this.id = i;
	this.balance = b;
    this.Rate = r;
	}
	
	//The accessor method for id
	public int getId() {
		return id;
		}
//The mutator for id
	public void setId(int id) {
		this.id = id;
		}
//The accessor for balance
	public double getBalance() {
		return balance;
	    }
//The mutator for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
//The accessor for rate	
	public double getRate() {
		return Rate;
		}
//The mutator for rate	
	public void setRate(double Rate) {
		this.Rate = id;
}
//The accessor for date create
	public Date getDateCreated() {
		return dateCreated;
		}
	
	
//A method returns monthly interest rate
	public double getMonthlyInterestRate()
	{
	return (this.getRate()/12);
	}

//A method withdraw money from account
	public double withdraw(double balance)
	{
	this.setBalance(this.getBalance()-balance);
	return this.getBalance();
	}
	
//A method deposit money into the account
	public double deposit(double balance)
	{
	this.setBalance(this.getBalance()+balance);
	return this.getBalance();
	}
}
