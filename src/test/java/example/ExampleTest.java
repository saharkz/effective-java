package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Disabled
    @Test
    public void methodTest(){

        Assertions.assertFalse(true);
    }
}
