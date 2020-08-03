public class CircularBuffer {
    private int bufferSize=10;
    private int spaceInBuffer=10;
    private String[] buffer = new String[10];
    private int writePointer;
    private int readPointer;

    public boolean isEmpty() {
        return spaceInBuffer == 10;
    }

    public void writeData(String input) {
        spaceInBuffer--;
        if (writePointer == bufferSize ) {
            writePointer = 0;
        }
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return spaceInBuffer==0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
