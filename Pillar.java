import java.awt.Color;

/**
 * This is Pillar class to create a pillar for block j*man.
 * @author Kasidid Pholwannabha.
 *
 */
public class Pillar extends Piece{
	
	/**
	 * Constructor for pillar class.
	 * @param x position in x axis
	 * @param y position in y axis
	 * @param c random color
	 * @param m map from Map class
	 */
	public Pillar(int x, int y, int c, Map m) {
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if( c == 0 ) this.setColor(Color.RED);
		else if( c == 1 ) this.setColor(Color.GREEN);
		else if( c == 2 ) this.setColor(Color.YELLOW);
	}
	
	/**
	 * Constructor for pillar class
	 * @param x position in x axis
	 * @param y position in y axis
	 * @param c expect color
	 * @param m map from Map class
	 */
	public Pillar(int x, int y, Color c, Map m){
		super(Piece.PILLAR, m);
		this.setX(x);
		this.setY(y);
		if(c == Color.RED || c == Color.GREEN || c == Color.YELLOW ) this.setColor(c);
	}

	@Override
	public void act() {
		int ran = rand(0, 2);
		int color = rand(0, 2);
		if( ran == 0 ){
			if(color == 1) this.setColor(Color.RED);
			else if(color == 1) this.setColor(Color.GREEN);
			else if(color == 2) this.setColor(Color.YELLOW);
		}
	}
	
	/** = representation of this piece */
	public String toString() {
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}
}
