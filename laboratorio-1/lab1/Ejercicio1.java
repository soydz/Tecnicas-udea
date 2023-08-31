// Ejercicio 1:
// a. Convertir las siguientes temperaturas entre celsius (C) a fahrenheit (F):
//   0C a Fahrenheit
//   32F a Celsius
//   100F  a Celsius
//   100C  a Fahrenheit
//   25C  a Fahrenheit
//   -10C  a Fahrenheit
//   -40F  a Celsius
//

class Ejercicio1 {
    public static void main(String[] args) {
        // fc = (f-32)/1.8;
        // cf = (c*1.8)+32
        
        double f1 = (0*1.8)+32;
        System.out.println("0C son " + f1 + " F");
        
        double c1 = (32-32)/1.8;
        System.out.println("\n32F son " + c1 + " C");
        
        double c2 = (100-32)/1.8;
        System.out.println("\n100F son " + c2 + " C");
        
        double f2 = (100*1.8)+32;
        System.out.println("\n100C son " + f2 + " F");
        
        double f3 = (25*1.8)+32;
        System.out.println("\n25C son " + f3 + " F");
        
        double f4 = (-10*1.8)+32;
        System.out.println("\n-10C son " + f4 + " F");
        
        double c3 = (-40-32)/1.8;
        System.out.println("\n-40F son " + c3 + " C");
    }
}
