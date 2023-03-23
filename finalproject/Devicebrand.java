package finalproject;

public class Devicebrand {
    private String devicebrand;
    private String country;

    public Devicebrand(String devicebrand, String country){
        this.devicebrand = devicebrand;
        this.country = country;
        }

    public String getBrand() {return devicebrand;}
    public String getCountry() {return country;}

    @Override
    public String toString() {
        return devicebrand + ", Страна производителя ноутбука: " + country;
    }
}