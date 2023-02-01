class Solution {

    public String solution(int[] food) {
        //묵시적 형변환이 일어나므로 이렇게 풀자
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
//    public String solution(int[] food) {
//        // 필요한 foods의 크기는?
//        int size = 1;
//        for(int i = 1 ; i < food.length ; i++){
//            size += (food[i] / 2) * 2;
//        }
//        char[] foods = new char[size];
//        int index = 0;
//        for(int i = 1 ; i < food.length ; i++){
//            for(int j = 0 ; j < food[i] / 2 ; j++){
//                foods[index] = (char)(i + '0');
//                foods[foods.length-index-1] = (char)(i + '0');
//                index++;
//            }
//        }
//        foods[index] = '0';
//        String answer = String.valueOf(foods);//String으로 변환
//        return answer;
//    }
}