
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sangeetha
 */
public class Board {
    Square[][] board;
    List<Piece> whitepieces = new ArrayList<>();
    List<Piece> blackpieces = new ArrayList<>();
    public Board(){
        board = new Square[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j<8; j++){
                board[i][j] = new Square(i,j); //initialise 64 squares
            }
        }
    }
    
       /*
      Set up a new board in traditional chess fashion.
    */
    public void initialise(){
        this.blackpieces = new ArrayList<>();
        this.whitepieces = new ArrayList<>();
        for (int py = 0; py < 8; py++){
            Pawn pawn = new Pawn(1,py,0);
            addPiece(pawn);
        }
        addPiece(new Rook(0,0,0));
        addPiece(new Rook(0,7,0));
        addPiece(new Knight(0,1,0));
        addPiece(new Knight(0,6,0));
        addPiece(new Bishop(0,2,0));
        addPiece(new Bishop(0,5,0));
        addPiece(new King(0,4,0));
        addPiece(new Queen(0,3,0));
        for (int ppy = 0; ppy < 8; ppy++){
            Pawn pawn = new Pawn(6,ppy,1);
            addPiece(pawn);
        }
        addPiece(new Rook(7,0,1));
        addPiece(new Rook(7,7,1));
        addPiece(new Knight(7,1,1));
        addPiece(new Knight(7,6,1));
        addPiece(new Bishop(7,2,1));
        addPiece(new Bishop(7,5,1));
        addPiece(new King(7,4,1));
        addPiece(new Queen(7,3,1));
        
    }
    
    
    
    /*
    getSquare is used to determine if a square is viable (within board constraints and not occupied by a piece of its own colour) for a piece to move to. 
    */
    public Square getSquare(int x, int y, int player){  
        if(x >= 0 && x<8 && y >= 0 && y<8 && board[x][y].checkSpace(player)==false){
             return board[x][y];
        } else{
            Square dflt = new Square(-1,-1);
            return dflt;
        }
       
    }
    
    /*
    checkSquare is mainly for testing purposes - to return the appropriate square, given coordinates.
    */
    public Square checkSquare(int x, int y){
        if (x >= 0 && x<8 && y >= 0 && y<8){
            return board[x][y];
        } else{
            Square dflt = new Square(-1,-1);
            return dflt;
        }
    }
    
   
    
     public void addPiece(Piece piece){
        int x = piece.x;
        int y = piece.y;
        getSquare(x,y,piece.player).addPiece(piece);
        if (piece.player == 1){  //white is 1
            whitepieces.add(piece);
        } if(piece.player==0){
            blackpieces.add(piece);  //black is 0
        }
    }
     
    public void removePiece(Piece piece){
        int x = piece.x;
        int y = piece.y;
        checkSquare(x,y).removePiece(piece);
        if (piece.player == 1){
            whitepieces.remove(piece);
        } if (piece.player==0){
            blackpieces.remove(piece);
        }
    }
     
}
