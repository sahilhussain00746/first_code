class Vehicle{
     void honk(){
     System.out.println("Vehicle honk");
}
}
class Car extends Vehicle{
        void speed(){
         System.out.println("Car has Speed");
}
}
public class Inheritance{
public static void main(String[] args){
Car cac = new Car();
cac.speed();
cac.honk();
}
}