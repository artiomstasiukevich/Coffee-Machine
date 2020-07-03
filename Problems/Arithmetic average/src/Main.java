import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        double summ = 0;
        double num = 0;
        for(int i = begin; i < (end + 1); i++) {
            if(i % 3 == 0 ) {
                summ += i;
                num++;
            }
        }
        System.out.println(summ / num);
    }
}