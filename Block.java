import java.awt.Color;
/**
 * Block class this class create white blokc in map to block jman way.
 * @author Kasidid Pholwannabha
 *
 */
public class Block extends Piece{

	/**
	 * Constructor for Block class.
	 * @param x position in x axis
	 * @param y position in y axis
	 * @param m map from map class
	 */
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);
		this.setX(x);
		this.setY(y);
		this.setColor(Color.WHITE);
	}

	@Override
	public void act() {
		return;
	}
	
	/** = representation of this piece */
	public String toString() {
		return getColorWord() + " Blokc at (" + getX() + ", " + getY() + ")";
	}
}
