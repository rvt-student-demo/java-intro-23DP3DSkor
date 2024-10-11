package lv.rvt;

public class Stars{
    public static void printStars(int number){
        for( int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSqure(int size){
        for(int i = 0; i < size; i++){
            printStars(size);
        }
    }
    private static void printRectangle(int width, int height){
        int i = 0;
         while(i < height){
           int j = 0;
             while(j < width){
               printStars(width);
               j++;
       }
    }
}