/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8;
import java.util.Scanner;

/**
 *
 * @author InstFisica
 */
public class Punto8 {

   
    
            
    public static void main(String[] args) {
        
        
       Scanner numero = new Scanner(System.in);
        int x , y, z;
        int validar = 0;
        do{
            System.out.println("Ingrese el primer numero");
            x = numero.nextInt();
            if (x>99 || x<0){
                System.out.println("Ingrese un numero de dos cifras positivo!!");
                validar=1;
            }
            else{
                validar = 0;
            }
        }while(validar!=0);
       do{
            System.out.println("Ingrese el segundo numero");
            y = numero.nextInt();
            if (y>99 || y<0){
                validar=1;
            }
            else{
                validar = 0;
            }
        }while(validar!=0);
        
       z=x%10;
       switch (z){
           case 0:
               if(x>y){
                   System.out.println(x+" es mayor que "+y);
               }
               else if(y>x){
                   System.out.println(y+" es mayor que "+x);
               }
               else{
                   System.out.println(x+" es igual "+y);
               }
           break;
           case 1:
                if(x<y){
                   System.out.println(x+" es menor que "+y);
               }
               else if(y<x){
                   System.out.println(y+" es menor que "+x);
               }
               else{
                   System.out.println(x+" es igual "+y);
               }
           break;
           case 2:
               x=x+y;
               System.out.println("La suma es: "+x);
           break;
           case 3:
               x=x-y;
               System.out.println("La resta es: "+x);
           break;
           case 4:
               x=x*y;
               System.out.println("La multiplicacion es: "+x);
           break;
           case 5:
               float k;
               k=x/y;
               System.out.println("La division es: "+k);
           break;
           case 6:
               k=x%y;
               if (k==0){
                   System.out.println(x+" es divisible entre "+y);
               }
               else {
                    System.out.println(x+" no es divisible entre "+y);
               }
           break;
           case 7:
                k=y%x;
               if (k==0){
                   System.out.println(y+" es divisible entre "+x);
               }
               else {
                    System.out.println(y+" no es divisible entre "+x);
               }
           break;
           case 8:
               double p, o;
               p=x;
               System.out.println("la raiz cuadrada de "+p+" es "+Math.sqrt(p));
           break;
           case 9:
               System.out.println("Su puta madre!!!");
           break;
       } 
    }
    
}
