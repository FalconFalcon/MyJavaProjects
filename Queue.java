class Queue {
    
    int front, rear, size;
    int array[];
    int capacity;
    
    Queue(int capacity){
        
        this.capacity = capacity;
        
        front = 0;
        rear = this.capacity - 1;
        array = new int[capacity];
    }
    
    boolean isFull(Queue queue) {  return (queue.size == queue.capacity);}
    boolean isEmpty(Queue queue) {  return (queue.size == 0); }
    
    
    void enqueue(int value){
        
        if (isFull(this)) return;
        this.rear = (this.rear+1)%this.capacity;
        this.array[this.rear] = value;
        this.size +=1 ;
        
        
    }
    
    int dequeue(){
        
        if (isEmpty(this)) {
            System.out.println("Empty Queue");
            return 0;
        }
        int value = this.array[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size-=1;
        return value;
    }
    
    
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        return this.array[this.front];
    }
    
    public static void main(String args[]){
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        System.out.println(q.front());
  
        
        
        
    }
}
