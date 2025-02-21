package task_20_Feb;

public class OverRiding {
    public static void main(String[] args) {
        Lowboss son1 = new Lowboss();
        son1.home();
        son1.f2();
    }
}
 class Supeboss{

    void home(){
        System.out.println("Father have 60cr rupees");
    }
    void f2(){
        System.out.println("Father also have car");
    }
 }
 class Lowboss extends Supeboss{
     @Override
     void home() {
         System.out.println("son also have bugati");
     }

     @Override
     void f2() {
         System.out.println("Son have 1cr ");
     }
 }