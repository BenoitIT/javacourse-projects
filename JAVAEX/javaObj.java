class javaObj{
  public static void main(String[] args){
        //object creation
        Main call=new Main();
        Main callTwo=new Main();
        //method calling
        call.introduce("john",30);
        call.saveMarks(10,30,14);
        callTwo.saveMarks(100,30,34);
        double averageOne=call.avgMarks(call.maths,call.french,call.eng);
        double averageTwo=callTwo.avgMarks(callTwo.maths,callTwo.french,callTwo.eng);
        System.out.println("avarage of marks=" +averageOne);
        System.out.println("avarage of marks=" +averageTwo);
    }
}
class Main{
    // variable declaration
    int maths;
    int french;
    int eng;
    //methods definition
    void introduce(String name,int age){
        System.out.printf("my name is %s, I am %d years old \n",name,age);
    }
     void saveMarks(int engl,int frenchs,int math){
        french=frenchs;
        eng=engl;
        maths=math;
    }
    public double avgMarks(int markOne,int markTwo,int markThree){
        int sum= markOne+markTwo+markThree;
        double avarage=sum/3;
     return avarage;
    }

}
//end of the first class.
