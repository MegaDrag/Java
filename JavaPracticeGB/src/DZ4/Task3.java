package DZ4;

import java.util.Scanner;

/**
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class Task3 {

    public static void main(String[] args)  {

        int oneNumber;
        int twoNumber;
        String operation;
        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            oneNumber = sc.nextInt();
            System.out.print("Введите второе число: ");
            if (sc.hasNextInt()) {
                twoNumber = sc.nextInt();
                System.out.print("Выберити арифметическую операцию (+ - * /) ");
                if (sc.hasNext()) {
                    operation = sc.next();
                    System.out.println("Вы хотите отменить последнюю операцию и ввести новую?");
                    System.out.println("Введите Yes/No");
                    String result = sc.next();
                    if (result.toLowerCase().equals("yes")) {
                        System.out.print("Выберити арифметическую операцию (+ - * /) ");
                        if (sc.hasNext()) {
                            operation = sc.next();
                        }
                    }

                        switch (operation) {
                            case ("+"):
                                System.out.println("Итог = " + (oneNumber + twoNumber));
                                break;
                            case ("-"):
                                System.out.println("Итог = " + (oneNumber - twoNumber));
                                break;
                            case ("*"):
                                System.out.println("Итог = " + (oneNumber * twoNumber));
                                break;
                            case ("/"):
                                try {
                                    System.out.println("Итог = " + (oneNumber / twoNumber));
                                } catch (ArithmeticException e) {
                                    System.out.println("Делить на ноль нельзя");
                                }
                                break;
                            default:
                                System.out.println("Неизветсная операция");
                                break;
                        }

                }

            }
            else System.out.println("Вы ввели не число");

        }
        else System.out.println("Вы ввели не число");
        sc.close();
    }
}
