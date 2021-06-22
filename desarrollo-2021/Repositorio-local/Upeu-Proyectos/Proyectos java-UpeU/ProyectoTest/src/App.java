//import pe.edu.Upeu.Operaciones;
import pe.edu.Upeu.recur.SubProgramas;
import pe.edu.Upeu.util.Teclado;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("*********Operaciones Basicas**********");
        /*Operaciones objOB=new Operaciones();
        objOB.operacionesBasicas();*/
        Teclado tec=new Teclado();
        SubProgramas objSP=new SubProgramas();
        int numero =tec.leer(0, "Ingrese un numero");

        /*System.out.println("Factorial Interativo:"+objSP.factorialBig(numero));
        System.out.println("Factorial Recursivo:"+objSP.factorialRecurbig(numero));*/
               
        long ti=System.currentTimeMillis();
        System.out.println("Fibonacci iterativo:"+objSP.Fibonaci(numero));
        long tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti));
        
        /*ti=System.currentTimeMillis();
        System.out.println("Fibonacci recursivo:"+objSP.FibonacciRecur(numero));
        tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti)/60000);*/
        




    }


}
