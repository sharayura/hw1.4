
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задание 1" + "\n");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
        }

    public static void task2() {
        System.out.println("Задание 2" + "\n");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3" + "\n");

        int thisYear = 2022;
        int year = 0;
        System.out.println("За последние 200 лет комета пролетала в годах:");
        while (year <= thisYear) {
            if (year >= thisYear - 200) {
                System.out.println(year);
            }
            year += 79;
        }
        System.out.println("В следующий раз пролетит в " + year + " году.");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4" + "\n");

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i%3 == 0){
                System.out.print("ping ");
            }
            if (i%5 == 0){
                System.out.print("pong");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 5" + "\n");

        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print(fib[0] + " " + fib[1]);
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-2] + fib[i-1];
            System.out.print(" " + fib[i]);
        }
        System.out.println();
    }
}