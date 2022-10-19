package business;

import entities.Customer;

public class CustomerManager extends BaseCreditManager{

    private Customer _customer;
    private ICreditManager _ıcreditmanager;
    public CustomerManager(Customer customer,ICreditManager icreditManager){
        _ıcreditmanager=icreditManager;
        _customer=customer;
    }
    public void CustomerSave(){
        System.out.println("Customer Saved!!"+_customer.getFirst_name());
    }
    public void AlltypeofCustomer(){
        _ıcreditmanager.Calculate();
    }
    public void CustomSave(){_ıcreditmanager.Save();}
    @Override
    public void Calculate() {

    }
}