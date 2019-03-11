/**
 * Stack
 */
public class Stack {
  final private int[] data;
  private int count;

  // Constructor {input: void, output: void}
  public Stack() {
    data = new int[100];
    count = 0;
  }
  // Constructor {input: [int[], int], output: void}
  public Stack(int[] iData, int iCount) {
    data = iData;
    count = iCount;
  }
  // Copy Constructor {input: Stack, output: null}
  public Stack(final Stack stack) {
    this(stack.getData(), stack.getCount());
  }

  // Instance Methods
  public void push(final int item) {
    if(count < data.length) {
      data[count] = item;
      count += 1;
    } else {
      throw new IndexOutOfBoundsException("Stack is Full");
    }
  }
  public int pop() {
    if(count > 0) {
      count -= 1;
      return(data[count]);
    } else {
      throw new IndexOutOfBoundsException("Stack is Empty");
    }
  }
  protected int[] getData() { return(data); }
  protected int getCount() { return(count); }
}