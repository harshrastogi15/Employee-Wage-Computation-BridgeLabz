import java.lang.reflect.Method;

class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int MONTHLY_WORKING_DAYS = 30;
    public static final int MAX_HOURS_IN_MONTH = 50;

    public static int employeeCheck() {
        return (int) (Math.ceil(Math.random() * 10) % 3);
    }
    // UC7 - Refactor the Code to write a Class Method to Compute Employee Wage
    public static void computeWage(){
        int empHours=0, totalDays = 0;
        // UC6 - Calculate Wages till a condition of total working hours or days is reached for a month
        while(empHours<MAX_HOURS_IN_MONTH && totalDays<MONTHLY_WORKING_DAYS){
            int employeePresent = employeeCheck();
            switch (employeePresent) {
                case IS_FULL_TIME:
                System.out.println("Employee is Full Time");
                empHours += 8;
                break;
                case IS_PART_TIME:
                System.out.println("Employee is Part Time");
                empHours += 4;
                break;
                default:
                System.out.println("Employee is absent");
                empHours += 0;
                break;
            }
        }

        int dailyWage = empHours * EMP_WAGE_PER_HOUR;
        System.out.println("Daily Wage: " + dailyWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeWage();
    }
}
