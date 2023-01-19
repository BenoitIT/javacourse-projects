import java.util.Scanner;
class QuestionOne{
    public static void main(String[] args){
        //system inputs
    Scanner input=new Scanner(System.in);
    System.out.println("enter your age");
    int age=input.nextInt();
    //condition chacking
    if(age>18){
    System.out.println("you are eligible to start");
    }
    else if(age<=16){
    System.out.println("please register in teenagers");
    }
    else{
    System.out.println("be patient to start next year");
    }
    }
}