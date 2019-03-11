/**
 * Stack
 */
public class Stack {
  final private int[] data;
  private int length;

  // Constructor {input: void, output: void}
  public Stack() {
    data = new int[100];
    length = 0;
  }
  // Constructor {input: [int[], int], output: void}
  public Stack(int[] iData, int iLength) {
    data = iData;
    length = iLength;
  }
  // Copy Constructor {input: Stack, output: null}
  public Stack(final Stack stack) {
    this(stack.getData(), stack.getLength());
  }

  // Instance Methods
  public void push(final int item) {
    if(length < data.length) {
      data[length] = item;
      length += 1;
    } else {
      throw new IndexOutOfBoundsException("Stack is Full");
    }
  }
  public int pop() {
    if(length > 0) {
      length -= 1;
      return(data[length]);
    } else {
      throw new IndexOutOfBoundsException("Stack is Empty");
    }
  }
  protected int[] getData() { return(data); }
  protected int getLength() { return(length); }
}