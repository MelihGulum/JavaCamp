package entities;

public class Customer {

    public Customer(){
        System.out.println("customer instance has been created!!");
    }
    private int id;
    private String first_name;

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational_id() {
        return National_id;
    }

    public void setNational_id(String national_id) {
        National_id = national_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String last_name;
    private int age;
    private String National_id;

}