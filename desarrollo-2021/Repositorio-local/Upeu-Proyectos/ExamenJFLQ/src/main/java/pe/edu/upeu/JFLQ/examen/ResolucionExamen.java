package pe.edu.upeu.JFLQ.examen;

import java.util.Scanner;

public class ResolucionExamen {
    static Scanner teclado=new Scanner(System.in);
   
    public static void categoria(){
/*El gerente de una compañia automotriz dese determinar el impuesto que va
a pagar por cada uno de los automoviles que posee, ademas del total que va
a pagar por cada categoria y por todos los vehiculos, basandose en la siguiente clasificacion
los vehiculos con categoria 1 pagan 12% de su valor.
los vehiculos con categoria 2 pagan 8% de su valor.
los vehiculos con categoria 3 pagan 5% de su valor.*/

double descuento1=0.12, descuento2=0.08, descuento3=0.05;
double Preciocateg,resp1=0, resp2=0, resp3=0,total=0;
int op=0;

        System.out.println("Eliga una opcion");
        System.out.println("opcion 1. Vehiculo de categoria 1");
        System.out.println("opcion 2. Vehiculo de categoria 2");
        System.out.println("Opcion 3. Vehiculo de categoria 3");
        System.out.println("Opcion 4. Precio total de todos los Vehiculos");
        op=teclado.nextInt();
    switch (op) {
        case 1:
            System.out.println("Ingrege el monto a pagar");
            Preciocateg=teclado.nextDouble(); 
            resp1=descuento1*Preciocateg;
            System.out.println("el impuesto a pagar de automovil de categoria 1 es:"+resp1);
            break;
        case 2:
            System.out.println("Ingrese el monto a pagar");
            Preciocateg=teclado.nextDouble(); 
            resp2=descuento2*Preciocateg;
            System.out.println("el impuesto a pagar de automovil de categoria 2 es:"+resp2);
            break;
        case 3:
            System.out.println("Ingrese el monto a pagar");
            Preciocateg=teclado.nextDouble(); 
            resp3=descuento3*Preciocateg;
            System.out.println("el impuesto a pagar de automovil de categoria 3 es:"+resp3);
            break;
        case 4:
            System.out.println("Ingrese el monto a pagar");
            total=teclado.nextDouble();
            total=descuento1*descuento2*descuento3;
            System.out.println("El impuesto a pagar por los 3 automoviles es: "+total);
          default:
            break;
    }
}

    public static void multiplicar() {
    //Realizar la Tabla de Multiplicación de 1 a 20

    int total;
      for (int i = 0; i <=20; i++) {
          for (int j = 0; j <=20; j++) {
              total=i*j;
              System.out.println(i+" x "+j+" = "+total);
          }System.out.println("");
      }

    }
    
    public static void numeros() {
    /*Considerando que un numero perfecto es un numero natural igual a la suma de sus
    divisores propios positivos Usando la sentencia while y condicionales if elabore un
    algoritmo que imprima los n primeros números perfectos*/

    int i, n, suma = 0;
    char car=' ';
    do { 
    System.out.println("Ingrese el número:");
    n = teclado.nextInt();
    for (i = 1; i < n; i++){
    if (n%i==0){
    suma = suma + i;
    }
    }
    if (suma == n)
    {
    System.out.println(n+" es un número perfecto");
    }
    else{
    System.out.println(n+" no es un número perfecto");
    }    
    }while (car == 's' || car == 'S');    
    }

    public static void recursivo(){
/*El valor 𝑥^𝑛 se puede definir recursivamente como
𝑥^0=1
𝑥^𝑛= 𝑥^𝑛−1
Escriba
un método recursivo que calcule y devuelva el valor de 𝑥^𝑛.*/

    int num1=1, num2=1,num3=0;
    int residuo=0;
    System.out.println("Ingresa un numero");
    num3=teclado.nextInt();
    while (num2<=num3) {
        residuo=0;
        num1=1;
    while (num1<=num2/2) {
            if (num2%num1 ==0) {
                residuo=residuo+num1;
            }
            num1++;
        }
        if(num2==residuo){
            System.out.println(num2+" Es Perfecto");
        }
        num2++;    
    }
 
}







public static void main(String[] args) {
    recursivo();
}







}
