import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        //1번방법 : 새로 List 생성하고 반복문으로 넣어주기
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i++){
            arr.add(num_list[i]);
        }
        
        
        //2번방법 : stream을 사용해 List로 변환하기
        // List<Integer> arr = (List<Integer>)Arrays.stream(num_list)
        //     .boxed()
        //     .collect(Collectors.toList());
        
        
        //List.add 메서드로 제일 끝에 원소 추가하기
        int i = num_list.length;
            if(num_list[i-1]>num_list[i-2]) {
                arr.add(num_list[i-1] - num_list[i-2]);
            } else {
                arr.add(num_list[i-1]*2);
            }
        
        //List 다시 int 배열로 변환
        num_list = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return num_list;
    }
}