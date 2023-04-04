package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<0){
            System.out.println("wrong input!");
        }
        if (salary>0&&salary<=10000){
            System.out.println((double) salary -((double) salary /100*15));
        }
        if ((10000 < salary && salary <= 20000)){
            System.out.println((double) salary -((double) salary /100*18));
        }
        if (salary>20000){
            System.out.println((double) salary -((double) salary /100*20));
        }
    }
}
