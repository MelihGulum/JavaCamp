package entities;

public class CompanyCustomer extends Customer{
    private String taxnumber;

    public String getTaxnumber() {
        return taxnumber;
    }

    public void setTaxnumber(String taxnumber) {
        this.taxnumber = taxnumber;
    }
}