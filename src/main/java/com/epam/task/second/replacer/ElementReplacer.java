package com.epam.task.second.replacer;

import com.epam.task.second.deleter.ConsonantDeleter;
import org.apache.log4j.Logger;

public class ElementReplacer implements StringReplacer {
    private static final Logger LOGGER = Logger.getLogger(ElementReplacer.class);

    public String replace(String content, char insert, int position) {
        String[] words = content.split("\\W");
        StringBuilder stringPuzzle = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            LOGGER.info("Exchanging symbols...");
            exchange(words[i], stringPuzzle, insert, position);
        }
        return stringPuzzle.substring(1);
    }

    private void exchange(String word, StringBuilder stringPuzzle, char insert, int position) {
        if (word.length() >= position) {
            LOGGER.info("Current word fits,doing exchange");
            char[] temporary = word.toCharArray();
            temporary[position - 1] = insert;
            stringPuzzle.append(' ');
            stringPuzzle.append(temporary);
        } else stringPuzzle.append(word);
    }
}
