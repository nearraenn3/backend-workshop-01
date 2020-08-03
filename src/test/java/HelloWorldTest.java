import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World",result);
    }
    @Test
    public void sayHi_with_numlabyod_should_return_Hello_numlabyod() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("numlabyod");
        assertEquals("Hello Numlabyod", result);
    }
    @Test
    public void sayHi_with_near_should_return_Hello_numlabyod() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("near");
        assertEquals("Hello Near", result);
    }
}