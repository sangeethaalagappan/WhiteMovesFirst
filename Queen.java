
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sangeetha
 */
public class Queen extends Piece{
    public Queen(int x, int y, int player){
        super(x,y,player);
    }
    
    @Override
     public String name(){
        return "Queen";
    }
    
    @Override
    public List<Square> move(Piece queen, Board board){
        moves = new ArrayList<>();
        int qx = queen.getX();
        int qy = queen.getY();
        
        int i= qx+1;
        int j = qy;
               while (i!=qx && i<8 && (board.getSquare(i,qy,queen.player).squareX() != -1)){
                    moves.add(board.getSquare(i, qy, queen.player)); 
                    if (board.getSquare(i, qy, queen.player).occupied){
                        break;
                    }
                    i++;
                    
               }
               
               i = qx-1;
               while (i!=qx && i>=0 && (board.getSquare(i,qy,queen.player).squareX() != -1)){
                    moves.add(board.getSquare(i, qy, queen.player)); 
                    if (board.getSquare(i, qy, queen.player).occupied){
                        break;
                    }
                    i--;
                    
               }
        
               i = qx;
               j = qy+1;
               
            while (j!=qy && j < 8 && (board.getSquare(qx,j,queen.player).squareX() != -1)){
               moves.add(board.getSquare(qx, j, queen.player)); 
               if (board.getSquare(qx, j, queen.player).occupied){
                        break;
                 }
               j++;
            }
            
            j=qy-1;
            while (j!=qy && j >= 0 && (board.getSquare(qx,j,queen.player).squareX() != -1)){
               moves.add(board.getSquare(qx, j, queen.player)); 
               if (board.getSquare(qx, j, queen.player).occupied){
                        break;
                 }
               j--;
            }
        
        int ind;
        int indd;
        for (ind = qx, indd = qy; ind < 8 && indd < 8 && board.getSquare(ind+1, indd+1, queen.player).squareX()!=-1; ind++, indd++){
                    moves.add(board.getSquare(ind+1,indd+1, queen.player));
                    if (board.getSquare(ind+1,indd+1,queen.player).occupied){
                        break;
                    }
                   
        } 
         for (ind = qx, indd = qy; ind >= 0 && indd >= 0 && board.getSquare(ind-1, indd-1, queen.player).squareX()!=-1; ind--, indd--){
                    moves.add(board.getSquare(ind-1,indd-1, queen.player));
                    if (board.getSquare(ind-1,indd-1,queen.player).occupied){
                        break;
                    }
                    
        } 
         for (ind = qx, indd = qy; ind < 8 && indd >= 0 && board.getSquare(ind+1, indd-1, queen.player).squareX()!=-1; ind++, indd--){
                    moves.add(board.getSquare(ind+1,indd-1, queen.player));
                    if (board.getSquare(ind+1,indd-1,queen.player).occupied){
                        break;
                    }
                   
        } 
         for (ind = qx, indd = qy; ind >= 0 && indd < 8 && board.getSquare(ind-1, indd+1, queen.player).squareX()!=-1; ind--, indd++){
                    moves.add(board.getSquare(ind-1,indd+1, queen.player));
                    if (board.getSquare(ind-1,indd+1,queen.player).occupied){
                        break;
                    }
                    
        } 
         
        
        return moves;
        
    }
}
