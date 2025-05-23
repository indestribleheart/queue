public class MyQueue{
    public static void main(String[] args){ 
      queue qu=new queue(5);
      qu.enqueue(1);
      qu.enqueue(41);
      qu.enqueue(13);
      qu.print();
      System.out.println(" ----------");
      qu.dequeue();
      qu.print();
      System.out.println("-----");
      System.out.println(qu.peek());

    }
}
class queue{
  int arr[];
  int front, rear, size, capacity;

  queue(int capacity){
    this.capacity=capacity;
    arr = new int[capacity];
    size=0;
    front=0;
    rear=-1;
  }

  void enqueue(int data){
    if(size==capacity){
      System.out.println("queue is full");
      return;
    }
    rear=(rear+1)%capacity;
    arr[rear]=data;
    size++;
  }
  void print() {
    if (size == 0) {
        System.out.println("Queue is empty");
        return;
    }
    int count = 0;
    int index = front;
    while (count < size) {
        System.out.println(arr[index]);
        index = (index + 1) % capacity;
        count++;
    }
  }
  int dequeue(){
    if(size==0){
      System.out.println("queue is empty");
      return -1;
    }
    int result =arr[front];
    front = (front+1)%capacity;
    size--;
    return result;
  }
  int peek(){
    if(size==0){
      System.out.println("empty");
      return -1;
    }
    return arr[front];
  }
}
