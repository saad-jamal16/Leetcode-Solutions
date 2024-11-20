class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> set=new HashSet<>();
        for(String email : emails){
            StringBuilder s=new StringBuilder();
            String local=email.substring(0,email.indexOf("@"));
             for(char c : local.toCharArray()){
                if(c=='.')continue;
                else if(c=='+')break;
                else s.append(c);
            }
            s.append(email.substring(email.indexOf("@"),email.length()));
            set.add(s.toString());
        }
        return set.size();     
      
    }
}
   
