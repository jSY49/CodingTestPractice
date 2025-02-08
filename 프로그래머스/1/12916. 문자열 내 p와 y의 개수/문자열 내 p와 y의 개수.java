class Solution {
    boolean solution(String s) {

        int pNum = 0;
        int yNum =0;
        String[] arr = s.split("");
        for(int i=0 ; i< arr.length;i++){
            if(arr[i].equals("p")||arr[i].equals("P")){
                pNum++;
            }else if(arr[i].equals("y")||arr[i].equals("Y")){
                yNum++;
            }
        }
        
        
        return pNum==yNum? true:false;
    }
}