import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = 0;
        }
        //유저, 유저가 신고한 유저, 유저가 받은 신고 수
        HashMap<String,List<String>> reportData = new HashMap<>(); //key : 유저 ; value : 해당유저가 신고한 유저들
        HashMap<String,Integer> reportedData = new HashMap<>(); // key : 유저 ; value : 해당 유저가 받은 누적신고건수
        for(int i = 0 ; i < id_list.length ; i++){
            List<String> reportedUsers = new ArrayList<>();
            reportData.put(id_list[i], reportedUsers);
            reportedData.put(id_list[i], 0);
        }
        for(int i = 0 ; i < report.length ; i++){
            if( !reportData.get(report[i].split(" ")[0]).contains(report[i].split(" ")[1]) ){//중복신고 허용X
                reportData.get(report[i].split(" ")[0]).add(report[i].split(" ")[1]);
                reportedData.put(report[i].split(" ")[1], reportedData.get(report[i].split(" ")[1])+1);
            }
        }
        for(int i = 0 ; i < id_list.length ; i++){
            if(reportedData.get(id_list[i]) >= k){//신고누적 기준 만족시 정지
                //id_list[i]신고한 사람들 찾아서 메일 전송
                for(int j = 0 ; j < id_list.length ; j++){
                    if(reportData.get(id_list[j]).contains(id_list[i])){
                        //System.out.println(id_list[j] + "에게" + id_list[i] + "를 신고한 기록이 있습니다");
                        answer[j]++;
                    }
                }
            }
        }

        //System.out.println(reportData);
        //System.out.println(reportedData);
        return answer;
    }
}