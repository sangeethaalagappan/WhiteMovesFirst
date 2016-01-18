
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sangeetha
 */

/*
    A Piece is an abstract class. All pieces (King, Queen, Rook, Bishop, Knight, Pawn) inherit from this class.
*/
public abstract class Piece {
    
    int x, y;  //x,y coordinates of piece location
    int player; 
    List<Square> moves;
    
    public Piece(int x, int y, int player){
        this.x = x;
        this.y = y;
        this.player = player;
        moves = new ArrayList<>();
        
    }
    
    abstract String name();  //All pieces should be able to return their 'kind' i.e. Pawn, Rook, etc.
    
    abstract List<Square> move(Piece piece, Board board); //function to create list of possible moves
    
    public void moveto(Board board, int newx, int newy){    //function to move piece to new location
        
        for (int i=0; i<moves.size();i++){
            if (moves.get(i) == board.getSquare(newx,newy,this.player)){ //move must be one of the player's possible moves.
                board.removePiece(board.checkSquare(this.x,this.y).piece);
                this.x = newx;
                this.y = newy;
                board.addPiece(this);
                return;
            }
        }
        System.out.println("Invalid move!");
        
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
   
    
}
