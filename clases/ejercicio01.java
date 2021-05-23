//libreria,
import java.util.Scanner;



public class ejercicio01 { 
    //Dado dos números enteros, hallar la suma, resta, multiplicación, división y residuo.
   static Scanner teclado=new Scanner(System.in);
 static void suma(){
    int num1=10;
    int num2=200;
    int suma, resta, multi, divi, resi;
    double potencia;

    suma=num1+num2;
    resta=num1-num2;
    multi=num1*num2;
    divi=num1/num2;
    resi=num1%num2;
    potencia=Math.pow((double)num1,(double)num2);
    System.out.println("Suma es: "+suma);
    System.out.println("resta es: "+resta);
    System.out.println("multiplicacion es: "+multi);
    System.out.println("division es: "+divi);
    System.out.println("residuo es: "+resi);
    System.out.println("potencia es: "+potencia);
    }
 
 static void ejercicio02(){
    double nota1, nota2, nota3, nota4, promedio;
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese nota 1: ");
    nota1 = teclado.nextDouble();
    System.out.print("Ingrese nota 2: ");
    nota2 = teclado.nextDouble();
    System.out.print("Ingrese nota 3: ");
    nota3 = teclado.nextDouble();
    System.out.print("Ingrese nota 4: ");
    nota4 = teclado.nextDouble();
    promedio=(nota1+nota2+nota3+nota4)/4;

    System.out.println("el promedio es: "+promedio);



}

static void ejercicio03(){

    int segundos;
    int horas;
    int minutos;

    System.out.println("Ingrese los segundos: ");
    segundos =teclado.nextInt();
    
    horas =segundos/3600;
    minutos =segundos/60;
    System.out.println("Tiene :"+horas+"horas");
    System.out.println("Tiene :"+minutos+"minutos");
}

static void igv(){
    double precioArticulo;
    double IGV=0.18;
    double total;
    System.out.println("Ingrese el precio del articulo: ");
    precioArticulo =teclado.nextDouble();

    

    total=precioArticulo+IGV;
    System.out.println("El IGV es: "+total);
    
}

public static void main(String[] args) {
    igv();
}
}

