package ua.yaremechko.delegationAndinterfaces.spaceShip;

public class SpaceShip {

	private SpaceShipControls spaceShipControlsl = new SpaceShipControls();
	
	public SpaceShip() {
		
	}
	
	public void moveUp(Integer kilometer) {
		spaceShipControlsl.up(kilometer);
	}
	
	public void moveDown(Integer kilometer) {
		spaceShipControlsl.down(kilometer);
	}
	
	public void moveRight(Integer kilometer) {
		spaceShipControlsl.right(kilometer);
	}
	
	public void moveLeft(Integer kilometer) {
		spaceShipControlsl.left(kilometer);
	}

	
}
