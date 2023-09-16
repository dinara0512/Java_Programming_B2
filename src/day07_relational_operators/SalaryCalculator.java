package day07_relational_operators;

public class SalaryCalculator {
    public static void main (String[] args) {
        double salary = 100_000;
        double stateTaxRate=0.06; // %6
        double federalTaxRate=0.22; //%22
        double stateTax, federalTax, totalTax, salaryAfterTax;

         stateTax = salary * stateTaxRate;
         federalTax = salary * federalTaxRate;
         totalTax = stateTax + federalTax;
         salaryAfterTax = salary - totalTax;

         String taxReport = "State tax rate: " + stateTax + "\n Federal tax rate: " + federalTax +" ,\n Base Salary "
                 + "$" + salary + "\nTax amount : " + stateTax + " for State tax " + federalTax +
                 " Federal tax, in total it is:" +
                 totalTax + "\n After tax  our salary is: " + salaryAfterTax;





        System.out.println(taxReport);




    }
}
