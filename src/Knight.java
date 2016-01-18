
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sangeetha
 */
public class Knight extends Piece {
    
    public Knight(int x, int y, int player){
        super(x,y,player);
    }
     
     @Override
    public String name(){
        return "Knight";
    }
    
    @Override
    public List<Square> move(Piece knight, Board board){
        int kx = knight.getX();
        int ky = knight.getY();
        moves = new ArrayList<>();
       if (((kx + 1) < 8) && ((ky + 2) < 8) && board.getSquare(kx+1, ky+2, player).squareX()!=-1){
            moves.add(board.getSquare(kx + 1, ky + 2, knight.player));
        } 
        if (((kx - 1) >= 0) && (ky + 2) < 8 && board.getSquare(kx-1, ky+2, player).squareX()!=-1){
            moves.add(board.getSquare(kx - 1, ky + 2, knight.player));
        } 
        if (((kx + 2) < 8) && ((ky + 1) < 8)&& board.getSquare(kx+2, ky+1, player).squareX()!=-1){
            moves.add(board.getSquare(kx + 2, ky + 1, knight.player));
        } 
        if (((kx - 2) >= 0) && ((ky + 1) < 8) && board.getSquare(kx-2, ky+1, player).squareX()!=-1){
            moves.add(board.getSquare(kx - 2, ky+1, knight.player));
        } 
        if (((kx + 1) < 8) && ((ky - 2) >= 0) && board.getSquare(kx+1, ky-2, player).squareX()!=-1){
            moves.add(board.getSquare(kx + 1, ky-2, knight.player));
        } 
        if (((kx - 1) >= 0) && ((ky - 2) >= 0) && board.getSquare(kx-1, ky-2, player).squareX()!=-1){
            moves.add(board.getSquare(kx - 1, ky - 2, knight.player));
        } 
        if (((kx + 2) < 8) && ((ky - 1) >= 0) && board.getSquare(kx+2, ky-1, player).squareX()!=-1){
            moves.add(board.getSquare(kx + 2, ky - 1, knight.player));
        } 
        if (((kx - 2) >= 0) && ((ky - 1) >= 0) && board.getSquare(kx-2, ky-1, player).squareX()!=-1){
            moves.add(board.getSquare(kx - 2, ky - 1, knight.player)); 
        }
        
        return moves;
        
    }
}
