package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
        //ejercicio5();
    }

    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Numero");
        int n = sc.nextInt();
        int i;

        System.out.println("Primeros "+n+" pares ");

        for(i=1;i<=2*n;i++){
            //Si es divisible por 2
            if(i%2 == 0)
                System.out.println(i);
            else
                continue;
        }

        sc.close();
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N y luego M");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Los primeros n multiplos de m");
        int i;
        for(i = 1; i < n+m; i++){
            if((m%i) == 0){
                System.out.println(i);
            }
            else
            continue;
        }
        sc.close();

    }
    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N para ver si es primo");
        int n = sc.nextInt();
        boolean aux = false;
        for (int i = 2; i <= n/2 ; i++){
            if(n % i == 0){
                aux = true;
                break;
            }
        }
        if(!aux){
            System.out.println("Es primo");
        }
        else
            System.out.println("No es primo");

        sc.close();
    }
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Numero");
        //6
        boolean aux = false;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i==1 || i==0)
                continue;

            aux = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    //System.out.println(i);
                    aux = false;
                    break;
                }
            }
            if (aux) {
                System.out.println(i);
            }
        }
        sc.close();
    }



    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese N  luego M y luego D");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

    }
}
