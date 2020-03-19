package com.soundai.threemonths.problem4;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replace("we are happy"));
    }

    public String replace (String source) {
        if (source == null || "".equals(source)) {
            return source;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            sb.append(" ".equals(source.substring(i,i+1)) ? "%20" : source.substring(i,i+1));
        }
        return sb.toString();
    }

}
