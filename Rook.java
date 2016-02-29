
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Sangeetha
 */
public class Rook extends Piece {
     public Rook(int x, int y, int player){
        super(x,y,player);
    }
     
      @Override
     public String name(){
        return "Rook";
    }
    
     @Override
    public List<Square> move(Piece rook, Board board){
        moves = new ArrayList<>();
        int rx = rook.getX();
        int ry = rook.getY();
        
        int i = rx+1;
        int j = ry;
        
        while (i!=rx && i<8 && (board.getSquare(i,ry, rook.player).squareX() != -1)){
                    moves.add(board.getSquare(i, ry, rook.player)); 
                    if (board.getSquare(i, ry, rook.player).occupied){
                        break;
                    }
                    i++;
                    
        }
        i = rx-1;
        while (i!=rx && i>=0 && (board.getSquare(i,ry, rook.player).squareX() != -1)){
                    moves.add(board.getSquare(i, ry, rook.player)); 
                    if (board.getSquare(i, ry, rook.player).occupied){
                        break;
                    }
                    i--;
                    
        }
        
        i = rx;
        j = ry+1;
          while (j!=ry && j < 8 && (board.getSquare(rx,j, rook.player).squareX() != -1)){
               moves.add(board.getSquare(rx, j, rook.player)); 
               if (board.getSquare(rx, j, rook.player).occupied){
                        break;
                 }
               j++;
            }
          j=ry-1;
            while (j!=ry && j >=0 && (board.getSquare(rx,j, rook.player).squareX() != -1)){
               moves.add(board.getSquare(rx, j, rook.player)); 
               if (board.getSquare(rx, j, rook.player).occupied){
                        break;
                 }
               j--;
            }
        return moves;
        
    }
}
