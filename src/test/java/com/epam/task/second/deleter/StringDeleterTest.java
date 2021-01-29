package com.epam.task.second.deleter;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringDeleterTest {
    private static final String TESTING_STRING="oneee two three four fivee";
    private static final String EXPECTED_STRING="oneee two four";
    @Test
    public void testDeleter(){
        //given
        ConsonantDeleter deleter=new ConsonantDeleter();
        String content;
        //when
        content=deleter.delete(TESTING_STRING);
        //then
        assertEquals(EXPECTED_STRING,content);
    }
}
