/**
 * Queue
 */
public class Queue {
  final private int[] data;
  private int count;

  // Constructor {input: void, output: void}
  public Queue() {
    data = new int[100];
    count = 0;
  }
  // Constructor {input: [int[], int], output: void}
  public Queue(int[] iData, int iCount) {
    data = iData;
    count = iCount;
  }
  // Copy Constructor {input: Stack, output: null}
  public Queue(final Queue queue) {
    this(queue.getData(), queue.getCount());
  }

  // Instance Methods
  public void push(final int item) {
    if(count < data.length) {
      for(int i = 0; i < count+1; i += 1) {
        data[i + 1] = data[i];
      }
      data[0] = item;
      count += 1;
    } else {
      throw new IndexOutOfBoundsException("Queue is Full");
    }
  }
  public int pop() {
    if(count > 0) {
      count -= 1;
      return(data[count + 1]);
    } else {
      throw new IndexOutOfBoundsException("Queue is Empty");
    }
  }
  protected int[] getData() { return(data); }
  protected int getCount() { return(count); }
}