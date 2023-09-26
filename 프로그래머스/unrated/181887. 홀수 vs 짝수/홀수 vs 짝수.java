class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i += 2){
            even += num_list[i];
            odd += i + 1 < num_list.length ? num_list[i + 1] : 0;
        }
        return even > odd ? even : odd;
    }
}