

public class Board {

    public static final int SIZE = 5;
    public static final int WIN_STREAK = 3;


    public enum Mark {BLANK, X, O};
    enum Winner{DRAW, X_WINS, Y_WINS};
    

    boolean putMark(Mark mark, int row, int col){
        if(row < 0 || col < 0 || mark != Mark.BLANK){
            return false;
        }
    return true;
}
 


        public Board(){

        }



     boolean isGameEnded(){
       return true;
    }
   // enum gameStatus() // how to handle?

   public Mark getMark(int row, int col){
        
            return Mark.BLANK; 

    }

    public int getSize(){
        return SIZE;
    }
    public int winStrike(){
        return WIN_STREAK;
    }


}