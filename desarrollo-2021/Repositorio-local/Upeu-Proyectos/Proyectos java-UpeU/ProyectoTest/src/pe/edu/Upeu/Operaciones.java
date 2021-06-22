package pe.edu.Upeu;
import pe.edu.Upeu.util.Teclado;

public class Operaciones {
    
    //Scanner inputT=new Scanner(System.in); 
    Teclado inputT=new Teclado();
    public double suma(double num1, double num2) {        
        double resultado=0;
        resultado=num1+num2;
        return resultado;       
    }

    public double resta(double num1, double num2) {
        double resultado=0;
        resultado=num1-num2;

        return resultado;
    }

    public double division(double num1, double num2) {
        double resultado=0;
        resultado=num1/num2;

        return resultado;
        
    }

    public double potencia(double num1, double num2) {
        double resultado=Math.pow(num1, num2);

        return resultado;
        
    }

    public double multiplicacion(double num1, double num2) {
        double resultado=0;
        resultado=num1*num2;  

        return resultado;     
    }

    public boolean isNumber(String valor) {
        boolean resultado;
        try {
            Double.parseDouble(valor);
            resultado=true;
        } catch (NumberFormatException e) {
            resultado=false;
        }
        return resultado;
        
    }
    
    /*public double leer(double valor, String mensaje) {
        System.out.println(mensaje);
        String valorX=inputT.next();
        double result=0;
        if (!isNumber(valorX)){
            result=leer(valor, mensaje);
        }else{
            result= Double.parseDouble(valorX);
        }
        return result;
    }*/

    public void operacionesBasicas(){

        try {
            double num1=inputT.leer(0, "Ingrese el primer valor:");
            double num2=inputT.leer(0, "Ingrese el segundo valor:");
            String msg="Indique la operacion que desee realizar(suma=+,resta=-,"
            +"divicion=/, multiplicacion=*, potencia=^):";
            char operador=inputT.leer(' ', msg);
            double resultado=0;
            switch (operador) {
                case '+':resultado=suma(num1,num2);break; 
                case '-':resultado=resta(num1,num2);break; 
                case '/':resultado=division(num1,num2);break;
                case '^':resultado=potencia(num1,num2);break; 
                case '*':resultado=multiplicacion(num1,num2);break; 
                default: break;
            }
    System.out.println("El resultado de la operacion"+operador+"es:"+resultado);
        }catch (Exception e){ 
        System.out.println("Error en al ejecucion...intente nuevamente!");
        operacionesBasicas();
            }
    
    }

    
}