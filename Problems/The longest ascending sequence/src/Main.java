import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int j = 0;
        int sequence = 0;
        for (int i = 1; i < size; i++) {
            if(array[i] < array[i - 1]) {
                if(sequence < (i - j)) {
                    sequence = i - j;
                }
                j = i;
            }
        }
        if(sequence < (size - j)) {
            sequence = size - j;
        }
        System.out.println(sequence);
    }
}