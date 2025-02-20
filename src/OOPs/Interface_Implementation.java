package OOPs;

public class Interface_Implementation {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.driver();
    }
}
class Car1 implements Engine1 , Breaks{

    void driver(){

        StartEngine();
        ApplyBrake();
        StopEngine();


    }
   public  void StartEngine(){
       System.out.println("Start engine");
   }
   public  void ApplyBrake(){
       System.out.println("Apply brake");
   }
   public void StopEngine(){
       System.out.println("Stop Engine");
   }
}
interface Engine1{
   void StartEngine();
   void StopEngine();
   default void test(){
        System.out.println("Concrete Engine");
    }

}
interface Breaks{
    void ApplyBrake();
}