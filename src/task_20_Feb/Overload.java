package task_20_Feb;

public class Overload {
    public static void main(String[] args) {
    lapi process = new lapi();
        process.years();
    }
}
class lapi{
    int years = 2012;
    void years(){
        System.out.println(years);
    }
    lapi(){
        System.out.println("over riding");

    }
    lapi(int a){
        System.out.println("overriding 2"+a);
    }
}