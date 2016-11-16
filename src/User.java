/**
 * Created by donalmaher on 16/11/2016.
 */
public class User {

    private String name;
    private int age;
    private String address;
    private Boolean Car_Full_licence;

    public User(String name, int age, String address, Boolean car_full_licence) {
        this.name = name;
        this.age = age;
        this.address = address;
        Car_Full_licence = car_full_licence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getCar_Full_licence() {
        return Car_Full_licence;
    }

    public void setCar_Full_licence(Boolean car_Full_licence) {
        Car_Full_licence = car_Full_licence;
    }
}
