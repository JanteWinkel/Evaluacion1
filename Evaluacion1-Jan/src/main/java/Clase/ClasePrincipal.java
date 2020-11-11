package Clase;
import javax.swing.JOptionPane;
import java.util.Scanner; 

public class ClasePrincipal {
    static int [][] matriz = null;
    static int [][] matrizi = null;
    static int [][] matrizt = null;
    static Scanner sc = new Scanner(System.in);
    static Scanner isc = new Scanner(System.in);
    static Scanner tsc = new Scanner(System.in);
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        int matriz1[][] = new int [3][3];
        int matriz2[][] = new int [3][3];
        int matriz3[][] = new int [3][3];
        int matrizsuma[][] = new int [3][3];
        int matrizproducto[][] = new int [3][3];
        
        //creacion primera matriz
        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1.length; j++){
                matriz1[i][j] = (int)(Math.random() * 9);
           
            }//segundo for   
        }//primerfor
        
        //creacion segunda matriz
        for (int i = 0; i<matriz2.length; i++){
            for (int j = 0; j<matriz2.length; j++){
                matriz2[i][j] = (int)(Math.random() * 9);
           
            }//segundo for   
        }//primerfor
        
        //creacion tercera matriz
        for (int i = 0; i<matriz3.length; i++){
            for (int j = 0; j<matriz3.length; j++){
                matriz2[i][j] = (int)(Math.random() * 9);
           
            }//segundo for   
        }//primerfor
        
        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1.length; j++){
                matrizsuma[i][j] = matriz1[i][j] + matriz2[i][j];
                
            }//segundo for
        }//primer for
    
       //imprimir matrices y suma
       for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1.length; j++){
               System.out.print("[ "+ matriz1[i][j]+ " ]");             
            }//segundo for
            
             if (i==1){
             System.out.print("  +  ");
             }
             else {
                  System.out.print("     ");
             }
                 
             for (int j = 0; j<matriz2.length; j++){
               System.out.print("[ "+ matriz2[i][j]+ " ]");
             }//segundor for
             
             if (i==1){
             System.out.print("  =  ");
             }
             else {
                  System.out.print("     ");
             }
             
              for (int j = 0; j<matrizsuma.length; j++){
               System.out.print("[ "+ matrizsuma[i][j]+ " ]");
             }//segundor for
             
            System.out.println("");
       }//primer for
       System.out.println("");
       
       //multiplicacion de matrices
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            if (matrizproducto[0][0] == 0) {
                int var = (matriz3[0][0] * matrizsuma[0][0])
                        + (matriz3[0][1] * matrizsuma[1][0])
                        + (matriz3[0][2] * matrizsuma[2][0]);
                matrizproducto[0][0] = var;

                     }//primer if 
            else if (matrizproducto[1][0] == 0) {
                int var = (matriz3[1][0] * matrizsuma[0][0])
                        + (matriz3[1][1] * matrizsuma[1][0])
                        + (matriz3[1][2] * matrizsuma[2][0]);
                matrizproducto[1][0] = var;
            }//primer else if
            
            else if(matrizproducto[2][0] == 0) {
                int var = (matriz3[2][0] * matrizsuma[0][0])
                        + (matriz3[2][1] * matrizsuma[1][0])
                        + (matriz3[2][2] * matrizsuma[2][0]);
                matrizproducto[2][0] = var;
            }//segundo else if
            
            else if(matrizproducto[0][1] == 0) {
                int var = (matriz3[0][0] * matrizsuma[0][1])
                        + (matriz3[1][1] * matrizsuma[1][1])
                        + (matriz3[1][2] * matrizsuma[2][1]);
                matrizproducto[0][1] = var;
            }//tercer else if  
            
            else if(matrizproducto[1][1] == 0) {
                int var = (matriz3[1][0] * matrizsuma[0][1])
                        + (matriz3[1][1] * matrizsuma[1][1])
                        + (matriz3[0][2] * matrizsuma[2][1]);
                matrizproducto[1][1] = var;
            }//cuarto else if  
            
            else if(matrizproducto[2][1] == 0) {
                int var = (matriz3[2][0] * matrizsuma[0][1])
                        + (matriz3[2][1] * matrizsuma[1][1])
                        + (matriz3[2][2] * matrizsuma[2][1]);
                matrizproducto[2][1] = var;
            }//quinto else if 
            
            else if(matrizproducto[0][2] == 0) {
                int var = (matriz3[0][0] * matrizsuma[0][2])
                        + (matriz3[0][1] * matrizsuma[1][2])
                        + (matriz3[0][2] * matrizsuma[2][2]);
                matrizproducto[0][2] = var;
            }//sexto else if
            
            else if(matrizproducto[1][2] == 0) {
                int var = (matriz3[1][0] * matrizsuma[0][2])
                        + (matriz3[1][1] * matrizsuma[1][2])
                        + (matriz3[1][2] * matrizsuma[2][2]);
                matrizproducto[1][2] = var;
            }//septimo else if
            
            else if(matrizproducto[2][2] == 0) {
                int var = (matriz3[2][0] * matrizsuma[0][2])
                        + (matriz3[2][1] * matrizsuma[1][2])
                        + (matriz3[2][2] * matrizsuma[2][2]);
                matrizproducto[2][2] = var;
            }//octavo else if
            } 
        }//primer for
        
        //imprimir matrizproducto
        
         for (int i = 0; i<matriz3.length; i++){
            for (int j = 0; j<matriz3.length ; j++){
               
               System.out.print("[ "+ matriz1[i][j]+ " ]");             
            }//segundo for
            
             if (i==1){
             System.out.print("  x  ");
             }
             else {
                  System.out.print("     ");
             }
                 
             for (int j = 0; j<matrizsuma.length; j++){
               System.out.print("[ "+ matrizsuma[i][j]+ " ]");
             }//segundor for
             
             if (i==1){
             System.out.print("  =  ");
             }
             else {
                  System.out.print("     ");
             }
             
              for (int j = 0; j<matrizproducto.length; j++){
               System.out.print("[ "+ matrizproducto[i][j]+ " ]");
             }//segundor for
             
            System.out.println("");
  
       }//primer for
         
       System.out.print("");
       
       matriz = segundoejercicio(matriz);
       
       System.out.println("Filas: " + matriz.length);
       System.out.println("Columnas: " + matriz[0].length);
       
       System.out.println();
       ingresarValores(matriz);
       System.out.println();
       imprimirmatriz(matriz);
       
       System.out.println();
       matrizi = tercerejercicio(matrizi);
       
       System.out.println("Filas: " + matrizi.length);
       System.out.println("Columnas: " + matrizi[0].length);
       
      System.out.println();
       ingresarValoresejercicio3(matrizi);
       System.out.println();
       imprimirmatriz(matrizi);
       
       matrizt = cuartoejercicio(matrizt);
       System.out.println();
       cuartoejercicio(matrizt);
       System.out.println();
       valorescuartoejercicio(matrizt);
           
    }//psv

        
       //definicion de filas y columnas
       public static int[][] segundoejercicio (int [][] b){
           int matriz[][], nfilas, ncol;
           nfilas = Integer.parseInt(JOptionPane.showInputDialog("escriba numero de filas del segundo ejercicio"));
           ncol = Integer.parseInt(JOptionPane.showInputDialog("escriba numero de columnas del segundo ejercicio"));
           
            b = new int [nfilas][ncol];
            return b;
       
       }//fin segundo ejercicio
       
       //valores de cada posicion segundo ejercicio
       public static void ingresarValores(int[][] b){
           for (int i = 0; i< b.length; i++){
            for (int j = 0; j< b[i].length; j++){
               
                b[i][j] = ((23*i*i*i*i) + ((20*j*j*j)-3));
            }
           
           }
       }//fin ingresar valores
   
       //imprimir matriz segundo ejercicio
       public static void imprimirmatriz(int[][] b){
           for (int i = 0; i< b.length; i++){
            for (int j = 0; j< b[i].length; j++){
                System.out.print("[ "+b[i][j]+" ]");
            }
            System.out.println();
            }
       }//fin imprimir matriz

    
    public static int[][] tercerejercicio (int [][] z){
        int matrizi[][], nfilas, ncol;
           nfilas = Integer.parseInt(JOptionPane.showInputDialog("escriba numero de filas y columnas que tendra la matriz a determinaar si es identidad"));
           ncol = nfilas;
           
            z = new int [nfilas][ncol];
        return z;
    }
    
     //valores de cada posicion tercer ejercicio
        public static void ingresarValoresejercicio3 (int[][] z){
            System.out.println("ejercicio 3");
           System.out.println("ingresar valores de la matriz");
           for (int i = 0; i< z.length; i++){
            for (int j = 0; j< z[i].length; j++){
                System.out.println("ingresa valor "+"[ "+i+" ]["+j+" ]");
                z[i][j] = Integer.parseInt(isc.next());
            }
           
           }
       }//fin ingresar valores
        
        //imprimir matriz tercer ejercicio
       public static void imprimirmatrizi(int[][] z){
           boolean com = true;
           for (int i = 0; i< z.length; i++){
            for (int j = 0; j< z[i].length; j++){
                System.out.print("[ "+z[i][j]+" ]");
            }
            System.out.println();
            }
           
       
            for (int i = 0; i< z.length; i++){
            for (int j = 0; j< z[i].length; j++){
                
                if (i==j) {
                    if (z[i][j] == 1){
                        
                    }//fin if
                }else {
                 if (z[i][j]!=0)   {
                     System.out.print("la matriz ingresada no es una matriz identidad");
                    com=false; 
                 }//fin if
                }//fin else   
                
            }//fin segundo for           
        }//fin primer for  
        if (com==true){
                    System.out.println("");
                    System.out.println("La matriz es identidad");
                }//fin if com
       }//fin imprimir matrizi      
     //ejercicio 4
      public static int[][] cuartoejercicio (int [][] k){
        int matrizt[][], nfilas, ncol;
           nfilas = Integer.parseInt(JOptionPane.showInputDialog("escriba numero de filas y columnas que tendra la matriz a determinaar si es triangular inferior"));
           ncol = nfilas;
           
            k = new int [nfilas][ncol];
        return k;
      }
      
      public static void valorescuartoejercicio (int [][] k){
          int w=0;
          System.out.println("ejercicio 41");
         System.out.println("ingresar valores de la matriz");
           for (int i = 0; i< k.length; i++){
            for (int j = 0; j< k[i].length; j++){
                System.out.println("ingresa valor "+"[ "+i+" ]["+j+" ]");
                k[i][j] = Integer.parseInt(isc.next());
            
            } //fin segundo for           
            }//fin primer for
           
           
           
           for (int i = 0; i< k.length; i++){
            for (int j = 0; j< k[i].length; j++){
                if (i<j){
                     w+= (k[i][j]);                    
                }//fin if
            
            } //fin segundo for           
            }//fin primer for
        if (w==0){
         System.out.println("es una matriz triangular inferior");  
        }  else{
            System.out.println("no es una matriz triangular inferior"); 
        } //fin esle
       }//fin ingresar valore
   }// public class
