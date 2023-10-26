public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(2);
        System.out.println(s.peek());
        s.push(3);
        System.out.println(s.peek());
        s.push(4);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.isEmpty());




    }
}