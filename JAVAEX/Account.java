//scanner class
import java.util.Scanner;
//main class declaration
class Account{
public static void main(String[] args){
//object creation
currentAccount accountOne=new currentAccount();
Scanner input=new Scanner(System.in);
//inputs from the user
//account id
System.out.println("Enter account_id number");
int acc_id=input.nextInt();
//account hoder name
System.out.println("Enter account_holder name");
String acc_name=input.next();
//initial balance
System.out.println("Enter account initial balance");
int bal=input.nextInt();
//saving info
accountOne.saveInfo(acc_id,acc_name,bal);
//deposit
System.out.println("Enter amount for deposit");
int deposit=input.nextInt();
accountOne.deposit(deposit);
//withdraw
System.out.println("Enter amount to withdraw");
int withdr=input.nextInt();
accountOne.withdraw(withdr);
//loan
System.out.println("Enter loan amount");
int lon=input.nextInt();
accountOne.Loan(lon);
//saving
System.out.println("Enter amaount to save");
int save=input.nextInt();
accountOne.saving(save);
accountOne.checkAllowedLoan();
int acc_no=accountOne.acc_no;
String name=accountOne.name;
float amount=accountOne.amount;
float loan=accountOne.loan;
float saving=accountOne.saving;
accountOne.displayACC(acc_no,name,amount,loan,saving);
}
}
//child classes
class currentAccount{
    int acc_no;
    String name;
    float amount;
    float loan=0;
    float saving=0;
    float allowedLoan=0;
    //variable initialization method
    void saveInfo(int no,String Fnam,float balance){
        acc_no=no;
        name=Fnam;
        amount=balance;
    }
//deposit method creation
  void deposit(int deposAmt){
  amount=amount+deposAmt;
  System.out.println("your current account balance is" +amount);
  }
  //withdraw method  creation
  void withdraw(int drawAmt){
    if(drawAmt>amount){
 System.out.println("sorry...!,you have insufficient balance");
    }else{
   amount=amount-drawAmt;
   System.out.println("your current account balance is" +amount);
    }
  }
    //create saving method
void saving(float savingAmt){
    if(amount<savingAmt){
        System.out.println("insufficient balance for being saved");
    }else{
        saving=saving+savingAmt;
        amount=amount-savingAmt;
        System.out.println("you saved" +savingAmt+ "cash..!");
        System.out.println("your current account balance is" +amount);
    }
}
void checkAllowedLoan(){
    allowedLoan=saving*4;
    System.out.println("you are allowed to loan amount equal to" +allowedLoan);
}
  //loan method defination
  void Loan(float loanAmt){
    if(allowedLoan<loanAmt){
  System.out.println("you are not allowed loan greater than your saving");
    }
    else{
 loan=loan+loanAmt;
 amount=amount+loanAmt;
 System.out.println("your current account balance is" +amount);
    }
  }
  //display account status method
  void displayACC(int no,String name,float bal,float loan,float save){
    System.out.println("\n");
    System.out.println("bank account statistics");
    System.out.println("-----------------------");
    System.out.println("account_number:" +no);
    System.out.println("account_holder name:" +name);
    System.out.println("account_balance:" +bal);
    System.out.println("loan_balance:" +loan);
    System.out.println("saving_balance:" +save);
  }
}


