import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int num=1;num<=10;num++) {
//            System.out.println(num);
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num < n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Yash");
//
//        }


        // while loop
        /*

         */
//
//        int num = 1;
//        while(num <= 5) {
//            System.out.println(num);
//            num++;
//        }

//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        }while(n <= 5);

//
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();

//int max = a;
//if( b > max){
//    max = b;
//}
//if( c > max) {
//    max = c;
//}
//System.out.println(max);

int max = 0;
if (a > b) {
    max = a;
}else {
    max = b;
}

if (c > max){
    max = c;
}

System.out.println(max);
    }
}
