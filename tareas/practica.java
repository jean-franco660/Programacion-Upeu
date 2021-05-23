import java.sql.Time;
import java.util.Scanner;



public class practica {
static Scanner teclado=new Scanner(System.in);

    static void saldo(){
/* Un profesor tiene un salario inicial de $1500, y recibe un 
incremento de 10% anual durante 6 años.¿Cuál es su salario 
al cabo de 6 años? Realice el algoritmo y represente la solución 
mediante el diagrama de flujo, el pseudocódigo
y el diagrama N/S, utilizando el ciclo apropiado */

    int tiempo, anos=6;
    double Capital=1.500;
    double respuesta1, tim1, tim2, tim3, tim4, tim5 ;
    double incremento=0.10;

    if (anos==6){
    tim1=incremento*Capital/100;
    tim1=tim1+Capital;
    tim1=tim1*12;
    System.out.println("El salario de 1 año es: "+tim1);
    }
    if (anos==6) {

    tim2=incremento*Capital/100;
    tim2=tim2+Capital;
    tim2=tim2*24;
    System.out.println("El salario de 2 años es: "+tim2);
    } 
    
    if (anos==6){
    tim3=incremento*Capital/100;
    tim3=tim3+Capital;
    tim3=tim3*36;
    System.out.println("El salario de 3 años es: "+tim3);   
    }

    if (anos==6) {
    tim4=incremento*Capital/100;
    tim4=tim4+Capital;
    tim4=tim4*48;
    System.out.println("el salario de 4 años es: "+tim4);
    }

    if (anos==6) {
    tim5=incremento*Capital/100;
    tim5=tim5+1500;
    tim5=tim5*60;
    System.out.println("el salario de 5 años es: "+tim5);
    }

    if(anos==6){
    respuesta1=incremento*Capital/100;
    respuesta1=respuesta1+1500;
    respuesta1=respuesta1*72;
    System.out.println("el salario de 6 años es: "+respuesta1);}
    }
    
    static void banco(){
/*Un cliente de un banco deposita X cantidad de pesos cada mes en una cuenta de ahorros.
La cuenta percibe un interés fijo durante un año de 10% anual.
Realice un algoritmo para determinar el total de la inversión final de cada año en los próximos N años.
Represente la solución mediante el diagrama de flujo, el pseudocódigo y diagrama N/S*/

int cantidad, inter=10;
int anos=0;
double resp;

System.out.println("Ingrese la cantidad: ");
cantidad=teclado.nextInt();

System.out.println("Ingrese el año: ");
anos=teclado.nextInt();

resp=inter*cantidad/100;
resp=resp+cantidad;
resp=resp*anos;
System.out.println("El total de la inversion es: "+resp);


}

    static void pagos(){
    /*El banco “Bandido de peluche” desea calcular para cada uno de sus N clientes su saldo actual,
    su pago mínimo y su pago para no generar intereses. Además, quiere calcular el monto de lo que gano por concepto intereses
    con los clientes morosos. Los datos que se conocen de cada cliente son: saldo anterior, monto de las compras que realizó y pago 
    que deposito en el corte anterior. Para calcular el pago mínimo se considera 15% del saldo actual, y el pago para no generar interese
    corresponde a 85% del saldo actual, considerando que el saldo actual debe incluir 12% de los intereses causados por no realizar 
    el pago mínimo y $2000 de multa por el mismo motivo. Realice el algoritmo correspondiente y represéntelo mediante diagrama de flujo y pseudocódigo*/


    double saldo;
    int interes=15, interes2=85, interes3=12;
    double PagoMin, NogenerarIn, moroso;

    System.out.println("Ingrese el saldo del Cliente: ");
    saldo=teclado.nextDouble();

    PagoMin=interes*saldo/100;
    System.out.println("El pago minimo es: "+PagoMin);

    NogenerarIn=interes2*saldo/100;
    System.out.println("El pago para no generar interes es: "+NogenerarIn);

    moroso=interes3*saldo/100+2000;
    System.out.println("El pago minimo mas multa es: "+moroso);
}

    static void multiplicar(){

/*Realice un algoritmo para obtener la tabla de multiplicar
de un entero K comenzando desde el 1. Represéntelo mediante
diagrama de flujo, pseudocódigo y diagrama N/S*/

        int K;
        System.out.print("Introduce un número: ");                                                         
        K =teclado.nextInt();
        System.out.println("Tabla del " + K);
        for(int i = 1; i<=10; i++){
        System.out.println(K + " * " + i + " = " + K*i);}                                                    
    }

    static void articulos(){
    /* Realice el algoritmo para determinar cuánto pagara una persona que adquiere N artículos, 
    los cuales están de promoción. Considere que si su precio es mayor o igual a $200 se le aplica el descuento de 15%, y 
    si su precio es mayor a $100 pero menor a $200, el descuento es de 12%, de lo contrario
    sólo se le aplica 10% se debe saber cuál es el costo y el descuento que tendrá cada uno de los artículos y 
    finalmente cuanto se pagara por todos los artículos obtenidos, Represente la solución mediante el diagrama de flujo, 
    seudocódigo y el diagrama N/S */


    int Variables;
    double resp1, resp2, resp3, descuento1=0.15, descuento2=0.12, descuento3=0.10;
    System.out.println("Digite su precio: ");    
    Variables=teclado.nextInt();
            
    if (Variables>=200) {
        resp1=Variables*descuento1;
        System.out.println("El descuento es: "+resp1);     
        }
    
    else if ((Variables>100)||(Variables<200)) {
        resp2=Variables*descuento2;
        System.out.println("El descuento es: "+resp2);
        } 
        else{
            resp3=Variables*descuento3;
            System.out.println("El descuento es: "+resp3);           
        }
    }
    
