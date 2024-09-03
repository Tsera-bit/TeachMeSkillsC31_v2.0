package lessons_9.my_cloned;
// без интерфейса Cloneable не возможно использовать метод clone()
public class Address implements Cloneable {
    private String city;

    Address(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    // делаем Shallow copy, в deep copy нету необходимости.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
