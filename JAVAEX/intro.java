import java.util.Scanner;
class intro{
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
       System.out.println("enter the word which cointains:oit,joh and lect to guess derivered names \n");
      String name = input.nextLine();
      if(name.contains("oit")){

        System.out.println("the name is believed to be Benoit \n");
      }
      else if (name.contains("joh")){
       System.out.println("this name might be john \n");
      }
      else if (name.contains("lect")){
       System.out.println("this word might be lecturer  \n");
      }
      else{
        System.out.println("nothing likely to look the same \n");
      }
    }
}