package Task_9th_Feb_2025;

public class Sort_array {
    public static void main(String[] args) {
        int[] number = {12, 34, 10, 1, 100, 3, 4, 32};
         int max_ouput = give_max(number);
        System.out.println(max_ouput);
        int min_output = give_min(number);
        System.out.println(min_output);

    }
    static int give_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }return max;
    }
static int give_min(int[] array){
        int min = array[0];
        for (int i=0; i<array.length; i++){
       if(array[i]<min){
           min = array[i];
       }
       }return min;
}
}
