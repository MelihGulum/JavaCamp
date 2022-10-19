import business.*;
import entities.CompanyCustomer;
import entities.Customer;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager=new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        //creating instance
        Customer customer=new Customer();
        customer.setId(1);
        customer.setFirst_name("Michael");
        customer.setLast_name("SCOTT");
        customer.setNational_id("12345678");
        customer.setAge(37);

        CompanyCustomer companyCustomer=new CompanyCustomer();
        companyCustomer.setFirst_name("Dunder Mifflin");

        CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());

        customerManager.AlltypeofCustomer();
        customerManager.CustomSave();



    }
}

