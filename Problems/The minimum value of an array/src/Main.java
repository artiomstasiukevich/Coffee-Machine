import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        for (int num : numbers) {
           if(num < min) {
               min = num;
           }
        }
        System.out.println(min);
    }
}