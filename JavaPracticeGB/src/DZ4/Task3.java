package DZ4;

import java.util.Scanner;

/**
 * � ����������� �������� ����������� �������� ��������� ��������.
 */
public class Task3 {

    public static void main(String[] args)  {

        int oneNumber;
        int twoNumber;
        String operation;
        System.out.print("������� ������ �����: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            oneNumber = sc.nextInt();
            System.out.print("������� ������ �����: ");
            if (sc.hasNextInt()) {
                twoNumber = sc.nextInt();
                System.out.print("�������� �������������� �������� (+ - * /) ");
                if (sc.hasNext()) {
                    operation = sc.next();
                    System.out.println("�� ������ �������� ��������� �������� � ������ �����?");
                    System.out.println("������� Yes/No");
                    String result = sc.next();
                    if (result.toLowerCase().equals("yes")) {
                        System.out.print("�������� �������������� �������� (+ - * /) ");
                        if (sc.hasNext()) {
                            operation = sc.next();
                        }
                    }

                        switch (operation) {
                            case ("+"):
                                System.out.println("���� = " + (oneNumber + twoNumber));
                                break;
                            case ("-"):
                                System.out.println("���� = " + (oneNumber - twoNumber));
                                break;
                            case ("*"):
                                System.out.println("���� = " + (oneNumber * twoNumber));
                                break;
                            case ("/"):
                                try {
                                    System.out.println("���� = " + (oneNumber / twoNumber));
                                } catch (ArithmeticException e) {
                                    System.out.println("������ �� ���� ������");
                                }
                                break;
                            default:
                                System.out.println("����������� ��������");
                                break;
                        }

                }

            }
            else System.out.println("�� ����� �� �����");

        }
        else System.out.println("�� ����� �� �����");
        sc.close();
    }
}
