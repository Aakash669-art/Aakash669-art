package task_21_Feb;

public class Overloading {
    public static void main(String[] args) {
       table Table = new table();
        Table.name("aakash", 2020);


    }
}
 class  table{
     String name = "";
     int year = 0;

     table (){
         System.out.println("name of the years");

     }
      table (String name , int year){
          System.out.println( name);
          System.out.println(year);
     }
     void  name (String name , int year){
         System.out.println("aakash"+year);

     }
 }