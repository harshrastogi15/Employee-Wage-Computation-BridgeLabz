class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;

    // UC1 - Employee is Present or Absent
    public static int employeeCheck(){
        return (int)(Math.ceil(Math.random()*10)%2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int employeePresent = employeeCheck();
        int empHours;
        if(employeePresent == IS_FULL_TIME){
            System.out.println("Employee is present");
            empHours = 8;
        }else{
            System.out.println("Employee is absent");
            empHours = 0;
        }
        // UC2 - Calculate Daily Employee Wage
        int dailyWage = empHours*EMP_WAGE_PER_HOUR;
        System.out.println("Daily Wage: " + dailyWage);
    }
}
