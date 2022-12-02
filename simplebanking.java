package banking;

import java.util.Scanner;

public class simplebanking {
	 Scanner in=new Scanner(System.in);
	
	 float deposit,withdraw,Transaction,balance;
	 void deposit()
	 {

         System.out.println("Enter the Deposit Amount :");
         deposit=in.nextFloat();
         if(deposit<0)
         {
         System.out.println(" your Deposit Amount is negative");
         }
         else {
        	 
         balance=balance+deposit;
         System.out.println("Your Deposited Amount :"+balance);
         
         }
         }
	 
	 void withdraw()
	 {  
	
         System.out.println("Enter the Withdraw amount : ");
         withdraw=in.nextFloat();
         System.out.println("Your Withdraw Amount :"+withdraw);
         if(withdraw>balance)
	      {
		 System.out.println("Your Transaction Doesn't Exist");
		 System.out.println("Please Try Again Later");
		 
	      }
         else
         {
        	 balance=balance-withdraw;
            
         }
	      
	 }
	 void Transactionamount()
	 {  
	
         System.out.println("Enter the Transaction amount : ");
         Transaction=in.nextFloat();
         System.out.println("Your Transaction Amount :"+Transaction);
         if(Transaction>balance)
	      {
		 System.out.println("Your Transaction Doesn't Exist");
		 System.out.println("Please Try Again Later");
		 
	      }
         else
         {
        	 balance=balance-Transaction;
            
         }
	      
	 }
	 void balance()
	 {
		 System.out.println("Your Available Balance= "+balance);
	 }   

	public static void main(String[] args) {
		
		 Scanner in=new Scanner(System.in);
          simplebanking b=new simplebanking();
          char z,x;
          long N1,N2;
          String D1,D2;
          
          System.out.println("ACCOUNT CREDIT/DEBIT or Trasaction /BALANCE DETAILS     ");
          System.out.println(" Enter the Account Holder Name : ");
          D1=in.next();
          System.out.println(" Enter the Account Number : ");
          N1=in.nextLong();
          System.out.println("Enter the Mobile Number : ");
          N2=in.nextLong();
          System.out.println(" Enter the Account Type : ");
          D2=in.next();
          
          while(true)
          {
        	  System.out.println("a.Depositamount");
        	  System.out.println("b.Withdrawamount");
        	  System.out.println("c.Transactionamount");
        	  System.out.println("d.Balanceamount");
          x=in.next().charAt(0);
          if(x=='a')
          { 
          b.deposit();
          }
          
          else if(x=='b')
          {
          b.withdraw();
          }
          else if(x=='c')
          {
          b.Transactionamount();
          }
          else if(x=='d')
          {
          b.balance();
          }
          else
          {
            System.out.println("You Entered Command is Wrong");	 
            System.out.println("Please Enter the Correct Command");
            	}
          System.out.println("Account Holder Name : "+D1);
          
          System.out.println("Account Number : "+N1);
          
          System.out.println("Enter the Mobile Number : "+N2);
          
          System.out.println("Enter the Account Type : "+D2);
         
      
          System.out.println("Press 'E' to exit or any other key to continue");
          z=in.next().charAt(0);
          if(z=='n')
        	  break;
          }
         
        
          
	}

}