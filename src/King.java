
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sangeetha
 */
public class King extends Piece{
    
    public King(int x, int y, int player){
        super(x,y,player);
    }
    
     @Override
    public String name(){
        return "King";
    }
    
    @Override
    public List<Square> move(Piece king, Board board){
        moves = new ArrayList<>();
        int kx = king.getX();
        int ky = king.getY();
        if (((kx - 1) >= 0) && ((ky + 1) < 8) && board.getSquare(kx-1, ky+1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx - 1, ky + 1, king.player));
        } 
        if (((ky + 1) < 8) && board.getSquare(kx, ky+1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx, ky + 1, king.player));
        } 
        if (((kx + 1) < 8) && ((ky + 1) < 8) && board.getSquare(kx+1, ky+1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx + 1, ky + 1, king.player));
        } 
        if (((kx - 1) >= 0) && board.getSquare(kx-1, ky, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx - 1, ky, king.player));
        } 
        if (((kx + 1) < 8) && board.getSquare(kx+1, ky, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx + 1, ky, king.player));
        } 
        if (((kx - 1) >= 0) && ((ky - 1) >= 0) && board.getSquare(kx-1, ky-1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx - 1, ky - 1, king.player));
        } 
        if (((ky - 1) >= 0) && board.getSquare(kx, ky-1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx, ky - 1, king.player));
        } 
        if (((kx + 1) < 8) && ((ky - 1) >= 0) && board.getSquare(kx+1, ky-1, king.player).squareX()!=-1){
            moves.add(board.getSquare(kx + 1, ky - 1, king.player)); 
        }
        return moves;
        
    }
}
