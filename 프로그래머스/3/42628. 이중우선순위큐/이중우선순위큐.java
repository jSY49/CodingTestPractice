import java.util.*;

class Solution {
    
    public int[] solution(String[] operations) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (String op : operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);

            if (command.equals("I")) {
                treeSet.add(value);
            } else if (command.equals("D")) {
                if (treeSet.isEmpty()) continue;  

                if (value == 1) {
                    treeSet.pollLast();   
                } else if (value == -1) {
                    treeSet.pollFirst(); 
                }
            }
        }

        if (treeSet.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{treeSet.last(), treeSet.first()};
    }
}