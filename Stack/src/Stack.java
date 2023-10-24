public class Stack {

    private int size;
    private StackNode top;



    Stack(){

    }



    public void push(StackNode n){
        size++;
        n.setParent(top);
        top=n;



    }


    public StackNode pop(){


    }
    public StackNode peek(){

    }
    public int getSize(){
        return size;

    }




}
