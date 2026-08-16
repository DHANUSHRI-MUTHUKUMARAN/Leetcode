class LC14_LongestCommonPrefix {
    public String LongestCommonPrefix(String[] str){
        if(str.length==0) return "";

        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }
        return prefix;  
    }
    
}
/*
startsWith() method is used to check if the string starts with the given prefix or not
basically the string shrinks and checks if the next string starts with the prefix or not
 */
