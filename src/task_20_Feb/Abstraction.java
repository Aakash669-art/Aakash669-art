package task_20_Feb;

public class Abstraction {
    public static void main(String[] args) {
        Supercar CAR = new Supercar("Engine Start" , "Break apply", "Stop");
       CAR.getdetails();

    }
}
abstract  class Car{
    String Start;
    String Break;
    String Stop;
    public Car (String Start , String Break , String Stop){

        this.Start = Start;
        this.Break = Break;
        this.Stop =  Stop;
    }
 abstract void getdetails();

}
class  Supercar extends Car{
    public  Supercar(String Start , String Break , String Stop){
        super(Start , Break , Stop);
    }

    @Override
    void getdetails() {
        System.out.println(Start + Break+Stop);
    }
}