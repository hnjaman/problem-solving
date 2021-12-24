package code2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CashRegister {
    public static void main(String[] args) throws IOException
    {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line  ;
        while ((line = in.readLine()) != null)
        {
            double pp = Double.parseDouble(line.split(";")[0]);
            double ch = Double.parseDouble(line.split(";")[1]);
            System.out.println(getCashChange(pp, ch));
        }
    }
    private static String getCashChange(double price, double cash)
    {
        if (cash < price) { return "ERROR"; }
        if (cash == price) { return "ZERO"; }
        double cashBack = cash - price;
        StringBuilder change = new StringBuilder();

        while (cashBack > 0.01d) {
            if (cashBack >= 100.0d) {
                change.append("ONE HUNDRED");
                cashBack -= 100.0d;
            } else if (cashBack >= 50.0d) {
                change.append("FIFTY");
                cashBack -= 50.0d;
            } else if (cashBack >= 20.0d) {
                change.append("TWENTY");
                cashBack -= 20.0d;
            } else if (cashBack >= 10.0d) {
                change.append("TEN");
                cashBack -= 10.0d;
            } else if (cashBack >= 5.0d) {
                change.append("FIVE");
                cashBack -= 5.0d;
            } else if (cashBack >= 2.0d) {
                change.append("TWO");
                cashBack -= 2.0d;
            } else if (cashBack >= 1.0d) {
                change.append("ONE");
                cashBack -= 1.0d;
            } else if (cashBack >= 0.5d) {
                change.append("HALF DOLLAR");
                cashBack -= 0.5d;
            } else if (cashBack >= 0.25d) {
                change.append("QUARTER");
                cashBack -= 0.25d;
            } else if (cashBack >= 0.1d) {
                change.append("DIME");
                cashBack -= 0.1d;
            } else if (cashBack >= 0.05d) {
                change.append("NICKEL");
                cashBack -= 0.05d;
            } else {
                change.append("PENNY");
                cashBack -= 0.01d;
            }
            change.append(",");
        }
        change.setLength(change.length() - 1);

        return change.toString();
    }
}
