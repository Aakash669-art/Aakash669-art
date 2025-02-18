package Task_16th_Feb;

public class PrintMyBook extends Book {
    PrintMyBook(String name , String author , int price){

        super(name , author , price);
    }

    @Override
    void getdetails() {
        System.out.println(name+ " "+author+" "+price);
    }
}
