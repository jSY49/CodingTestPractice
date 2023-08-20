class Solution {
    public int solution(String myString, String pat) {
        
        myString=myString.toLowerCase();
        pat = pat.toLowerCase();
        
        System.out.println(myString+"/"+pat);
        

        return myString.contains(pat)? 1:0;
    }
}