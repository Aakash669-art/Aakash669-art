package Task_19_Feb;

public class overload_constructors {
    String name;
    int  years;
    overload_constructors(){

        System.out.println("Null");
    }
    overload_constructors(String name)
       {
           System.out.println("This side "+name);
    }
    overload_constructors(String name , int years){

        System.out.println("This side "+name +" my birthday years is "+years);
    }
    public static void main(String[] args) {
        overload_constructors over1 = new overload_constructors();
        overload_constructors over2 = new overload_constructors("aakash");
        overload_constructors over3 = new overload_constructors("aakash" , 1998);
    }
}

