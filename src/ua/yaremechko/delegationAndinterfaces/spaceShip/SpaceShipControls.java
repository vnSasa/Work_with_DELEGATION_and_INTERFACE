package ua.yaremechko.delegationAndinterfaces.spaceShip;

public class SpaceShipControls {

	public void up(int kilometer) {
		System.out.println("SpaceShip is moving UP on: " + kilometer + "km");
	}
	
	public void down(int kilometer) {
		System.out.println("SpaceShip is moving DOWN on: " + kilometer + "km");
	}
	
	public void right(int kilometer) {
		System.out.println("SpaceShip is moving RIGHT on: " + kilometer + "km");
	}
	
	public void left(int kilometer) {
		System.out.println("SpaceShip is moving LEFT on: " + kilometer + "km");
	}
	
}
