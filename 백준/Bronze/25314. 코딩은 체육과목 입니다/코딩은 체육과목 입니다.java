import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bite = sc.nextInt();

        for(int i = 0; i < bite/4; i++)
            System.out.print("long ");
        System.out.println("int");
    }
}