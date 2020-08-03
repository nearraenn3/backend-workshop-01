public class CircularBuffer {
    private int bufferSize=10;
    private int spaceInBufferSize=10;
    private String[] buffer = new String[10];
    private int writePointer;
    private int readPointer;

    public boolean isEmpty() {
        return true;
    }

    public void writeData(String input) {
        bufferSize--;
        if (writePointer == spaceInBufferSize ) {
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
