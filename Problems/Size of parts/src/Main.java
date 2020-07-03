import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_parts = sc.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;
        for(int i = 0; i < num_of_parts; i++) {
            int type = sc.nextInt();
            if(type == 0) {
                perfect++;
            } else if(type == 1) {
                larger++;
            } else if(type == -1) {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}