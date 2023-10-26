public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty()); // returns false
        s.push(2); //adds 2
        System.out.println(s.peek()); // souts 2
        s.push(3); // adds 3
        System.out.println(s.peek()); /// souts 3
        s.push(4); // adds 4
        System.out.println(s.peek()); // souts 4
        s.pop(); // removes 4
        System.out.println(s.peek()); //souts 3
        s.pop(); // removes 3
        System.out.println(s.peek()); // sout 2
        s.pop(); // removes 2
        System.out.println(s.isEmpty()); //returns false
        s.push(10); // adds 10
        System.out.println(s.isEmpty());// returns true
        System.out.println(s.getSize());//returns the size




    }
}