class EmpWageForUC5 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int empRatePerHr = 20;
	public static final int workingDays = 5;
	public static void main(String args[]){
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for ( int day=1; day<=workingDays; day++)
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_FULL_TIME : 
					empHrs = 8;
					break;
				case IS_PART_TIME :
					empHrs = 4;
					break;
				default :
					empHrs = 0;
				}

			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;
			System.out.println("Employee Wage : " + empWage);
		}
		System.out.println("Total Employee Wage : " + totalEmpWage);
	}
}
