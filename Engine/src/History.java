import java.io.Serializable;
import java.util.LinkedList;

public class History implements Serializable {

    private LinkedList<Move> moveList = new LinkedList<>();

    public void AddMoveToHistory(int i_PlayerIndex, int i_ColumnIndex) {

        moveList.add(new Move(i_PlayerIndex,i_ColumnIndex));

    }

    public LinkedList<Move> showHistory(){

        return moveList;
    }

    public void removeFromHistory(Move moveToRemove)
    {
        moveList.remove(moveToRemove);
    }

    public void removeFromHistory()
    {
        //overload that will remove the last move from history - in order to improve performance.
        moveList.removeLast();
    }

}
