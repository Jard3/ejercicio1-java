import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner teclado=new Scanner(System.in);
            System.out.println("Ingrese su edad");
            edad=teclado.nextInt();
            if(edad>18){
                System.out.println("Eres mayor de edad");
            }else{System.out.println("Eres menor de edad");}
        }
    }
