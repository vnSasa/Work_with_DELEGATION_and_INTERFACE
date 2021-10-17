package ua.yaremechko.delegationAndinterfaces.spaceShip;

public class Application {

	public static void main(String[] args) {
		
		SpaceShip s = new SpaceShip();
		s.moveDown(23);
		s.moveRight(57);
		s.moveLeft(34);
		s.moveUp(100);
		
	}

}
