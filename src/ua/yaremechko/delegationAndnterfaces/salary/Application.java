package ua.yaremechko.delegationAndnterfaces.salary;

public class Application {
	public static void main(String[] args) {

		FullTimeEmployee fullT = new FullTimeEmployee(21, 80);
		
		System.out.println(fullT);
		
		fullT.salaryBonus();
		
		System.out.println(fullT);
		
		System.out.println();
		
		FreeTimeEmployee freeT = new FreeTimeEmployee(98, 10);
		
		System.out.println(freeT);
		
		freeT.salaryBonus();
		
		System.out.println(freeT);
		
	}
}
