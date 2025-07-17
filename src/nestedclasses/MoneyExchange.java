package nestedclasses;

import java.text.DecimalFormat;

public class MoneyExchange {

    static DecimalFormat df = new DecimalFormat("#,##0.00");

    static class UsdHelper{
        double convertFromKhrtoUsd(double khr){
            return khr / 4100;
        }
    }

    static class KhrHelper{
        double convertFromUsdToKhr(double usd){
            return usd * 4100;
        }
    }

    public static void main(String[] args) {
        MoneyExchange.UsdHelper usdHelper = new MoneyExchange.UsdHelper();
        System.out.println("$"+df.format(usdHelper.convertFromKhrtoUsd(2_000_000)) );

        MoneyExchange.KhrHelper khrHelper = new MoneyExchange.KhrHelper();
        System.out.println("KHR " + df.format(khrHelper.convertFromUsdToKhr(2000)));
    }

}
