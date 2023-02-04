import java.util.Scanner;

public class mükemmelsayi{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0,n;
        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();
        for(int i=1; i<n; i++){

            if(n%i==0){
                total+=i;

            }
        }if(total==n){
            System.out.println(n+ "Bir mükemmel sayıdır");
        }else{
            System.out.println( n+ "Bir mükemmel sayı değildir");
        }
    }























        }




















//www.patika.dev



































































