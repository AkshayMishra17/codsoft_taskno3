import java.util.*;

public class atminterface
{
  
 
    // Display current balance in account
  public static void displayBalance (int balance) 
  {
    
System.out.println ("Current Balance : " + balance);
    
System.out.println ();
  
} 
 
    // Withdraw amount and update the balance
  public static int amountWithdrawing (int balance, 
int withdrawAmount) 
  {
    
System.out.println ("Withdrawn Operation:");
    
System.out.println ("Withdrawing Amount : " 
 +withdrawAmount);
    
if (balance >= withdrawAmount)
      {
	
balance = balance - withdrawAmount;
	
System.out.
	  println (
"Please collect your money and collect the card");
	
displayBalance (balance);
      
}
    
    else
      {
	
System.out.println ("Sorry! Insufficient Funds");
	
System.out.println ();
      
}
    
return balance;
  
}
  
 
    // Deposit amount and update the balance
  public static int amountDepositing (int balance, 
int depositAmount) 
  {
    
System.out.println ("Deposit Operation:");
    
System.out.println ("Depositing Amount : " 
 +depositAmount);
    
balance = balance + depositAmount;
    
System.out.println (
"Your Money has been successfully deposited");
    
displayBalance (balance);
    
return balance;
  
}
  
 
public static void main (String args[]) 
  {
    
Scanner sc = new Scanner (System.in);
    
int balance = 320000;
    
System.out.println("your total balance is : " + balance);
 
System.out.println ("To withdraw an amount click  : W");
    
System.out.println ("To check your current balance click : C");
    
System.out.println ("To deposit an amount click : D");
    
char todo = sc.next ().charAt (0);
    
 
if (todo == 'W')
      {
	
System.out.println ("enter an amount to be withdrawn");
	
int withdrawAmount = sc.nextInt ();
	
amountWithdrawing (balance, withdrawAmount);
      
}
    else if (todo == 'C')
      {
	
displayBalance (balance);
      
}
    else
      {
	
System.out.println ("enter an amount to be deposited");
	
int depositAmount = sc.nextInt ();
	
amountDepositing (balance, depositAmount);

        } 
    } 
}
