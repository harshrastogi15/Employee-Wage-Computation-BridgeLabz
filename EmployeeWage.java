class EmployeeWage {
    public static final int IS_FULL_TIME = 1;

    // UC1 - Employee is Present or Absent
    public static int employeeCheck(){
        return (int)(Math.ceil(Math.random()*10)%2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int employeePresent = employeeCheck();
        if(employeePresent == IS_FULL_TIME){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }

    }
}
