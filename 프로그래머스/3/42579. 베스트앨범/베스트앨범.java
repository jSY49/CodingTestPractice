import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String,Integer> gen = new HashMap<>();
        Map<String ,List<int[]>> total = new HashMap<>();   // [장르 : [[인덱스,재생횟수]]]

        //1. 장르를 저장하는 맵 - > 장르 순서
        for(int i =0 ; i< genres.length;i++){
            gen.put(genres[i], gen.getOrDefault(genres[i],0)+plays[i]);
            if (!total.containsKey(genres[i])) {
                total.put(genres[i], new ArrayList<>());
            }
            total.get(genres[i]).add(new int[]{i, plays[i]});
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(gen.entrySet());
        list.sort((e1,e2) -> e2.getValue() - e1.getValue()); // 내림 차순 정렬

        //2. 장르 내에서 곡 재생 횟수 맵 -> 곡별 순서
        List<Integer> answerList = new ArrayList<>();  // for문 시작 전에 선언

        for(int i =0 ; i< list.size();i++){
            String genre  = list.get(i).getKey();
            List<int[]> value = total.getOrDefault(genre,new ArrayList<>());
            value.sort((a,b)->{
                if(a[1] != b[1]) return b[1]-a[1];  // 같지 않으면 내림차순 반환
                else return a[0]-b[0];  // 같으면 인덱스 순서로 올림차순 반환
            });

            int limit = Math.min(2, value.size());
            for (int j = 0; j < limit; j++) {
                answerList.add(value.get(j)[0]);  // 인덱스를 결과에 추가
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();   //List<Integer>를 int[]
    }
}