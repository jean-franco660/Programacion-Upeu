package pe.edu.Upeu.recur;

import java.math.BigInteger;

public class SubProgramas {

    public long factorial(int numero) { 
        long resultF=1;
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF*=i;
            }
        }   
        return resultF;
    }

    public BigInteger factorialBig(int numero) { 
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
            }
        }   
        return resultF;
    }

    public BigInteger factorialRecurbig(int numero) {
        BigInteger resultf=new BigInteger("1");
        if (numero>1) {
            return factorialRecurbig(numero-1).multiply(new BigInteger(String.valueOf(numero)));
            } else {
        return resultf;
        }
    }

    public long Fibonaci(int numFinal){
        long numAnt=0, numNue=1,numTem=0,contador=1;
        while(contador<numFinal){
            numTem=numNue;
            numNue=numAnt+numNue;
            numAnt=numTem;     
            contador++;
        }
    return numNue;
    }
    

    public int FibonacciRecur(int numero){
        if (numero>1) {
            return FibonacciRecur(numero-1)+FibonacciRecur(numero-2);
        }
        return numero;
    }


    
}
