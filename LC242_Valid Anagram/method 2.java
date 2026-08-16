// using frequency array to count the no of char in the 1st and the 2nd string and then check the count both strings
class Method2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // counts the number of characters in the first string
            count[t.charAt(i) - 'a']--; // decrements the count for characters in the second string if found in next string
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false; // if any char are not in another string then return false
        }

        return true;
    }
}
