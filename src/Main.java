import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        /*int edad;

            System.out.println("Ingrese su edad");
            edad=teclado.nextInt();
            if(edad>18){
                System.out.println("Eres mayor de edad");
            }else{System.out.println("Eres menor de edad");}*/
        /*int num1 ,nume2;
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        nume2=teclado.nextInt();
        if (num1==nume2){System.out.println("Los numeros son iguales");}
        else if (num1>nume2){
            System.out.println(num1 + " Es el numero mayor");
        }
        else {
            System.out.println(nume2 + " Es el numero mayor");
        }*/
        /*
        int num;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        if (num%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }*/
        /*
        int factorial =0, num, multiplicacion;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        factorial=num;
        for (int i = 1; i < num; ++i) {
            factorial=factorial*i;

            System.out.println(factorial);
        }*/
        int numero;
        System.out.println("Ingrese un numero mayor que 10 y menor que 30");
        numero=teclado.nextInt();
        while(numero>30||numero<10){System.out.println("Ingrese un numero valido");
        numero=teclado.nextInt();}
        for(int i=1;i<=numero;i+=2){
            System.out.println(i);
        }
    }
    }
