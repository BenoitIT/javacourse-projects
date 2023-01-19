import java.util.Scanner;
class QuestionTwo{
public static void main(String[] args){
    //object creation
ChildClass test=new ChildClass();
//system inputs
Scanner input=new Scanner(System.in);
System.out.println("what is your start up cash at the bank");
int cash=input.nextInt();
System.out.println("how much money have you saved?");
int saves=input.nextInt();
//method calling
test.stateChild();
test.stateClassOne(cash,saves);
}
}
//parent class one
class parentClassOne{
    void stateClassOne(int a, int b){
        int saving=a;
        int startups=b;
        int sum=saving+startups;
        System.out.println("the total money at bank seems to be like"+sum);
    }
}
//interface
interface parentClassTwo{
        int allowedLoan=30000;
        int grantedLoan=4000;
        float loanBalance=allowedLoan-grantedLoan;
        String observation="you allowed loan balance at bank is "+loanBalance;
}
//child class
class ChildClass extends parentClassOne implements parentClassTwo{
    void stateChild(){
       System.out.println("this is a child class");
       System.out.println(observation);
    }
}
