public class FirstClass {
    public static void main (String[] args) {
        checkSumm(5, 5);
        positiveOrNegative(5);
        boolPositiveOrNegative(5);
        print(5, "Hello World!");
    }
    public static boolean checkSumm (int a, int b) {
        boolean bool;
        if (a + b >= 10 && a + b <= 20) {
            bool = true;
            System.out.println(bool);
        } else {
            bool = false;
            System.out.println(bool);
        }
        return bool;
      /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        в противном случае – false. */
    }
    public static int positiveOrNegative (int a) {
        if (a < 0) {
          System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        return a ;
        /* 2. Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом. */
    }
    public static int boolPositiveOrNegative (int a) {
        boolean bool;
        if (a >= 0) {
            bool = false;
            System.out.println(bool);
        } else {
            bool = true;
            System.out.println(bool);
        }
        return a;
        /* 3. Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. */
    }
    public static void print (int quantity, String message) {
        for (int a = 0 ; a < quantity; a++ ) {
            System.out.println(message);
            /* 4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз; */
        }
    }
}
