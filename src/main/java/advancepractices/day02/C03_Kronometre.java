package advancepractices.day02;

import java.util.Scanner;

public class C03_Kronometre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapılacagını giriniz");
        int numTasks = input.nextInt();

        long startTime = System.currentTimeMillis();//currentTimeMillis(); milisaniye olarak ani verir

        System.out.println("************************");
        for (int i = 0; i <numTasks ; i++) {
            int numbers[] = {1,2,3,4,5};
            int sum = 0;
            for (int number :numbers) {
                sum += number;
            }
            System.out.println("sum = " + sum);
            System.out.println("Islem "+( i+1)+ " tamamlandi");
            System.out.println("******************");

        }//fori
        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime-startTime;
        System.out.println("*************************");
        System.out.println("islemSuresi = " + islemSuresi);
        System.out.println("OrtalamSure : "+ ((double)islemSuresi/numTasks) +" milisaniye");




    }
}
