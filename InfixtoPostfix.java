import java.util.*;
/*Jasmine*/
class InfixtoPostfix{
    public static int getprec(char element) {
        //check operand
        if (element == '+' || element == '-') {
            return 1;
        } else if (element == '*' || element == '/') {
            return 2;
        } else if (element == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine(), answer = "";

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                answer += ch;

            } else if (ch == '(') {
                s.push('(');
            } else if (ch == ')') {
                while (s.peek() != '(' && !s.empty()) {
                    answer += s.pop();
                }
                if (s.empty()) {
                    System.out.println("Invalid Expression");
                } else {
                    //pop '('
                    s.pop();
                }
            } else {
                while (!s.empty() && getprec(ch) <= getprec(s.peek())) {
                    answer += s.pop();
                }
                s.push(ch);
            }

        }
        while (!s.empty()) {
            answer += s.pop();
        }
        System.out.println(answer);

    }
}
