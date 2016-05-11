import java.awt.Color;

/**
 * Walker class this class create walker for jman.
 * @author Kasidid Pholwannabha
 *
 */
public class Walker extends Piece{
	
	/**
	 * Constructor for Walker class.
	 * @param x position in x axis
	 * @param y position in y axis
	 * @param c random color
	 * @param m map from Map class
	 */
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		if( c == 0 ) this.setColor(Color.RED);
		else if( c == 1 ) this.setColor(Color.GREEN);
		else if( c == 2 ) this.setColor(Color.YELLOW);
	}
	
	/**
	 * Constructor for Walker class.
	 * @param x position in x axis
	 * @param y position in y axis
	 * @param c expect color
	 * @param m map from Map class
	 */
	public Walker(int x, int y, Color c, Map m){
		super(Piece.WALKER, m);
		this.setX(x);
		this.setY(y);
		if(c == Color.RED || c == Color.GREEN || c == Color.YELLOW ) this.setColor(c);
	}

	@Override
	public void act() {
		int rand = rand(0, 2);
		int walk = rand(0, 3);
		int posX = getX();
		int posY = getY();
		Map m = getMap();
		if(walk == 0 ) posY--;
		else if(walk == 1) posY++;
		else if(walk == 2) posX--;
		else if(walk == 3) posX++;
		if(rand == 0){
			if(m.isEmpty(posX, posY) && walk == 0) m.move(getX(), getY(), posX, posY);
		}
		
	}
	/** = representation of this piece */
	public String toString(){
		return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
	}
	
}
