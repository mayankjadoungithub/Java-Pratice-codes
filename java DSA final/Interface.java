
import java.util.*;
public class Interface {
    public static void main(String a[]){
        Queen q = new Queen();
        q.moves(); 

    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,left,right,diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
    
}

