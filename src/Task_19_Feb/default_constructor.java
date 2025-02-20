package Task_19_Feb;

 class default_constructor {
     String name;

       default_constructor()
          {
              System.out.println("Default");
     }

     public static void main(String[] args) {
         default_constructor constructor = new default_constructor();
         System.out.println(constructor);
     }
}
