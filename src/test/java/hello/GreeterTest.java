package hello;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Giannis on 29/1/2015.
 */
public class GreeterTest {

    private Greeter mGreeter = null;

    @Before
    public void setUp(){
        mGreeter = new Greeter();
    }

    @Test
    public void sayHello(){
        assert mGreeter.sayHello().contentEquals("Hello world!");
    }
}
