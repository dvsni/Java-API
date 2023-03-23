public class Notebrand {
    private String brand;
    private String country;

    public Notebrand(String brand, String country){
        this.brand = brand;
        this.country = country;
        }

    public String getBrand() {return brand;}
    public String getCountry() {return country;}

    @Override
    public String toString() {
        return brand + ", Страна производства: " + country;
    }
}