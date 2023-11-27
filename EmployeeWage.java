
class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int employeeCheck() {
        return (int) (Math.ceil(Math.random() * 10) % 3);
    }

    public static void computeWage(int maxHoursInMonth, int monthlyWorkingDays, int empWagePerHour){
        int empHours=0, totalDays = 0;

        while(empHours<maxHoursInMonth && totalDays<monthlyWorkingDays){
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

        int dailyWage = empHours * empWagePerHour;
        System.out.println("Daily Wage: " + dailyWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        computeWage(150,20,10);
    }
}
