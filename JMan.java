import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {

	/** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
	public JMan(int x, int y, int c, Map m){
		super(Piece.JMAN, m);
		this.setX(x);
		this.setY(y);
		if( c == 0 ) 
			this.setColor( Color.red ); 
		else if( c == 1 ) 
			this.setColor( Color.GREEN );
		else if( c == 3 ) 
			this.setColor( Color.YELLOW );
	}

	/** Constructor: a new J*Man at position (x, y) on Map m
     with color c. Precondition: c is one of
     Color.RED, Color.GREEN, and Color.YELLOW.*/
	public JMan(int x, int y, Color c, Map m){
		super(Piece.JMAN, m);
		this.setX(x);
		this.setY(y);
		if(c == Color.RED || c == Color.GREEN || c == Color.YELLOW ) 
			this.setColor(c);
	}

	/** J*Man should move based on what button is pushed.
     This method is not used. */
	public void act(){
		return;
	}

	/** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
	public void step(int i){
		setActed(true);
		int posX = getX();
		int posY = getY();
		if( i == 0 ){
			posY--;
		}else if( i == 1 ){
			posY++;
		}else if( i == 2 ){
			posX--;
		}else if( i == 3 ){
			posX++;
		}
		Map m = getMap();
		Piece p = m.pieceAt( posX, posY );
		if(m.isInGrid( posX, posY )){
			if( p == null ){
				m.move( getX(), getY(), posX, posY );
				return;
			} else {
				if( canEat(p) ){
					m.move( getX(), getY(), posX, posY );
					this.setColor( p.getColor() );
				} else return;
			}
		} else return;
		
	}
	
	public boolean canEat( Piece p ){
		if(!(p instanceof Pillar))
			return ((p.getColor() == Color.GREEN) && (this.getColor() == Color.YELLOW)) 
				||((p.getColor() == Color.RED) && (this.getColor() == Color.GREEN)) 
				||((p.getColor() == Color.YELLOW)) && (this.getColor() == Color.RED);
		else return false;
		
	}
	/** = representation of this piece */
	public String toString() {
		String color= "";
		return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
	}
}
