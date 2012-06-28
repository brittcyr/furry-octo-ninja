package test;

import org.junit.Test;

public class TestAssertions {

    @Test(expected = AssertionError.class)
    public void testAssertionsEnabled() {
        assert false;
    }

}
