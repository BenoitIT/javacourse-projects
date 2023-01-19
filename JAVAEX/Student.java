import java.util.Scanner;
public class Student {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the marks of the student over 10 \n");
int marks=input.nextInt();
switch(marks){
    case 2:
     case 1:
      case 3:
    System.out.println("this student was very incompetent \n");
    break;
    case 4:
    case 5:
    System.out.println("the student was incompetent \n");
    break;
    case 6:
     case 7:
      case 8:
       case 9:
    System.out.println("the student was good in the course \n");
    break;
    case 10:
    System.out.println("the student was excellent");
}
}
}