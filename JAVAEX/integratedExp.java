class integratedExp{
public static void main(String args[]){
for(int i=1;i<=10;i++){
    int multiplier=2;
    System.out.println("\n");

    if(multiplier==i){
        continue;
        }
         while(multiplier<=12){
            if(multiplier==12){
   System.out.println("the last multiplier\n");
   break;
 }
System.out.printf("%d x %d =%d \n",i,multiplier,i*multiplier);
 multiplier++;

  }
}
}
}