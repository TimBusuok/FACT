import java.util.Scanner;

public class factorial{
    public static int fact(int num){
        int factorial = 1;
        int i = 1;
        while(i <= num){
            factorial *= i;
            i++; 
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = n.nextInt();

        System.out.println(fact(num));
        n.close();
    }
}