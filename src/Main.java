import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        int num = scan.nextInt();
        int max =0;
        int min =0;
        for (int i: list){
            if (i<num){
                max =i;
                break;
            }
        }
        for (int x: list){
            if (x>num){
                min = x;
                break;
            }
        }
        for (int y:list){
            if (y<num){
                if (y>max){
                    max =y;
                }
            } else if (y>num){
                if (y<min){
                    min =y;
                }
            }
        }


        System.out.println("Girilen sayıdan küçük en yakın sayı: " + max);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + min);
    }
}
