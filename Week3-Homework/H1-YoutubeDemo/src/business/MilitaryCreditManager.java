package business;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void Save() {
       System.out.println("Military credit saved");
    }

    @Override
    public void Calculate() {
        System.out.println("Military credit saved");
    }
}