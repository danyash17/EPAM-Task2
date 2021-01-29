package com.epam.task.second.replacer;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringReplacerTest {
    private static final String TESTING_STRING="one two three four five";
    private static final String EXPECTED_STRING="o-e t-o t-ree f-ur f-ve";
    private static final char INSERT='-';
    private static final int POSITION=2;
    @Test
    public void testReplacer(){
        //given
        ElementReplacer replacer=new ElementReplacer();
        String content;
        //when
        content=replacer.replace(TESTING_STRING,INSERT,POSITION);
        //then
        assertEquals(EXPECTED_STRING,content);
    }
}
