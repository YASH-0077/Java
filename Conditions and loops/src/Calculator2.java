import java.util.Scanner;

    public class Calculator2 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            while (true) {

                System.out.print("Enter operator (+, -, *, /, %, X to exit): ");
                char op = in.next().trim().charAt(0);

                if (op == 'X' || op == 'x') {
                    break;
                }

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                    System.out.print("Enter two numbers: ");
                    int a = in.nextInt();
                    int b = in.nextInt();

                    int ans = 0;

                    if (op == '+') {
                        ans = a + b;
                    } else if (op == '-') {
                        ans = a - b;
                    } else if (op == '*') {
                        ans = a * b;
                    } else if (op == '/') {
                        if (b != 0) {
                            ans = a / b;
                        } else {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                    } else if (op == '%') {
                        if (b != 0) {
                            ans = a % b;
                        } else {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                    }

                    System.out.println("Answer = " + ans);

                } else {
                    System.out.println("Invalid operator!");
                }
            }

            in.close();
        }
    }

