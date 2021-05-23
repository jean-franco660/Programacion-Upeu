import java.util.Scanner;

public class ejerciciosCiclicos {
    
    static Scanner teclado=new Scanner(System.in);

    public static void identificarColorFoco() {
        //definir Variables
        int nfocos, fverde=0, fblanco=0, frojo=0;
        //Datos de entrada
        System.out.println("Ingrese N catidad de focos");
        nfocos =teclado.nextInt();
        //Proceso
        for (int foco = 1; foco < nfocos; foco++) {
            System.out.println("Ingrese el color del foco (V=verde, B=blanco y R=rojo)"+
            "del color # "+foco+":" );
            String color=teclado.next();
            if(color.toUpperCase().equals("V")){fverde++; }
            if(color.toUpperCase().equals("B")){fblanco=fblanco+1; }
            if(color.toUpperCase().equals("R")){frojo+=1; }
            System.out.println("");
        }
        //Datos de entrada
        System.out.println("Del total de focos: \n"+fverde+" son verde(s)\n"+
        fblanco+" son blanco(s)\n"+frojo+" son rojo(s)\nEn total son: "+nfocos);
    }

    public static void main(String[] args) {
        identificarColorFoco();
    }

}
