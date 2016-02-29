
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sangeetha
 */
class NewGame {
    public static void main(String[] args) {
        Board board = new Board();
        board.initialise();
        test0(board);
        //test1(board);
        //test2(board);
        
    }
    

    
    /* 
      Given the board's configuration and the player who is about to move, return a list of all possible moves for the player.
    */
    public static void availableMoves(Board board, int player){
        List<Piece> pieces = new ArrayList<>();
        int movesno = 0;
        int uniq = 0;
        String plyr = "";
        if (player == 1){
            pieces = board.whitepieces;
           
            plyr = "white";
        } 
        if (player==0){
            pieces = board.blackpieces;
            plyr = "black";
        }
        for (Piece piece : pieces){
            piece.move(piece,board);
            if (piece.moves.size()>0){
                uniq++;
            }
            for (int i = piece.moves.size()-1; i>=0; i--){
               
                if (piece.moves.get(i)!= null){
                    movesno++;
                    System.out.println(piece.name()+ " at <" + (piece.x + 1) + ":" + (piece.y+1) + "> can move to <" + (piece.moves.get(i).squareX()+1) + ":" + (piece.moves.get(i).squareY()+1) + ">");
            }
        }
        }
        System.out.println(movesno + " legal moves (" + uniq + " unique pieces) for " + plyr + " player.");
        
    }
    
    public static void test0(Board board){
        board.initialise();
        availableMoves(board,1); //Available moves for white at start of game. 
        availableMoves(board,0); //Available moves for black at start of game.
    }
    
    public static void test1(Board board){
        //Knight knight = new Knight(3,4,0);
        //board.addPiece(knight); //Adding test pieces
        Rook rook = new Rook (3,3,1);  //Rook at (4,4)
        board.addPiece(rook);
        availableMoves(board,1); //Check if Rook lists Knight's square as possible move
        move(board, 1, rook, 2, 4); //Check if rook can move to nearest pawn's square
        availableMoves(board,1); 
        //System.out.println(board.checkSquare(1, 3).piece.name()); //Check if rook has replaced the pawn at (2,4)
        //System.out.println(board.checkSquare(3, 3).occupied); //Should return false;
        //board.removePiece(rook);
        //board.removePiece(knight);
        
    }
    
    public static void test2(Board board){
        board.initialise();
        Knight knight = new Knight(3,4,0);
        board.addPiece(knight);
        move(board,0,knight,8,8); //Should return invalid;
        
    }
    
    /* 
        Move piece to new cordinates x,y, given the current board configuration.
    */
    public static void move(Board board, int player, Piece piece,int x,int y){
        availableMoves(board,player);
        piece.moveto(board, x-1, y-1);
        
        
    }
}