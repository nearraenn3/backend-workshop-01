import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer is not empty", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_be_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }
    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }
    @Test
    public void create_new_buffer_with_default_size_and_write_again_should_read_this() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++) {
            cb.writeData("A" + i);
        }
        cb.writeData("Near");
        assertEquals("Near", cb.readData());
    }
    @Test
    public void create_new_buffer_with_default_size_but_write_nine_times_should_not_full() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<9; i++) {
            cb.writeData("A" + i);
        }
        assertFalse("Full", cb.isFull());
    }
    @Test
    public void create_new_buffer_with_default_size_but_write_three_times_should_not_empty() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<3; i++) {
            cb.writeData("A" + i);
        }
        assertFalse("Empty", cb.isEmpty());
    }
    @Test
    public void can_write_in_buffer_that_have_size_equal_to_ten_more_than_ten_times() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<20; i++) {
            cb.writeData("A");
        }
        assertEquals("A", cb.readData());
    }
    @Test
    public void create_buffer_and_identify_its_size_equal_to_15() {
        CircularBuffer cb = new CircularBuffer();
        cb.createBuffer(15);
        for(int i=0; i<15; i++) {
            cb.writeData("A");
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }
}