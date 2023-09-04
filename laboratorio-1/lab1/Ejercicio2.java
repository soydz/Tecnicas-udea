// Ejercicio 2:
// a. Generar el promedio de los numeros listados a continuacion
//   40
//   50
//   60
//   24
//   66
//   12
//   98
// b. Para cada uno de los numeros indicar si esta por encima o debajo del promedio

class Ejercicio2 {
    public static void main(String[] args) {
        // a
        double suma = 40 + 50 + 60 + 24 + 66 + 12 + 98;
        int num = 7;
        
        double promedio = suma/num;
        System.out.println("El promedio es " + promedio);
        
        // b
        int a = 40;
        if(a > promedio){
            System.out.println("\n" + a + " Esta por encima del promedio");
        }else if(a < promedio){
            System.out.println("\n" + a + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + a + " Es igual al promedio");
        }
        
        int b = 50;
        if(b > promedio){
            System.out.println("\n" + b + " Esta por encima del promedio");
        }else if(b < promedio){
            System.out.println("\n" + b + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + b + " Es igual al promedio");
        }

        
        int c = 60;
        if(c > promedio){
            System.out.println("\n" + c + " Esta por encima del promedio");
        }else if(c < promedio){
            System.out.println("\n" + c + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + c + " Es igual al promedio");
        }

        
        int d = 24;
        if(d > promedio){
            System.out.println("\n" + d + " Esta por encima del promedio");
        }else if(d < promedio){
            System.out.println("\n" + d + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + d + " Es igual al promedio");
        }

        
        int e = 66;
        if(e > promedio){
            System.out.println("\n" + e + " Esta por encima del promedio");
        }else if(e < promedio){
            System.out.println("\n" + e + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + e + " Es igual al promedio");
        }

        
        int f = 12;
        if(f > promedio){
            System.out.println("\n" + f + " Esta por encima del promedio");
        }else if(f < promedio){
            System.out.println("\n" + f + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + f + " Es igual al promedio");
        }

        
        int g = 98;
        if(g > promedio){
            System.out.println("\n" + g + " Esta por encima del promedio");
        }else if(g < promedio){
            System.out.println("\n" + g + " Esta por debajo del promedio");
        }else {
            System.out.println("\n" + g + " Es igual al promedio");
        }


    }
}
