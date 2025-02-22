package task_21_Feb;

public class OverRriding {
    public static void main(String[] args) {
        gate Gate = new Maingate();
        Gate.gate1();
        Gate.gate2();

    }
}
class gate{
    void gate1(){
        System.out.println("It is goog gate 1");
    }
    void gate2(){
        System.out.println("It is not good");
    }
}
class Maingate extends gate{
    @Override
    void gate1() {
        System.out.println("it is not good second time");
    }

    @Override
    void gate2() {
        System.out.println("it is good second time");
    }
}