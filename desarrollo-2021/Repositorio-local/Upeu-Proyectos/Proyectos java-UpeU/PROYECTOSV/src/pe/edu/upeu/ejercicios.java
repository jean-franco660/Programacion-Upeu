package pe.edu.upeu;

public class ejercicios {

    public int factorial(int rango){
        int result=100;
        if (rango>100) {
            for (int i = 100; i <=rango ; i++) {
                result*=i;
            }
            
        }
        return result;
    }

public int potencias(int rangos){
    return 0;
}

public void FuncionExponenciales(){
    System.out.println("el factorial de 100 es:"+factorial(100));
}

}
