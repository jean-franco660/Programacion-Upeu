package pe.edu.upeu.JFLQ.matriz;

public class EjercicioMatrices {
        
        public void transformada01(int dimesion, int valorInicial) {
            int item=0;
            int [][] matriz=new int[dimesion][dimesion];
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    if (fila<dimesion+columna) {
                      item=valorInicial+(fila+columna)+(fila+columna)/2 +fila;
                    matriz[fila][columna]=item;  
                    }
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if(j<matriz.length-i){
                    System.out.print(matriz[i][j]+"\t");
                    }else{
                    System.out.print("\t");
                    }
                }
                System.out.println("");
            }          
        }
    
        public void transformada01x(int dimension, int valorInicial) {
            int item=0;
            String[][] matriz=new String[dimension][dimension];
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int colum = 0; colum< matriz.length; colum++) {
                    if(colum<dimension-fila){
                    item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                    matriz[fila][colum]=""+item;
                    }else{
                        matriz[fila][colum]="";
                    }
                }
            }  
            imprimirContenidoMatrizEnteros(matriz);              
        }
    
        public void imprimirContenidoMatrizEnteros(Object[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println("");
            }        
        } 
    
        public void imprimirContenidoMatrizEnteros(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println(matriz[i][j]+"\t");
                }
                System.out.println("");
            }
            
        }
//*****************************************************************************//

        public void imprimirContenidoMatrizCadena(String[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                        System.out.print(matriz[i][j]+"\t");
                    }else{
                        System.out.print("\t");
                    }                
                }
                System.out.println("");
            }        
        }


        public String[][] transformada11(int dimen, int numInit) {
            String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = i; j < matriz.length; j++) {
                    matriz[i][(dimen-1)-j]=""+numInit;
                    numInit++;
                }
            }
            return matriz;
        }

        public void transformada17(int dimen, int numInit) {
            String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <= (dimen-1)-i; j++) {
                    matriz[j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt=new EjercicioMatrices();  
            mt.imprimirContenidoMatrizCadena(matriz);        
        }

        public void transformada18(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];// I= fila , J = columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=i ; j++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }

        public void transformada28(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];
            for (int j = 0; j < matriz[0].length; j++) {
                if (j%2==0) {
                    for (int i = 0; i < matriz.length; i++) {
                        matriz[(dimen-1)-j][i]=""+numInit;
                        numInit++;
                    }
                } else {
                    for (int i = matriz.length-1; i >=0 ; i--) {
                        matriz[(dimen-1)-j][i]=""+numInit;
                        numInit++;
                    }                
                } 
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }

        public void transformada14(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=i ; j++) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }

        public void transformada16(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=i ; j++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }

        public void transformada13(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=(dimen-1)-i ; j++) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }

        public void transformada19(int dimen, int numInit) {
            String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=(dimen-1)-i; j++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt=new EjercicioMatrices();  
            mt.imprimirContenidoMatrizCadena(matriz);        
        }

        public void transformada15(int dimen, int numInit) {
            String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=(dimen-1)-i; j++) {
                    matriz[(dimen-1)-j][i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt=new EjercicioMatrices();  
            mt.imprimirContenidoMatrizCadena(matriz);        
        }

        public void transformada20(int dimen, int numInit) {
            String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <=i; j++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            }
            EjercicioMatrices mt=new EjercicioMatrices();  
            mt.imprimirContenidoMatrizCadena(matriz);        
        }

        public void transformada22(int dimen, int numInit) {
            String[][] matriz = new String[dimen][dimen];
            for (int j = 0; j < matriz[0].length; j++) {
                if (j%2==0) {
                    for (int i = 0; i < matriz.length; i++) {
                        matriz[(dimen-1)-i][j]=""+numInit;
                        numInit++;
                    }
                } else {
                    for (int i = matriz.length-1; i >=0 ; i--) {
                        matriz[(dimen-1)-i][j]=""+numInit;
                        numInit++;
                    }                
                } 
            }
            EjercicioMatrices mt = new EjercicioMatrices();
            mt.imprimirContenidoMatrizCadena(matriz);
        }


        public static void main(String[] args) {
            EjercicioMatrices mt =new EjercicioMatrices();
            mt.transformada01(5, 0);  
            System.out.println("");
            mt.transformada01x(5,0);
            System.out.println("");
            mt.imprimirContenidoMatrizCadena(mt.transformada11(5, 0));
            System.out.println("");
            mt.transformada17(5, 0);
            System.out.println("");
            mt.transformada18(5, 0);
            System.out.println("");
            mt.transformada28(5, 0);
            System.out.println("");
            mt.transformada14(5, 0);
            System.out.println("");
            mt.transformada16(5, 0);
            System.out.println("");
            mt.transformada13(5, 0);
            System.out.println("");
            mt.transformada19(5, 0);
            System.out.println("");
            mt.transformada15(5, 0);
            System.out.println("");
            mt.transformada20(5, 0);
            System.out.println("");
            mt.transformada22(5, 0);
            

        }
}
