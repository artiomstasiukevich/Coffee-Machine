import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        for(int i = begin; i < (end + 1); i++) {
            if(i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else if(i % 3 == 0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}