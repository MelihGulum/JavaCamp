package business;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void Save() {
        System.out.println("Teacher Credit saved");
    }

    @Override
    public void Calculate() {
        System.out.println("Teacher Credit saved");
    }
}