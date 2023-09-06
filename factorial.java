import java.util.Scanner;

public class factorial{
    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        return num * fact(num - 1);
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = n.nextInt();

        System.out.println(fact(num));
    }
}