class doWhileLoop{
    public static void main(String[] testcodes){
      int i=1;
        int multiplier=2;
        do{
            if(i%2==0){
            System.out.printf("even number %d x number  %d = equal to %d \n",i,multiplier,i*multiplier);
            }
            else if(i%2!=0){
            System.out.printf("odd number %d x %d =%d \n",i,multiplier,i*multiplier);
            }
            else{
                System.out.printf("the number is equal to zero hence it is indivisable");
            }
            i++;
        }
        while(i<=12);
    }
}