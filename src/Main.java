import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        System.out.println("un numero entre 1 y 7 ");
        System.out.print("1: Eres mayor de edad?"+"\n"+
                "2: numero mayor" +"\n" +
                "3: par o impar" + "\n"+
                "4:factorial " + "\n"+
                "5: numeros impares usando for" + "\n"+
                "6: numero impares usando while" + "\n"+
                "7: dia de la semana");
        opcion=teclado.nextInt();
        switch(opcion) {
            case 1:

                int edad;

                System.out.println("Ingrese su edad");
                edad = teclado.nextInt();
                if (edad > 18) {
                    System.out.println("Eres mayor de edad");
                } else {
                    System.out.println("Eres menor de edad");
                }
                break;
                case 2:
        int num1 ,nume2;
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
        }break;
        case 3:

        int num;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        if (num%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }break;
        case 4:
        int factorial =0, nume;
        System.out.println("Ingrese un numero: ");
        nume=teclado.nextInt();
        factorial=nume;
        for (int i = 1; i < nume; ++i) {
            factorial=factorial*i;

            System.out.println(factorial);
        }break;
        case 5:
        int numero;
        System.out.println("Ingrese un numero mayor que 10 y menor que 30");
        numero=teclado.nextInt();
        while(numero>30||numero<10){System.out.println("Ingrese un numero valido");
        numero=teclado.nextInt();}
        for(int i=1;i<=numero;i+=2){
            System.out.println(i);
        }break;
case 6:
        int k =1, numer;
        System.out.println("Ingrese un numero mayor que 10 y menor que 30");
        numer=teclado.nextInt();
        while(numer>30||numer<10){System.out.println("Ingrese un numero valido");
            numer=teclado.nextInt();}
        while(k<numer){
            k+=2;
                    System.out.println(k);
        }break;
        case 7:
                int nm;
                System.out.println("Ingrese un numero entre 1 y 5");
                nm = teclado.nextInt();
                while (nm < 1 || nm > 5) {
                    System.out.println("Ingrese un numero entre 1 y 5");
                    nm = teclado.nextInt();
                }
                switch (nm) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miercoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                }break;
        }
    }
    }
