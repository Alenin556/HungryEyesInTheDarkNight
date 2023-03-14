package Actions;

import java.util.Scanner;

public class ContructionOfChoice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int tries = 1; // попытки
        for (int x = 0; x < tries; x++) { // цикл который будет выполняться в зависимости от попыток
            System.out.println("1 - .");
            System.out.println("2 - .");
            int monsters = sc.nextInt();
            switch (monsters) {
                case 1:
                    break;
                case 2:
                    break;
            }
        }
    }
}
