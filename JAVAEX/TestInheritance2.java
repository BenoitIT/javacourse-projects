class TestInheritance2{
public static void main(String args[]){
BabyDog d=new BabyDog();
d.move();
d.bark();
d.eat();
}}
class Animal{
void eat(){
    System.out.println("eating...");
}
}
class Dog extends Animal{
void bark(){
    System.out.println("barking...");
    }
}
class BabyDog extends Dog{
void move(){
    System.out.println("moving...");
    }
}
