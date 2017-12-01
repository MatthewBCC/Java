/*
 * Example 10.8 : BasePlusCommissionEmployee.java BasePlusCommissionEmployee class is-a CommissionEmployee class
 */

 public class BasePlusCommissionEmployee extends CommissionEmployee
 {
     private double baseSalary;

     public BasePlusCommissionEmployee(String fNAme, String lName, String SSN, double sales, double rate, double baseSalary)
     {
         super(fNAme, lName, SSN, sales, rate);
         setBaseSalary(baseSalary);
     }

     public double getBaseSalary() {
         return baseSalary;
     }

     public void setBaseSalary(double baseSalary) {

         if ( baseSalary < 0.0)
             throw new IllegalArgumentException("Base Salary Must Be Positive");

         this.baseSalary = baseSalary;
     }

     @Override
     public double earnings()
     {
         return getBaseSalary() + super.earnings();
     }

     @Override
     public String toString()
     {
         return String.format("%sBase Salary : %.2f", super.toString(), getBaseSalary() );
     }
 }
