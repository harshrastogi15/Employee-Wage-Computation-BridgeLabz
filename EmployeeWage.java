class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;

    public static int employeeCheck() {
        return (int) (Math.ceil(Math.random() * 10) % 3);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int employeePresent = employeeCheck();
        int empHours;
        // if(employeePresent == IS_FULL_TIME){
        // System.out.println("Employee is Full Time");
        // empHours = 8;
        // }else if(employeePresent == IS_PART_TIME){
        // System.out.println("Employee is Part Time");
        // empHours = 4;
        // }
        // else{
        // System.out.println("Employee is absent");
        // empHours = 0;
        // }

        switch (employeePresent) {
            case IS_FULL_TIME:
                System.out.println("Employee is Full Time");
                empHours = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Part Time");
                empHours = 4;
                break;
            default:
                System.out.println("Employee is absent");
                empHours = 0;
                break;
        }

        int dailyWage = empHours * EMP_WAGE_PER_HOUR;
        System.out.println("Daily Wage: " + dailyWage);
    }
}
