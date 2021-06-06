import java.util.Scanner;


public class tarea {
static Scanner teclado=new Scanner(System.in);

    static void notas(){
    //Ingrese 3 notas, y si su promedio es mayor a 13 el sistema le dirá que está aprobado, caso contrario esta desaprobado.
        double num1, num2, num3;
        double promedio;
        System.out.println("Digite la nota 1");
        num1=teclado.nextDouble();
        System.out.println("Digite la nota 2");
        num2=teclado.nextDouble();
        System.out.println("Digite la nota 3");
        num3=teclado.nextDouble();


        promedio=num1+num2+num3;
        promedio=promedio/3;
        System.out.println("El promedio es: "+promedio);


    }

    static void dato(){
    //Dato 3 números devolver el número mayor.
    int num1, num2, num3;

    System.out.println("Digite el primer valor");
    num1=teclado.nextInt();
    System.out.println("Digite el segundo valor");
    num2=teclado.nextInt();
    System.out.println("Digite el tercer valor");
    num3=teclado.nextInt();

    if (num1>num2) {
        System.out.println("El numero mayor es: "+num1);        
    }
    if (num2>num3) {
        System.out.println("El numero mayor es: "+num2);        
    }
    if (num3>num1) {
        System.out.println("El numero mayor es: "+num3);
        
    }

    }

    static void becas(){
/*Para alumnos mayores de 18 con promedio mayor o igual a 18, la beca será de S/.2000;
con un promedio menor de 18 y mayor o igual a 16, de S/.1000; para los menores de 16 pero mayores o igual a 13 de S/.500.
A los demás les enviara una carta que diga "Estudia más".A los alumnos de 18 años o menores de esta edad,con promedios mayores o iguales a 18, se les dará S/.3000;
con promedios menores a 18 pero mayores o iguales a 16, se les dará S/.2000; para los alumnos con promedios menores a 16 pero mayores o iguales a 13, se les dará S/.100,
y a los que tengan menor que 13, se les dará una carta que diga "estudia más"
*/
    int num1, num2, num3, promedio, anos=0;
    System.out.println("Ingrese la edad");
    anos=teclado.nextInt();
    System.out.println("Ingrese la primera nota");
    num1=teclado.nextInt();
    System.out.println("Ingrese la segunda nota");
    num2=teclado.nextInt();
    System.out.println("Ingrese la tercera nota");
    num3=teclado.nextInt();

    promedio=num1+num2+num3;
    promedio=promedio/3;
    System.out.println("su promedios es: "+promedio);

        if ((anos>18) && (promedio>=18)) {
            System.out.println("Recibira una beca de S/.2000");}

                else if ((promedio<18) && (promedio>=16)) {
                System.out.println("Recibira una beca de S/.1000");}

                    else if ((anos<16)||(anos>=13)){
                        System.out.println("Recibira una beca de S/.500");}
                        
                        else if ((anos<18) && (promedio<=18)){
                            System.out.println("recibira una beca de S/.3000");}

                                else if((promedio<18)&&(promedio>=16)){
                                    System.out.println("Recibira una beca de S/.2000");}

                                        else if((promedio<16)||(promedio>=13)){
                                            System.out.println("Recibira una beca de S/.100");}

                                                else if(promedio<13) {
                                                    System.out.println("Estudia mas");}
}

    static void longitudes(){
/*Dado 3 longitudes, si forman un triángulo devolver el tipo de triangulo según sus lados.
T. Equilátero: sus 3 lados son iguales
T. Isósceles: 2 lados iguales
T. Escaleno: 3 lados diferente*/

        int a, b, c;
        System.out.println("Ingrese el 1er Dato");
        a=teclado.nextInt();
        System.out.println("Ingrese el 2do Dato");
        b=teclado.nextInt();
        System.out.println("Ingrese el 3er Dato");
        c=teclado.nextInt();

        if (a<(b+c)) {
            System.out.println("Es un triangulo");
        }
            else if(b<(a+c))
            System.out.println("Es un triangulo");
    }

    static void meses(){
//Dado un numero de un mes, que imprima el nombre del mes
        int mes;
        System.out.println("Digite un valor");
        mes=teclado.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Aguosto");
                break;
            case 9:
                System.out.println("Setiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:System.out.println("valor inexistente");
                break;
        }

    }

    static void dados(){
/*Diseñe un programa que califique el puntaje obtenido en el 
lanzamiento de tres dados en base ala cantidad de seis obtenidos,
de acuerdo a lo siguiente
tres 6= oro
dos 6 = plata
un 6 = bronce
ningun 6 = perdio*/

        int dado1=0, dado2=0, dado3=0;
        System.out.println("Lanza el primer dado");
        dado1=teclado.nextInt();
        System.out.println("Lanza el segundo dado");
        dado2=teclado.nextInt();
        System.out.println("lanza el tercer dado");
        dado3=teclado.nextInt();
        if ((dado1 + dado2 + dado3)==18){
            System.out.println("Oro");}
        else if((dado1+dado2)==12||(dado1+ dado3)==12||(dado2 + dado3)==12){
            System.out.println("Plata");}
            else if((dado1==6)||(dado2==6)||(dado3==6)){
                System.out.println("Bronce");
            }
            else{
                System.out.println("Perdio");
            }
        }
    static void politica(){
/*En una empresa se ha determinado la siguiente pilitica de descuento,
solo si el sueldo es mayor a 2000 soles, caso contrario el contrato no
aplicara la politica de descuento*/

    int sueldo1,sexo;
    double result;
    
        System.out.println("Egila una opcion");
        System.out.println("1. masculino");
        System.out.println("2. femenina");
        sexo=teclado.nextInt();
        switch (sexo) {
            case 1:
             System.out.println("Digite su sueldo");
                sueldo1=teclado.nextInt();
                    if (sueldo1>2000) {
                    result=0.15*sueldo1;
                    result=sueldo1/100;
                    System.out.println("El descuento que recibe por Obrero es: "+result);
                    } 
                    if (sueldo1>2000) {
                    result=0.20*sueldo1;
                    result=sueldo1/100;
                    System.out.println("El descuento que recibe por Empleado es: "+result);}
                    else {
                        result=sueldo1;
                       System.out.println("Su sueldo por Empleado y Obrero es: "+result);
                    }
                    break;
            case 2:
            System.out.println("Digite su sueldo");
                sueldo1=teclado.nextInt();
                    if (sueldo1>2000) {
                    result=0.15*sueldo1;
                    result=sueldo1/100;
                    System.out.println("El descuento que recibe por Obrero es: "+result);
                    }
                    else if (sueldo1>2000) {
                    result=0.20*sueldo1;
                    result=sueldo1/100;
                    System.out.println("El descuento que recibe por Empleado es: "+result);
                    } else {
                        result=sueldo1;
                        System.out.println("Su sueldo por Empleado y Obrero es: "+result);}
            
                break;
        }
    }
    public static void main(String[] args) {
        dados();
    }
}
