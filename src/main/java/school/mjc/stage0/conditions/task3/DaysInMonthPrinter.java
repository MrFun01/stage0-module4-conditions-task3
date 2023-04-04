package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int j=1,m=3,my=5,jl=7,ag=8,ok=10,dc=12,mr=4,jn=6,sp=9,nv=11;
        if (month ==2){
            System.out.println("28");
        }else if (month ==j|| month ==m|| month ==my|| month ==jl|| month ==ag|| month ==ok|| month ==dc){
            System.out.println("31");
        }else if (month==mr||month==jn||month==sp||month==nv){
            System.out.println("30");
        } else {
            System.out.println("wrong number!");
        }
    }
}
