import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int number= input.nextInt();
        int[] arrays =new int[number];
        for (int i = 1; i < arrays.length+1; i++) {
            System.out.print(i+". Elamanı giriniz :");
            arrays[i-1]= input.nextInt();
        }
        int[] arrays2=new int[arrays.length];


        int temp=0;
        int temp2=0;

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j <arrays.length ; j++) {
                if (arrays[i]<arrays[j] ){
                    temp=arrays[j];//Burada en büyük elemanı aldım
                    temp2=arrays[i];//Burada ise i indexinde ki elemanı aldım


                    //burada ise ikisinin yerlerini değistirdim.
                    arrays[i]=temp;
                    arrays[j]=temp2;


                }

            }
        }

        for (int array : arrays) {
            System.out.print(array + " ");
        }



    }
}
