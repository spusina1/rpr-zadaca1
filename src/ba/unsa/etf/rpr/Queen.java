package ba.unsa.etf.rpr;
import java.util.*;

public class Queen extends ChessPiece {

    public Queen(String position, Color color){
        super(position, color);
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public Color getColor(){
        return super.getColor();
    }

    @Override
    public Object clone(){
        return new Queen(position,color);
    }
    @Override
    public void move(String position){
        IllegalChessMoveException izuzetak= new IllegalChessMoveException();
        super.move(position);
        if(this.position.equals(position)) throw new IllegalChessMoveException();
        if(position.charAt(0)==this.position.charAt(0) || position.charAt(1)==this.position.charAt(1) ||
                (Math.abs(position.charAt(0)-this.position.charAt(0)) == Math.abs(position.charAt(1)-this.position.charAt(1))))
        this.position=position;
        else throw izuzetak;
    }
}
