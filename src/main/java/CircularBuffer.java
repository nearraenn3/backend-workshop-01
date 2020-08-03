public class CircularBuffer {
    private int bufferSize=10;
    private int spaceInBuffer=10;
    private String[] buffer = new String[10];
    private int writePointer;
    private int readPointer;

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        if (writePointer == spaceInBuffer ) {
            writePointer = 0;
        }
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize==0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
