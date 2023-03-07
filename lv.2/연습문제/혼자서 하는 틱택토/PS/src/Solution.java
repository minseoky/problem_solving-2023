class Solution {
    public int solution(String[] board) {
        // 조건 1: O가 선공이므로 X개수보다 많거나 같아야 함, 허나 2개 이상 많으면 안됨.
        // 조건 2: X line과 O line은 같이 완성될 수 없음.
        // 조건 1-1: X line O line 나눠서 풀이 O line이 완성된 경우에 한해 O가 더 많아야 함
        // 조건 1-2: X line O line 나눠서 풀이 X line이 완성된 경우에 한해 O X 개수가 같아야 함

        int countX = 0;
        int countO = 0;
        int countLinesX= 0;
        int countLinesO= 0;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(board[i].charAt(j) == 'X'){
                    countX++;
                }
                else if(board[i].charAt(j) == 'O'){
                    countO++;
                }
            }
        }
        //조건 1
        if(countO < countX || countO - countX > 1){
            return 0;
        }
        //가로 줄 확인
        for(int i = 0 ; i < 3 ; i++){
            if(board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2) && board[i].charAt(0) == 'O'){
                countLinesO++;
            }
            if(board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2) && board[i].charAt(0) == 'X'){
                countLinesX++;
            }
        }
        //세로 줄 확인
        for(int i = 0 ; i < 3 ; i++){
            if(board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i) && board[0].charAt(i) == 'O'){
                countLinesO++;
            }
            if(board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i) && board[0].charAt(i) == 'X'){
                countLinesX++;
            }
        }
        //대각선 확인
        if(board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2) && board[0].charAt(0) == 'O'){
            countLinesO++;
        }
        if(board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2) && board[0].charAt(0) == 'X'){
            countLinesX++;
        }
        if(board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0) && board[0].charAt(2) == 'O'){
            countLinesO++;
        }
        if(board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0) && board[0].charAt(2) == 'X'){
            countLinesX++;
        }
        //조건 2
        if(countLinesO > 0 && countLinesX > 0){
            return 0;
        }
        //조건 1-1
        if(countLinesO > 0 && countO <= countX){
            return 0;
        }
        //조건 1-2
        if(countLinesX > 0 && countO != countX){
            return 0;
        }
        return 1;
    }
}