    static void sueldo(){

    /*
    Realice un algoritmo que determine el sueldo semanal de N trabajadores considerando que se les descuenta 5% de su sueldo si ganan entre 0 y 150 pesos.
    Se les descuenta 7% si ganan más de 150 pero menos de 300, y 9% si ganan más de 300 pero menos de 450.
    Los datos son horas trabajadas, sueldo por hora y nombre de cada trabajador. Represéntelo mediante diagrama de flujo, seudocódigo y diagrama
    */

    double SueldoHora;
    double SueldoSemana, descuento1=0.05, descuento2=0.07, descuento3=0.09;

    System.out.println("Digite su sueldo: ");    
    SueldoSemana=teclado.nextDouble();

    System.out.println("digite su sueldo por hora: ");
    SueldoHora=teclado.nextInt();
    

    if (SueldoSemana>=150) {
        SueldoHora=SueldoSemana*descuento1;

        System.out.println("El sueldo total es: "+SueldoHora);  
        }
    
    else if ((SueldoSemana<150)||(SueldoSemana>300)) {
        SueldoHora=SueldoSemana*descuento2;
        System.out.println("El descuento es: "+SueldoHora);     
        } 
    else if ((SueldoSemana<300)&&(SueldoSemana>450)){
        SueldoHora=SueldoSemana*descuento3;
        System.out.println("El descuento es: "+SueldoHora);     
    }
    
}

    static void autos(){
    /*El gerente de una compañía automotriz desea determinar el impuesto que va a pagar por cada categoría y 
    por todos los vehículos, basándose en la siguiente clasificación:
    Los vehículos con clave 1 pagan 10% de su valor
    Los vehículos con clave 2 pagan 7% de su valor
    Los vehículos con clave 3 pagan 5% de su valor
    Realice un algoritmo para obtener la información y represéntelo mediante diagrama de flujo, 
    pseudocódigo y diagrama de N/S. los datos son la clave y costo de cada uno.
    */
        int clave;
        double total, respuesta1, respuesta2, respuesta3 , descuento=0.10, descuento2=0.07, descuento3=0.05;

        System.out.println("Digite el precio: ");
        clave=teclado.nextInt();

        respuesta1=descuento*clave;
        System.out.println("el impuesto a pagar del veiculo clave 1 es: "+respuesta1);
        respuesta2=descuento2*clave;
        System.out.println("el impuesto a pagar del veiculo clave 2 es: "+respuesta2);
        respuesta3=descuento3*clave;
        System.out.println("el impuesto a pagar del veiculo clave 3 es: "+respuesta3);

        total=respuesta1+respuesta2+respuesta3;
        System.out.println("el total de impuesto a pagar es: "+total);

    }

    static void comida(){
 /*"El náufrago satisfecho" ofrece hamburguesas sencillas (S), dobles (D) y triple (T)
    las cuales tiene un costo de $20, $25 y $28 respectivamente. La empresa acepta tarjeta de crédito con un cargo de 5 % sobre la compra.
    Suponiendo que los clientes adquieren N hamburguesas, las cuales pueden ser de diferente tipo, realice un algoritmo para determinar 
    cuánto deben pagar. Represéntelo en diagrama de flujo, pseudocódigo y diagrama N/S.*/

        int op;
        int S=20, D=25, T=28, cantidad=0;
        double cargo=0.05;
        double resp, total;  

        resp=cargo*S+S;
        resp=cargo*D+D;
        resp=cargo*T+T;

        System.out.println("\nEliga una opcion: ");
        System.out.println("\n1. hamburgesa Sencilla \n");
        System.out.println("\n2. hamburgesa Dobles \n");
        System.out.println("\n3. hamburgesa Triples \n");
        op=teclado.nextInt();

        switch (op) {
            case 1:
            System.out.println("\nDigite la cantidad: \n");
            cantidad=teclado.nextInt();
            total=resp*cantidad;

            System.out.println("\nEl pago a total a pagar es: "+total);
            break;

            case 2:
            System.out.println("\nDigite la cantidad: \n");
            cantidad=teclado.nextInt();
            total=resp*cantidad;

            System.out.println("\nEl pago a total a pagar es: "+total);
            break;

            case 3:
            System.out.println("\nDigite la cantidad: \n");
            cantidad=teclado.nextInt();
            total=resp*cantidad;

            System.out.println("\nEl pago a total a pagar es: "+total);
            break;
            default:
                break;
        }


    }

    static void contar(){
 /*Se requiere un algoritmo para determinar para determinar cuánto ahorrará en pesos una persona diariamente
   y en un año, si ahorra 3₡ el 1 de enero, 9₡ el 2 de enero, 27₡ el 3 de enero y así sucesivamente todo el año
   Represente la solución mediante el diagrama de flujo, el pseudocódigo y el diagrama de N/S, utilizando el ciclo apropiado*/
        double ahorro=0;
        
        for(int i=1; i<365; ++i){
            ahorro=Math.pow(3, i);
           System.out.println("El ahorro el del dia "+i+" es: "+ahorro); 
        }

    }
   

 
public static void main(String[] args) {
    
}


}
