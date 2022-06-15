import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayac, sayi, max = 0, min = 0;

        System.out.print("Girmek İstediğiniz Sayı Adedi : ");
        sayac = inp.nextInt();
        for (int i = 1; i <= sayac; i++){
            System.out.print( i+ ". Sayıyı Giriniz : ");
            sayi = inp.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                } else if (sayi<min) {
                    min=sayi;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        }





    }

