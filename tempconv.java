class temperatureconversion {
    
    void converttemperature(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
 
    void converttemperature(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0/9;
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }

   
    void converttemperature(double kelvin, boolean isKelvin) {
        if (isKelvin) {
            double celsius = kelvin - 273.15;
            System.out.println(kelvin + "K = " + celsius + "°C");
        }
    }
}

public class tempconv {
    public static void main(String[] args) {
        temperatureconversion tc = new temperatureconversion();
        tc.converttemperature(25.0);          
        tc.converttemperature(77);            
        tc.converttemperature(300.0, true);    
    }
}