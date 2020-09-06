package co.com.training.techandsolve.models;

public class NewAddress {

    private String nameAddress;
    private String lastnameAddress;
    private String address;
    private String city;
    private String postalCode;
    private String mobilePhone;

    public NewAddress(String nameAddress, String lastnameAddress,
                      String address, String city, String postalCode, String mobilePhone) {
        this.nameAddress = nameAddress;
        this.lastnameAddress = lastnameAddress;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.mobilePhone = mobilePhone;
    }

    public String getNameAddress() {
        return nameAddress;
    }

    public String getLastnameAddress() {
        return lastnameAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

}
