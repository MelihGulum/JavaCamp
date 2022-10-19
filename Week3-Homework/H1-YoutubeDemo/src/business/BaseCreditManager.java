package business;

abstract class BaseCreditManager implements ICreditManager {
	
    public abstract void Calculate();
    @Override
    public void Save() {
        System.out.println("Process saved");
    }
}