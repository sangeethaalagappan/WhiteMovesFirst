
/**
 *
 * @author Sangeetha
 */
public class Square {
    int x, y;
    boolean occupied;
    Piece piece;
    int player;
    
    
    public Square(int x, int y){
        if(x >= 0 && x<8 && y >= 0 && y<8){
            this.x = x;
            this.y = y;
            this.occupied = false;
        } else{
            this.x = -1;   //default Square created if parameters not within constraints
            this.y = -1;
        }
    }
    
    
    public int squareX(){
        return x;
    }
    
    public int squareY(){
        return y;
    }
    
    /*
        Check if Square is occupied by specified player
    */
    public boolean checkSpace(int plyer){  
        return occupied && player == plyer;
    }
    
    public void addPiece(Piece piece){
        this.piece = piece;
        this.player = piece.player;
        this.occupied = true;
    }
    
    public void removePiece(Piece piece){
        this.player = -1;
        this.occupied = false;
        
    }
    
    
}
