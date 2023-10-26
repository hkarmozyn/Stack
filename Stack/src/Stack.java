public class Stack <T> {

    private int size;
    private StackNode top;



    Stack(){

    }



    public void push(T data){
        size++;
        StackNode n = new StackNode(data, top);
        top=n;



    }


    public  T pop(){
        size--;
       StackNode oldTop = top;
       top=top.getParent();
       return (T)oldTop.getData();




    }
    public T peek(){
        return (T)top.getData();
    }
    public int getSize(){
        return size;

    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }




}
