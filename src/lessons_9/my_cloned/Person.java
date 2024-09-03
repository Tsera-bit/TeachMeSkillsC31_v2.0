package lessons_9.my_cloned;
// без интерфейса Cloneable не возможно использовать метод clone()
public class Person implements Cloneable {
    private String id;
    private Address myAddress;

    Person(String id, Address myAddress) {
        this.id = id;
        this.myAddress = myAddress;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setCityAddress(String city) {
        this.myAddress.setCity(city);
    }

    public String getId() {
        return id;
    }
    public String getCityAddress() {
        return myAddress.getCity();
    }

    // делаем Deep copy, сначала клонируем переменные, второй строкой создаём новый объект класса Address
    // для каждого класса для deep copy необходимо по своему переделывать метод clone()
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.myAddress = (Address) myAddress.clone();
        return cloned;
    }
}
