
class Solution {
    //today "YYYY.MM.DD"
    //terms ["A~Z 1~12", ~~~]
    //privacies["YYYY.MM.DD A~Z", ~~~]
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int currentYear = Integer.parseInt(today.split("\\.")[0]);
        int currentMonth = Integer.parseInt(today.split("\\.")[1]);
        int currentDay = Integer.parseInt(today.split("\\.")[2]);
        for(int index = 0 ; index < privacies.length ; index++){
            String currentPrivacie = privacies[index];
            String collectionDate = currentPrivacie.split(" ")[0]; //"YYYY.MM.DD"
            int collectionYear = Integer.parseInt(collectionDate.split("\\.")[0]);
            int collectionMonth = Integer.parseInt(collectionDate.split("\\.")[1]);
            int collectionDay = Integer.parseInt(collectionDate.split("\\.")[2]);
            int endYear = collectionYear;
            int endMonth = collectionMonth;
            int endDay = collectionDay;
            String clause = currentPrivacie.split(" ")[1]; //A~Z
            int availableMonth; //약관 시작일에서 유효한 기간(달)
            //Searching clause at terms
            for(int termsIndex = 0 ; termsIndex < terms.length ; termsIndex++){
                if(terms[termsIndex].split(" ")[0].equals(clause)){ //if match
                    availableMonth = Integer.parseInt(terms[termsIndex].split(" ")[1]);
                    endMonth += availableMonth;
                    //이 부분 필요없긴 함
                    while(endMonth > 12){
                        endMonth -= 12;
                        endYear += 1;
                    }
                    int current = (currentYear*365*28) + (currentMonth*28) + currentDay;
                    int end = (endYear*365*28) + (endMonth*28) + endDay;
                    if(current >= end){
                        //push on Array
                        int[] newAnswer = new int[answer.length + 1];
                        for(int i = 0 ; i < answer.length ; i++){
                            newAnswer[i] = answer[i];
                        }
                        newAnswer[answer.length] = index + 1;
                        answer = newAnswer;
                    }
                }
            }
        }
        return answer;
    }
}