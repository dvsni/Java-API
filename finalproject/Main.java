package finalproject;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Devicebrand brandApple = new Devicebrand("Apple", "USA");
        Devicelist Apple_MacBook_Pro = new Devicelist("Apple_MacBook_Pro", "16.2", "3456x2234", 
        "Apple", 1024, "16", "macOS", "Gray");
        Apple_MacBook_Pro.addBrand(brandApple);
        Devicelist Apple_MacBook_Air = new Devicelist("Apple_MacBook_Air", "13.6", "2560x1664", 
        "Apple", 256, "8", "macOS", "Gold");
        Apple_MacBook_Air.addBrand(brandApple);
        Devicebrand brandMSI = new Devicebrand("MSI", "Taiwan");
        Devicelist MSI_CreatorPro_x17 = new Devicelist("MSI_CreatorPro_x17", "17.3", "3840x2160", 
        "Intel", 2000, "64", "Windows", "Black");
        MSI_CreatorPro_x17.addBrand(brandMSI); 
        Devicelist MSI_GT77_Titan = new Devicelist("MSI_GT77_Titan", "17.3", "3840x2160", 
        "Intel", 2000, "32", "Windows", "Black");
        MSI_GT77_Titan.addBrand(brandMSI);
        Devicebrand brandASUS = new Devicebrand("ASUS", "Taiwan");
        Devicelist ASUS_TUF_Gaming_F17 = new Devicelist("ASUS_TUF_Gaming_F17", "17.3", "1920x1080", 
        "Intel", 512, "16", "Windows", "Black");
        ASUS_TUF_Gaming_F17.addBrand(brandASUS);
        Devicelist ASUS_VivoBook_PRO_16X = new Devicelist("ASUS_VivoBook_PRO_16X", "16", "3840x2400", 
        "AMD", 512, "8", "Windows", "Black");
        ASUS_VivoBook_PRO_16X.addBrand(brandASUS);
        Devicebrand brandLenovo = new Devicebrand("Lenovo", "Taiwan");
        Devicelist Lenovo_ThinkPad_T16 = new Devicelist("Lenovo_ThinkPad_T16", "16", "1920x1200", 
        "Intel", 512, "16", "Windows", "Black");
        Lenovo_ThinkPad_T16.addBrand(brandLenovo);
        Devicelist Lenovo_Legion_5_Pro = new Devicelist("Lenovo_Legion_5_Pro", "16", "2560x1600", 
        "AMD", 512, "16", "Linux", "Gray");
        Lenovo_Legion_5_Pro.addBrand(brandLenovo);
        Devicebrand brandAcer = new Devicebrand("Acer", "Taiwan");
        Devicelist Acer_Nitro_5 = new Devicelist("Acer_Nitro_5", "17.3", "1920x1080", 
        "Intel", 512, "16", "Windows", "Black");
        Acer_Nitro_5.addBrand(brandAcer);
        Devicelist Acer_Aspire_7 = new Devicelist("Acer_Aspire_7", "15.6", "1920x1080", 
        "AMD", 512, "8", "Linux", "Black");
        Acer_Aspire_7.addBrand(brandAcer);

        Set <Devicelist> devicelist = new HashSet<>();
        devicelist.add(MSI_CreatorPro_x17);      
        devicelist.add(MSI_GT77_Titan);
        devicelist.add(Apple_MacBook_Pro);
        devicelist.add(Apple_MacBook_Air);
        devicelist.add(ASUS_TUF_Gaming_F17);
        devicelist.add(ASUS_VivoBook_PRO_16X);
        devicelist.add(Lenovo_Legion_5_Pro);
        devicelist.add(Lenovo_ThinkPad_T16);
        devicelist.add(Acer_Nitro_5);
        devicelist.add(Acer_Aspire_7);

        Devicelist FilterLaptop = new Devicelist();
        System.out.println("По Вашему запросу найдены подходящие модели: " + FilterLaptop.filter(devicelist));
        System.out.println(FilterLaptop.newFilter(devicelist));
    }
}

