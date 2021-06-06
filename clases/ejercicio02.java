import java.util.Scanner;

public class ejercicio02 {

static Scanner teclado=new Scanner(System.in);
//Tipos de Datos, Operadores, y Estructura Secuencial
   
    static void suma(){
    //Dado dos números enteros, hallar la suma, resta, multiplicación, división y residuo.    
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
 
    static void notas(){
    //Ingresa por teclado 4 notas e imprima el promedio
        double nota1, nota2, nota3, nota4, promedio;
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

    static void potencia(){
    //Hallar la potencia de a^ donde a y n son números enteros positivos
        double resp; 
        int a,n;
        System.out.println("Ingrese un valor");
        a=teclado.nextInt();
        System.out.println("Ingrese el valor para potenciar");
        n=teclado.nextInt();

        resp=Math.pow(a, n);
        System.out.println("la respuesta es: "+resp);
    }

    static void tiempo(){
    //Convertir una cantidad de segundos en horas y minutos
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
    //Dado el valor de un articulo, hallar el igv(18%) y el precio total a pagar
        double precioArticulo;
        double IGV=0.18;
        double total;
        System.out.println("Ingrese el precio del articulo: ");
        precioArticulo =teclado.nextDouble();

    

        total=precioArticulo+IGV;
        System.out.println("El IGV es: "+total);
    }

    static void enteros(){
    //Dado dos números enteros diferentes, devolver el número mayor.
        int num1, num2;

        System.out.println("Ingrese el primer valor:");
        num1=teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        num2=teclado.nextInt();
        if (num1>num2) {
            System.out.println("El numero mayor es: "+num1);
            
        } else {
            System.out.println("El numero mayo es: "+num2);
        }

    }

    static void determinar(){
    //Determinar si un número es positivo, negativo, neutro
        System.out.println("Ingrese el valor: ");
        int num1=teclado.nextInt();
        if (num1<0) {
            System.out.println("El numero negativo es: "+num1);
        } 
        if (num1>0) {
            System.out.println("El numero positivo es: "+num1);
        }
        if (num1==0) {
            System.out.println("El numero neutro es:"+num1);
        }
    }

    static void caracter(){
    //Ingresar un carácter con el sexo (M o F) de una persona, si es M, que sea tu AMIGO, y si es F tu AMIGUIS
    char sexo=' ';
    System.out.println("Ingrese el caracter M masculino F femenino: ");
    sexo=teclado.next().charAt(0);
        if (sexo=='M') {
            System.out.println("Amigo");
        }
        if (sexo=='F') {
            System.out.println("Amiguis");
        }
    }

    static void numero(){
    //Determinar si un número es par o impar
        int num1;

        System.out.println("Ingrese el valor: ");
        num1=teclado.nextInt();

        if (num1%2==0) {
            System.out.println("El numero par es: "+num1);
        }
        else{
            System.out.println("el numero impar es: "+num1);
        }

    }

    static void edad(){
    //Elabora un programa donde puedas saber si la edad de una persona te conviene para salir.

        int num1;
        System.out.println("Ingrese la edad: ");
        num1=teclado.nextInt();

        if (num1>=19) {
            System.out.println("Te conviene salir :"+num1);
        } else {
            System.out.println("No te conviene salir :"+num1);
        }


    }

    static void entero(){
    //Dado un número entero, devolver el doble si el número no es par, caso contrario el triple
        int num1, resultado;
        System.out.println("Digite un numero");
        num1=teclado.nextInt();
        if (num1%2==0) {
            resultado=num1*3;
            System.out.println("Es par, x3 es "+resultado);
        } else {
            resultado=num1*2;
            System.out.println("Es impar, x2 es "+resultado);
        }

    }

    static void restaurant(){
    //Un restaurante ofrece un descuento del 10% para consumos hasta S/. 100.00 y un descuento de 20% para consumos mayores; para ambos casos se aplica un impuesto del 19%. Determinar el monto de descuento, el impuesto y el total a pagar
        double costo, impuesto, descuento, total;
        System.out.println("Ingrese el costo del consumo: ");
        costo=teclado.nextDouble();

        if (costo<100) {
            descuento=costo*0.1;
        }
        else {
            descuento=costo*0.2;}

            impuesto=(costo-descuento)*0.19;
            total=(costo-descuento)+impuesto;
            System.out.println("El descuento es: "+descuento);
            System.out.println("El impuesto es: "+impuesto);
            System.out.println("El total a pagar es: "+total);
    }

//Estructura condicional multiple

    static void clima(){
        int estaciones;
        System.out.println("Ingrese un numero");
        estaciones=teclado.nextInt();

        switch (estaciones) {
            case 1:
                System.out.println("Verano");
                break;
            case 2:
                System.out.println("Otoño");
                break;
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
                System.out.println("Primavera");
            default:
                System.out.println("Numero no valido");
            break;
        }
    }

    static void dias(){
    //Dado un número entero de 1 al 7, devolver el día de la semana, sabiendo que el 1 es domingo.
        int semana;
        System.out.println("Ingrese un numero");
        semana=teclado.nextInt();
        switch (semana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                break;
        }
        
    }

    static void numeros(){
    /*Dado dos números enteros y un operador +,-,* y /,
    devolver la operación de los dos números según el operador ingresado, 
    considere que si el segundo número es cero y el operador es /,
    devolverá 0.

        int resp, num1, num2;
        char operador=' ';
        resp=num1+num2;
        resp=num1-num2;
        resp=num1*num2;
        resp=num1/num2;
        switch (operador) {
            case '+':
            System.out.println("ingrese el valor");
            num1=teclado.nextInt();
            System.out.println("ingrese el segundo valor");
            num2=teclado.nextInt();
            System.out.println("la suma es: "+resp);
                break;
            case '-':
            System.out.println("La resta es: "+resp);
                break;
            case '*':
            System.out.println("la multiplicacion es: "+resp);
                break;
            case '/':
            System.out.println("la division es: "+resp);
            break;
            default:
                break;
        }*/



    }

    static void sexo(){
        char genero=' ';
        int edad=0;
        double estatura=0;
        System.out.println("Ingrese su sexo M o F");
        genero=teclado.next().charAt(0);
        System.out.println("ingrese la edad");
        edad=teclado.nextInt();
        System.out.println("Ingrese la estatura");
        estatura=teclado.nextDouble();

        if (genero=='F') {
            System.out.println("Ingrese su edad");
            edad=teclado.nextInt();
            if (edad>=19 && edad<=20) {
                System.out.println("El cumple con la edad");
                System.out.println("Ingrese la estatura");
                estatura=teclado.nextDouble();
            } else {
                
            }
            }
    }

    static void admicion(){
        char colegio, nivelsocial;
        double monto=0;
        System.out.println("Ingrese N si es nacional y P si es particular");
        colegio=teclado.next().charAt(0);
        System.out.println("Ingrese nivel social A B C ");
        nivelsocial=teclado.next().charAt(0);
        switch (colegio) {
            case 'N':
                switch (nivelsocial) {
                    case 'A':
                        monto=300;
                        break;
                    case 'B':
                        monto=200;
                        break;
                    case 'C':
                        monto=100;
                        break;
                }break;

            case 'P':
                switch (nivelsocial) {
                case 'A':
                    monto=300;
                    break;
                case 'B':
                    monto=200;
                    break;
                case 'C':
                    monto=100;
                    break;
                }
                break;
            default:System.out.println("no existe");
                break;
        }
        System.out.println("El examen le costara: "+monto);
    }
public static void main(String[] args) {
    admicion();

}
   
}
