package stackandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class TestString {
    public static void main(String[] args) {
        Deque<Character> deque = new LinkedList<>();
        String test = "[()[]{()()}]";
        test = "([]){()";
        for (char ch : test.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (deque.size() == 0) throw new IllegalArgumentException();
                Character firstCharacter = deque.removeFirst();
                switch (ch) {
                    case '}':
                        if (firstCharacter != '{') throw new IllegalArgumentException();
                        break;
                    case ']':
                        if (firstCharacter != '[') throw new IllegalArgumentException();
                        break;
                    case ')':
                        if (firstCharacter != '(') throw new IllegalArgumentException();
                        break;
                }
            }
        }
        if (deque.size() > 0) throw new IllegalArgumentException();
    }
}
