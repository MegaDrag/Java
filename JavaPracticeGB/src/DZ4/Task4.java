package DZ4;

import java.util.Stack;



/**
 * ����������� �������� �������� �� ��������� ������ � ����������� ��� ��������������� ���������.
 * http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 ��������� ������ ���� ��� ��������.
 * (���������� �������� ������ ���� � ������)

 *  * �������� ����������� ��������� ����� �������.
 *  * ���� �� ��������� �������, �� ���������� �������� ��� � ������� �����������.
 *  * ���� �������� ��������� ��������, ���� ��������� ���������:
 *  * ���� ���� ���������� ����, �������� �������� �������� �������� � ����.
 *  * ���� �������� �������� ����� ����� ������� ���������, ��� ��� ��������, ��� � ��������� ����� ��������� �� ������� �����,�������� �������� ���������� �� ������� �����.
 *  * ���� �������� �������� ����� ����� �� ���������, ������� �������� ����������� �� ����� � ��������� � �������, � �������� �������� ���������� � ����.
 *  * ���� ��������� ��������� ��������� ����,         ������� �������� ����������� �� ����� � ��������� � �������, ����� ���� �������� �������� ������������ � ����� �������� �����.
 *  * ����� ��� ��������� ����� ����������������, ��� ���������� ������ ��������������� �� ����� ����������.
 *  * */

public class Task4 {
    public static void main(String[] args) {
        String expression = "5 + 10 * 3";
        expression = expression.replaceAll("\\s","");
        String result =convert(expression);
       // System.out.println(result); //��������� ����������� ������
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            if (ch==' '){

            }
            else if (Character.isDigit(ch)) {
                    String str = gatherNumber(ch,result,i);
                    i += str.length() - 1;
                    int number = Integer.parseInt(str);
                    stack.push(number);
                }
            else if (ch == '/' || ch == '*' || ch == '-' || ch == '+') {
                int a = stack.pop();
                int b = stack.pop();

                if(ch == '+') {
                    a = a + b;
                } else if (ch == '-') {
                    a = b - a;
                } else if (ch == '*') {
                    a = a * b;
                } else if (ch == '/') {
                    a = a / b;
                }

                stack.push(a);
            }

        }

        System.out.println("��������� ��������������� ��������� "+expression+" = "+stack.pop());


    }
    /**������� ������ �� ��������� ������ � �����������*/
    public static String convert (String string) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (Character.isDigit(ch)) {
                String number = gatherNumber(ch,string,i);
                i += number.length() - 1;
                sb.append(number);
                sb.append(" ");
            }

            else {
                if (stack.empty()){
                    stack.push(ch);

                }

                else if (priority(ch) > priority(stack.peek())){
                        stack.push(ch);

                }

                else if (priority(ch) == priority(stack.peek())) {
                   sb.append(stack.pop()+" ");
                   stack.push(ch);

                }
                else {
                    if (!stack.empty() && priority(ch) < priority(stack.peek())) {
                        sb.append(stack.pop()+" ");
                        stack.push(ch);
                    }

                }


            }
        }
        while (!stack.empty()){
            sb.append(stack.pop());
            if (!stack.empty()) {
                sb.append(" ");
            }

        }

        return sb.toString();
    }
    /**����������� ��������� ���������*/
    private static int priority(char operator) {
        switch (operator) {
            case '*' : return 3;
            case '/' : return 2;
            case '+' : return 1;
            case '-' : return 1;
        }
        return 0;
    }
    /**���� ����� �� char*/
    public static String gatherNumber (char ch,String string, int index){
        StringBuilder sb = new StringBuilder();

        while(Character.isDigit(ch)) {
        sb.append(ch);
        index++;
        if (index>=string.length()) break;
        ch = string.charAt(index);
        }

        return sb.toString();
    }

}

