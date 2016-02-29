
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sangeetha
 */
public class Pawn extends Piece {
     public Pawn(int x, int y, int player){
        super(x,y,player);
        
     
    }
      
      @Override
     public String name(){
        return "Pawn";
    }
    
     @Override
     public List<Square> move(Piece pawn, Board board){
         moves = new ArrayList<>();
        int px = pawn.getX();
        int py = pawn.getY();
        
        if (pawn.player == 0){
            if (((px + 1) < 8) && board.getSquare(px+1, py, pawn.player).occupied==false){
                moves.add(board.getSquare(px+1, py, pawn.player));
            } 
            
            //unmoved pawns eligible to move up 2 spaces.
            if (((px + 2) < 8) && (px  == 1) && board.getSquare(px+2, py, pawn.player).occupied==false){
                moves.add(board.getSquare(px+2, py, pawn.player));
            } 
            
            //pawn diagonal attack move
           if ((py-1 >= 0) && ((px + 1) < 8) && board.getSquare(px+1,py-1,pawn.player).occupied && board.getSquare(px+1,py-1,pawn.player).squareX()!=-1){
                moves.add(board.getSquare(px+1, py - 1, pawn.player));
            } 
           if ((px+1 < 8) && ((py + 1) < 8) && board.getSquare(px+1,py+1,pawn.player).occupied && board.getSquare(px+1,py+1,pawn.player).squareX()!=-1){
                moves.add(board.getSquare(px+1, py + 1, pawn.player));
            } 
        } else{
            if (((px - 1) >= 0) && board.getSquare(px-1, py, pawn.player).occupied==false){
                moves.add(board.getSquare(px-1, py, pawn.player));
            } 
            if (((px - 2) >= 0) && (px  == 6) && board.getSquare(px-2, py, pawn.player).occupied==false){
                moves.add(board.getSquare(px-2, py, pawn.player));
            } 
           if ((px-1 >= 0) && ((py - 1) >= 0) && board.getSquare(px-1,py-1,pawn.player).occupied && board.getSquare(px-1,py-1,pawn.player).squareX()!=-1){
                moves.add(board.getSquare(px-1, py - 1, pawn.player));
            } 
           if ((py+1 < 8) && ((px - 1) >= 0) && board.getSquare(px-1,py+1,pawn.player).occupied && board.getSquare(px-1,py+1,pawn.player).squareX()!=-1){
                moves.add(board.getSquare(px-1, py + 1, pawn.player));
            } 
        }
        return moves;
        
    }
}
