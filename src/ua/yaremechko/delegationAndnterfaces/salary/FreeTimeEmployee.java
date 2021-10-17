package ua.yaremechko.delegationAndnterfaces.salary;

public class FreeTimeEmployee implements SalaryBonus {

	private int hours;
	private double salaryPerHours;

	public FreeTimeEmployee(int hours, double salaryPerHours) {
		super();
		this.hours = hours;
		this.salaryPerHours = salaryPerHours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSalaryPerHours() {
		return salaryPerHours;
	}

	public void setSalaryPerHours(double salaryPerHours) {
		this.salaryPerHours = salaryPerHours;
	}
	
	

	@Override
	public String toString() {
		return "Free time employee getting salary: " + hours * salaryPerHours;
	}

	@Override
	public void salaryBonus() {
		if (getHours() > 100) {
			double salaryWithBonus = getSalaryPerHours() + 5;
			setSalaryPerHours(salaryWithBonus);
		} else {
			double salaryWithBonus = getSalaryPerHours() + 2.5;
			setSalaryPerHours(salaryWithBonus);
		}
	}

}
