import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "triangle": {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            }
            case "rectangle": {
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                System.out.println(length * width);
                break;
            }
            case "circle": {
                double radius = sc.nextDouble();
                System.out.println(radius*radius*3.14);
                break;
            }
        }
    }
}