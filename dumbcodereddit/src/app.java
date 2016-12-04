import java.util.Scanner;
class Payroll {

	private Scanner sc;

	public Payroll() {
		double basesalary, allowance, deduction;
		sc = new Scanner(System.in);
		System.out.println("Enter salary, allowance and deduction...");
		basesalary = sc.nextDouble();
		allowance = sc.nextDouble();
		deduction = sc.nextDouble();
		System.out.println(basesalary + allowance - deduction);
	}

	public void display(String name, int id, double s) {
		System.out.println("Name " + name + " ID " + id + " Your payroll is " + s);
	}

}

public class app {

	private static Scanner sc;

	public static void main(String[] args) {
		double s;
		int id;
		String name;
		sc = new Scanner(System.in);
		System.out.println("Enter name and id...");
		name = sc.next();
		id = sc.nextInt();
		s = sc.nextDouble();
		Payroll payroll1 = new Payroll();
		payroll1.display(name, id, s);

	}
}

