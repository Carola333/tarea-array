import java.util.Scanner;

public class App {
        
         //Michelle Carolina Montalban Perez - 2024-1382U grupo:1M1-S

    public static int var = 0;
    public static Scanner leer = new Scanner(System.in);
    public static boolean continuar = true;

    public static void main(String[] args) throws Exception {
       
        boolean salida = true;

        do {
            
            try {
                
                System.out.println("ingrese el tamaño del arreglo que no sea mayor de 16 y sea menor a 2");

                var = leer.nextInt();

                salida = (var >= 2 && var <= 16)? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("ocurrio algo revisar");
                leer.nextLine();
            }
        } while (salida);

        int array[] = llenado();

        System.out.println("orden de los valores ingresados");

        mostrar(array);
        System.out.println("de manera inversa");
        inverso(array); 
  
}

      public static int[] llenado() {

        int[] arreglo = new int[var];

        do {
            try {

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("ingrese los valores numericos ["+i+"]");

                    arreglo[i] = leer.nextInt();

                }
                continuar=false;
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
                System.out.println("solo ingrese numeros enteros");
                leer.nextLine();
            }
        } while (continuar);
          return arreglo;
            
        }

    public static void mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }
           

        }

        public static void inverso(int[]inv){

            System.out.print("{");
            for (int i = inv.length-1; i>=0; i--) {
                System.out.print(inv[i]+",");
                
            }
            System.out.println("}");
    }

        
            
        

  
    }

