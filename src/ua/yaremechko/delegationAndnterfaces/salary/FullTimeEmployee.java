package ua.yaremechko.delegationAndnterfaces.salary;

public class FullTimeEmployee implements SalaryBonus {

	private int day;
	private double salaryPerDay;

	public FullTimeEmployee(int day, double salaryPerDay) {
		super();
		this.day = day;
		this.salaryPerDay = salaryPerDay;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getSalaryPerDay() {
		return salaryPerDay;
	}

	public void setSalaryPerDay(double salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}
	
	

	@Override
	public String toString() {
		return "Full time employee getting salary: " + day * salaryPerDay;
	}

	@Override
	public void salaryBonus() {
		double salaryWithBonus = getSalaryPerDay() + 10;
		setSalaryPerDay(salaryWithBonus);

	}

}
