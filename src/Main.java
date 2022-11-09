import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.print("От какого числа вычислить факториал? ");
        int n=sc.nextInt();
        System.out.println(n+"! = "+ fact(n));
        System.out.print("Сколько первых фаториалов вычислить? ");
        n=sc.nextInt();
        int[] mas_of_fact =new int[n];
        first_n_fact(n,mas_of_fact);
        for(int i=0;i<mas_of_fact.length;i++)
            System.out.print(mas_of_fact[i]+ " ");

    }
    public static int fact(int n)
    {
        int fact_value=1;
        for(int i=2;i<=n;i++) {
            fact_value = i * fact_value;
        }
        return fact_value;
    }
    public static int[] first_n_fact(int n, int[] mas)
    {
        int fact_value=1;
        for(int i=1;i<=n;i++) {
            fact_value = i * fact_value;
            mas[i-1]=fact_value;
        }
        return mas;
    }
}


