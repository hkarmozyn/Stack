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


    public  <T> pop(){
       StackNode oldTop = top;
       return oldTop.getData();



    }
    public StackNode peek(){

    }
    public int getSize(){
        return size;

    }




}
