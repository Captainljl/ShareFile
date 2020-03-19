package com.soundai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: liujialei
 * @create: 2019-11-11 20:30
 **/
public class RegexTest {
    public static void main(String[] args) {
        String logStr = "dialogId : ab  c bala bala";
        String pattern = "[\\s\\S]*dialogId\\s*\\:\\s*(?<dialogId>\\S+)[\\s\\S]*";
        Matcher matcher = Pattern.compile(pattern).matcher(logStr);
        matcher.matches();
        String group = matcher.group("dialogId");
        System.out.println(group);
        boolean isMatch = Pattern.matches(pattern, logStr);
        System.out.println(isMatch);
    }
}
