class Solution {
    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c); //finding the first occurance of character
            int lastIndex = s.lastIndexOf(c); //finding the last occurence of character
            
            if(index == lastIndex){ 
                return index; // if the first and last are equal just return unique index
            }
        }
        return -1;
    }
}