public class Main {

    public static void main(String[] args) {
        int salary = 10000;
//         if( salary > 10000 ) {
//             salary = salary + 2000;
//         }else {
//             salary = salary + 1000;
//         }
//          System.out.println(salary);
//
//    }
//}
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 1000;
        } else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}