package tasck;

public class Address {
    private String street; //Поле может быть null
    private String zipCode; //Длина строки должна быть не меньше 10, Поле может быть null

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }
}