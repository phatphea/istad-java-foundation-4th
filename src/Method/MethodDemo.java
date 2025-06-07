package Method;

public class MethodDemo {

    public void printLabel(){
        System.out.println("Hello ISTAD");
    }
    public int sumNumber(int...nums){
        int sum =0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
    public double calculatePay(double payPerHour, double hourWorked){
        double totalPay = 0;

        if(payPerHour<8){
            System.out.println("Pay per hour can not less than 8");
            return 0;
        }

        if(hourWorked>60){
            System.out.println("Hours worked can not more than 60");
            return 0;
        }

        if(hourWorked<=40){
            totalPay = payPerHour * hourWorked;
        } else if (hourWorked<=60) {
            double totalPayNormal = payPerHour*40;

            double overTime = hourWorked - 40;
            double payOverTime = payPerHour*1.5;
            double totalPayOvertime = overTime * payOverTime; //60


            totalPay = totalPayNormal + totalPayOvertime;

        }


        return totalPay;
    }
}
