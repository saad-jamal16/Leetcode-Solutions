class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);

        int index = sb.indexOf(String.valueOf(digit));

        sb.deleteCharAt(index);
        return sb.toString();
    }
}