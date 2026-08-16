class Method2 {
    class LC14_LongestCommonPrefix {
    public String LongestCommonPrefix(String[] str){
        if(str.length==0) return "";
        for(int j=0;j<str.length;j++){
            char curr = str[0].charAt(j);
            for(int i=1;i<str.length;i++){
                if(j==str[i].length() || str[i].charAt(j)!=curr){
                    return str[0].substring(0,j);
                }
            }
        }
        return str[0];
    }
    
}
}
/*
char current = strs[0].charAt(j) — take the character at position j from the first string, use it as the thing to compare against.
Inner loop (i = 1 to end) checks every other string at that same position j.
j >= strs[i].length() — this string is shorter than j, so it ran out of characters, meaning it can't match any further. Bail out.
strs[i].charAt(j) != current — this string has a different character at position j. Mismatch, bail out.
Either failure condition returns strs[0].substring(0, j) — everything matched up to but not including position j, so that's the common prefix so far.
 */
