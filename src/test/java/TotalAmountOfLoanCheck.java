import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TotalAmountOfLoanCheck {

/*    Client is taking loan for 30 years. We have amount client needs.
     We know that he will need to pay 10% for the first 10 years, 8% for the second 10 years (from amount left) and 6% for the last 10 years (from amount left).
    Your test must check if I calculated the total sum to pay correctly.
    I’ll specify amount client needs and amount to pay.
    Code must be published on GitHub
    Formula to calculate loan expenses can be found in Google - doesn’t matter which one ;)*/

    private double loanCalculation(double clientLoanAmount, double expectedAmountToPay) {

        double percentsForFirstTenYears = 0.1;
        double percentsForYearsFrom10till20 = 0.08;
        double percentsForYearsFrom20till30 = 0.06;

        double totalAmountForFirst10Years = (clientLoanAmount / 3) * (1 + 10 * percentsForFirstTenYears);
        double totalAmountForYearsFrom10till20 = (clientLoanAmount / 3) * (1 + 10 * percentsForYearsFrom10till20);
        double totalAmountForYearsFrom20till30 = (clientLoanAmount / 3) * (1 + 10 * percentsForYearsFrom20till30);

        double totalAmountToPay = totalAmountForFirst10Years + totalAmountForYearsFrom10till20 + totalAmountForYearsFrom20till30;

        return totalAmountToPay;
    }

    @Test
    public void totalAmountOfLoanCheck() {

        double expectedAmountToPay = 5400.00;
        double totalAmountToPay = loanCalculation(3000.00, 5400.00);

        Assertions.assertEquals(expectedAmountToPay, totalAmountToPay, "Total amount is not equal.");

    }

}


