public class implementQueueUsingArray {
    class MyQueue {

        int front, rear;
        int arr[] = new int[100005];
        int size;
    
        MyQueue()
        {
            front=0;
            rear=0;
            size=0;
        }
        boolean isEmpty(){
            return size==0;
        }
        boolean isFull(){
            return size==arr.length;
        }
        
        //Function to push an element x in a queue.
        void push(int x)
        {
            // Your code here
            if(isFull()) return;
            arr[(int)(rear++)%100005] = x;
            size++;
        } 
    
        //Function to pop an element from queue and return that element.
        int pop()
        {
            // Your code here
            if(isEmpty()) return -1;
            int ele = arr[(int)(front++)%100005];
            --size;
            return ele;
        } 
    }
}
