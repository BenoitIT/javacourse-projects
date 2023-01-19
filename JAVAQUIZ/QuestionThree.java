//scanner class
import java.util.Scanner;
//main class declaration
class QuestionThree{
public static void main(String[] args){
//object creation
bankAccount accountOne=new bankAccount();
Scanner input=new Scanner(System.in);
//inputs from the user
//account id
System.out.println("Enter account_id number");
int acc_id=input.nextInt();
//account hoder name
System.out.println("Enter account_holder name");
String acc_name=input.next();
//saving info
accountOne.saveInfo(acc_id,acc_name);
//deposit
System.out.println("Enter amount for deposit");
int deposit=input.nextInt();
accountOne.deposit(deposit);
//withdraw
System.out.println("Enter amount to withdraw");
int withdr=input.nextInt();
accountOne.withdraw(withdr);
//saving
System.out.println("Enter amaount to save");
int save=input.nextInt();
accountOne.saving(save);
accountOne.checkAllowedLoan();
//loan
System.out.println("Enter loan amount");
int lon=input.nextInt();
accountOne.Loan(lon);
int acc_no=accountOne.acc_no;
String name=accountOne.name;
float amount=accountOne.amount;
float loan=accountOne.loanedOf;
float saving=accountOne.saving;
accountOne.displayACC(acc_no,name,amount,loan,saving);
}
}
//child classes
class bankAccount{
    int acc_no;
    String name;
    float amount;
    float initialamount=1000000;
    float deposits=500000;
    float withdraws=0;
    float loanedOf=0;
    float saving=300000;
    float allowedLoan=0;
    //variable initialization method
    void saveInfo(int no,String Fnam){
        acc_no=no;
        name=Fnam;
    }
//deposit method creation
  void deposit(int deposAmt){
  amount=initialamount+deposAmt;
  deposits=deposits+deposAmt;
  System.out.println("your current account balance is" +"" +amount);
  System.out.println("your total deposits is"+""  +deposits);
  }
  //withdraw method  creation
  void withdraw(int drawAmt){
    if(initialamount/2<drawAmt){
 System.out.println("sorry...!,you have should not withdraw more than your initial balance");
    }else{
   amount=amount-drawAmt;
   withdraws=withdraws+drawAmt;
   System.out.println("your current account balance is"+"" +amount);
   System.out.println("you withdrawn" +drawAmt);
   System.out.println("you have cumulative withdraws equal tp"+""  +withdraws);
    }
  }
    //create saving method
void saving(float savingAmt){
    if(amount<savingAmt){
        System.out.println("insufficient balance for being saved");
    }else{
        saving=saving+savingAmt;
        amount=amount-savingAmt;
        System.out.println(savingAmt +"" +"cash.. saved!");
        System.out.println("your current account balance is" +"" +amount);
    }
}
void checkAllowedLoan(){
    allowedLoan=saving*10;
    System.out.println("you are allowed to loan amount equal to" +"" +allowedLoan);
}
  //loan method defination
  void Loan(float loanAmt){

 loanedOf=loanedOf+loanAmt;
 amount=amount+loanAmt;
 System.out.println("your current account balance is" +"" +amount);

  }
  //display account status method
  void displayACC(int no,String name,float bal,float loan,float save){
    System.out.println("\n");
    System.out.println("bank account statistics");
    System.out.println("-----------------------");
    System.out.println("account_number:" +"" +no);
    System.out.println("account_holder name:" +"" +name);
    System.out.println("account_balance:" +"" +bal);
    System.out.println("loan_balance:" +"" +loanedOf);
    System.out.println("saving_balance:"+""  +save);
  }
}


