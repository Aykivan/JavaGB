package Lectures;

import java.util.Scanner;

public class lecture1 {
    public static void main(String[] args) {

        // short - целое число, способное уместить в себя меньшее по размеру значение,
        // чем int
        short age = 26;
        int salary = 12345;
        System.out.println(age);
        System.out.println(salary);

        // Вещественные числа. Перед float неоюходимо использовать суфффикс f - он
        // указывает на что значение является типом float
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println("Число Пи будет равно " + pi);

        // Один элемент - char
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        // Булиевые операции
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        // Строки
        String msg = "Hello world!";
        System.out.println(msg);

        // Не явное присвоение типа
        var i = 123;
        System.out.println(i);
        System.out.println(getType(i));

        // Операции Java
        // ● Присваивание: =
        // ● Арифметические: *, /, +, -, %, ++, --
        // ● Операции сравнения: <, >, ==, !=, >=, <=
        // ● Логические операции: ||, &&, ^, !
        // ● Побитовые операции <<, >>, &, |, ^

        // Массивы
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr[2]);

    }

    // Массивы Многомерные
    public class Program {
        public static void main(String[] args) {
            int[][] arr = new int[3][5];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    // Преобразования
    public class Program1 {
        public static void main(String[] args) {
            int i = 123;
            double d = i;
            System.out.println(i); // 123
            System.out.println(d); // 123.0
            d = 3.1415;
            i = (int) d;
            System.out.println(d); // 3.1415
            System.out.println(i); // 3
            d = 3.9415;
            i = (int) d;
            System.out.println(d); // 3.9415
            System.out.println(i); // 3
            byte b = Byte.parseByte("123");
            System.out.println(b); // 123
            b = Byte.parseByte("1234");
            System.out.println(b); // NumberFormatException: Value out of range
        }
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    // Строки
    // import java.util.Scanner;
    public class Program2 {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("name: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s!", name);
            iScanner.close();
        }
    }

    // Проверка на соответствие получаемого типа
    // import java.util.Scanner;
    public class Program3 {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("int a: ");
            boolean flag = iScanner.hasNextInt();
            System.out.println(flag);
            int i = iScanner.nextInt();
            System.out.println(i);
            iScanner.close();
        }
    }

    // Форматированный вывод
    public class Program4 {
        public static void main(String[] args) {
            int a = 1, b = 2;
            int c = a + b;
            String res = a + " + " + b + " = " + c;
            System.out.println(res);
        }
    }

    public class Program5 {
        public static void main(String[] args) {
            int a = 1, b = 2;
            int c = a + b;
            String res = String.format("%d + %d = %d \n", a, b, c);
            System.out.printf("%d + %d = %d \n", a, b, c);
            System.out.println(res);
        }
    }

    // Виды спецификаторов:
    // %d: целочисленных значений
    // %x: для вывода шестнадцатеричных чисел
    // %f: для вывода чисел с плавающей точкой
    // %e: для вывода чисел в экспоненциальной форме,
    // например, 3.1415e+01
    // %c: для вывода одиночного символа
    // %s: для вывода строковых значений

    public class Program6 {
        public static void main(String[] args) {
            float pi = 3.1415f;
            System.out.printf("%f\n", pi); // 3,141500
            System.out.printf("%.2f\n", pi); // 3,14
            System.out.printf("%.3f\n", pi); // 3,141
            System.out.printf("%e\n", pi); // 3,141500e+00
            System.out.printf("%.2e\n", pi); // 3,14e+00
            System.out.printf("%.3e\n", pi); // 3,141e+00
        }
    }

    // Функции и методы
    public class Program7 {
        static void sayHi() {
            System.out.println("hi!");
        }

        static int sum(int a, int b) {
            return a + b;
        }

        static double factor(int n) {
            if (n == 1)
                return 1;
            return n * factor(n - 1);
        }

        public static void main(String[] args) {
            sayHi(); // hi!
            System.out.println(sum(1, 3)); // 4
            System.out.println(factor(5)); // 120.0
        }
    }

    // Управляющие конструкции: условный оператор
    public class Program8 {
        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            int c = 0;
            if (a > b)
                c = a;
            if (b > a)
                c = b;
            System.out.println(c);
        }

        public class Program {
            public static void main(String[] args) {
                int a = 1;
                int b = 2;
                int min = a < b ? a : b;
                System.out.println(min);
            }
        }
    }

    // import java.util.Scanner;
    // public class Program9 {
    // public static void main(String[] args) {
    // int mounth = value;
    // String text = "";
    // switch (mounth) {
    // case 1:
    // text = "Autumn";
    // break;
    // ...
    // default:
    // text = "mistake";
    // break;
    // }
    // System.out.println(text);
    // iScanner.close();
    // }
    // }

    // import java.io.FileWriter; Создание и запись\ дозапись
    // import java.io.IOException;
    // public class Program10 {
    // public static void main(String[] args) {
    // try (FileWriter fw = new FileWriter("file.txt", false)) {
    // fw.write("line 1");
    // fw.append('\n');
    // fw.append('2');
    // fw.append('\n');
    // fw.write("line 3");
    // fw.flush();
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }
    // }
    // }

    // // import java.io.*; Чтение, Вариант посимвольно
    // public class Program11 {
    // public static void main(String[] args) throws Exception {
    // FileReader fr = new FileReader("file.txt");
    // int c;
    // while ((c = fr.read()) != -1) {
    // char ch = (char) c;
    // if (ch == '\n') {
    // System.out.print(ch);
    // } else {
    // System.out.print(ch);
    // }
    // }
    // }
    // }

    // Вариант построчно
    // public class Program11 {
    //     public static void main(String[] args) throws Exception {
    //         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    //         String str;
    //         while ((str = br.readLine()) != null) {
    //             System.out.printf("== %s ==\n", str);
    //         }
    //         br.close();
    //     }
    // }

}
