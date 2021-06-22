package pe.edu.upeu.arreglos;

public class EjemploVectores {
    
    public static void ejemploVectores(){
        //define vector con variables
        int[] v1={1,2,3,4,5,6,7,8,9,10};
        System.out.println("v1=[7]="+v1[9]);//imprimiendo el valor 8 del indice 7
        
        //definiendo vector de tamaño 2 
        int[] v2=new int[2];
                v2[0]=1;//asignando valores en indice 0
                v2[1]=2;//asignando valores en indice 1

        //como saber de que tamaño es el vector
        System.out.println("Tamaño del vector v2="+v2.length);
        System.out.println("Tamaño del vector v1="+v1.length);
    }
    public static void sumaNumeros(int[] v1){
        int sumaV=0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i]%2==0) {
                sumaV=sumaV+v1[i];
            }
        }
        System.out.println("La suma de numeros pares es="+sumaV);
    }
    public static void alamcenarValoresEnVector() {
        int[] vx=new int[20];
        vx[0]=10;
        vx[1]=20;
        int valInicial=10;

        for (int i = 0; i < vx.length; i++) {
            vx[i]=valInicial;
            System.out.println("vx["+i+"]="+vx[i]);
            valInicial=valInicial+10;
            
        }
   
    }

    public static void VectoresOtorsTipos() {
        double[] vA={12.5},   vB={12.5,14.9}, vC={12.5,14.9,45};

        int[] vAi={12}, vBi={12, 14}, vC1={12,14,45};

        String[] vAs={"A"}, vBs={"A","B"}, vCs={"A","12.5","54"};

        char[] vAc={'*','/','-','A','S','B'};

        Object[] vAo={14,"hola",'*',45.3};
    }

    public static void multiplicacion() {
        int[] VA={1,2,3,4,5,6,7,8,9,10};
        int[] VB={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < VB.length; i++) {
            for (int j = 0; j < VA.length; j++) {
                System.out.println(i+"x"+j+"="+(VB[i]*VA[j]));
            }
            System.out.println("");
        }
        
    }


    public static void main(String[] args) {
        ejemploVectores();
        System.out.println("El mismo resultado");
        int[] v1={1,2,3,4,5,6,7,8,9,10};
        sumaNumeros(v1);
        int[] v1x=new int[]{1,2,3,4,5,6,7,8,9,10};
        sumaNumeros(v1x);

        System.out.println("Resultado 12");
        int[] v1x=new int [1]=2;        v1y[9]=10;
        sumaNumeros(v1y);
        //alamcenarValoresEnVector();
        multiplicacion();
    }
    

}
