package com.epam.task.second.deleter;

import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsonantDeleter implements StringDeleter {
    private static final Logger LOGGER = Logger.getLogger(ConsonantDeleter.class);
    public String delete(String content) {
        Pattern pattern = Pattern.compile("\\s\\b[b-df-hj-np-tv-xz]\\w{4}\\b");
        Matcher remover = pattern.matcher(content);
        LOGGER.info("Do remove");
        return remove(remover,content);
    }
    private String remove(Matcher remover,String content){
        String clearString=new String(content);
        while (remover.find()) {
            LOGGER.info("Another match!");
            clearString=remover.replaceAll("");
        }
        return clearString;
    }
}
