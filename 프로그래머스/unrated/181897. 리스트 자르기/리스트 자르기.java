import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n){
            case 1: 
                arr= getlist(0,b,1,num_list);
                break;
            case 2: 
                arr= getlist(a,num_list.length-1,1,num_list);
                break;
            case 3: 
                arr= getlist(a,b,1,num_list);
                break;
            case 4: 
                arr= getlist(a,b,c,num_list);
                break;
                
        }
        int[] answer =new int[arr.size()];
        for(int i=0; i<arr.size();i++)
            answer[i]=arr.get(i);
        return answer;
    }
    
    private ArrayList<Integer> getlist(int start, int end, int step,int[] num_list){
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=start; i<=end;i+=step){
            arr.add(num_list[i]);
        }
        
        return arr;
    }
}