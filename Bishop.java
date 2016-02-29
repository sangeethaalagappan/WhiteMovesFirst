
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sangeetha
 */
public class Bishop extends Piece{
     public Bishop(int x, int y, int player){
        super(x,y,player);
    }
     
     @Override
     public String name(){
        return "Bishop";
    }
    
     @Override
    public List<Square> move(Piece bishop, Board board){
       int bx = bishop.getX();
        int by = bishop.getY();
        moves = new ArrayList<>();
        int ind;
        int indd;
        for (ind = bx, indd = by; ind < 8 && indd < 8 && board.getSquare(ind+1, indd+1, bishop.player).squareX()!=-1; ind++, indd++){
                    moves.add(board.getSquare(ind+1,indd+1, bishop.player));
                    if (board.getSquare(ind+1,indd+1,bishop.player).occupied){
                        break;
                    }
                    
        } 
         for (ind = bx, indd = by; ind >= 0 && indd >= 0 && board.getSquare(ind-1, indd-1, bishop.player).squareX()!=-1; ind--, indd--){
                    moves.add(board.getSquare(ind-1,indd-1, bishop.player));
                     if (board.getSquare(ind-1,indd-1,bishop.player).occupied){
                        break;
                    }
                   
        } 
         for (ind = bx, indd = by; ind < 8 && indd >= 0 && board.getSquare(ind+1, indd-1, bishop.player).squareX()!=-1; ind++, indd--){
                    moves.add(board.getSquare(ind+1,indd-1, bishop.player));
                     if (board.getSquare(ind+1,indd-1,bishop.player).occupied){
                        break;
                    }
                    
        } 
         for (ind = bx, indd = by; ind >= 0 && indd < 8 && board.getSquare(ind-1, indd+1, bishop.player).squareX()!=-1; ind--, indd++){
                    moves.add(board.getSquare(ind-1,indd+1, bishop.player));
                     if (board.getSquare(ind-1,indd+1,bishop.player).occupied){
                        break;
                    }
                    
        } 
         
        
        return moves;
        
    }
}
