import java.awt.geom.*;
import java.util.*;

/**
 * A class that holds graphics properties for each hole.
 * 
 * @author Vincent Stowbunenko
 *
 */
public class MancalaHoleGraphics {

	private RoundRectangle2D outerBound;
	private RoundRectangle2D innerBound;
	List<MancalaStoneGraphics> stones;
	
	public MancalaHoleGraphics() {
		stones = new ArrayList<>();
	}
	
	public RoundRectangle2D getOuterBound() {
		return outerBound;
	}
	public void setOuterBound(RoundRectangle2D outerBound) {
		this.outerBound = outerBound;
	}
	public RoundRectangle2D getInnerBound() {
		return innerBound;
	}
	public void setInnerBound(RoundRectangle2D innerBound) {
		this.innerBound = innerBound;
	}
	public List<MancalaStoneGraphics> getStones() {
		return stones;
	}
	public void setStones(List<MancalaStoneGraphics> stones) {
		this.stones = stones;
	}
	

}