import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Bienvenido a la calculadora");
int opcion;
        do {
            System.out.printf("1-Suma 2-Resta 3-multiplicar 4- Division 5- Salir");
      opcion = sc.nextInt();
      float a,b;
            switch (opcion) {
                case 1:
                System.out.print("ingrese el primer numero: ");
                a= sc.nextInt();
                System.out.print("ingrese el segundo numero: ");
                b= sc.nextInt();
                System.out.print("Respuesta:");
                System.out.print(Suma(a,b));
                    break;
                case 2:
                    System.out.print("ingrese el primer numero: ");
                    a= sc.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    b= sc.nextInt();
                    System.out.print("Respuesta:");
                    System.out.print(Resta(a,b));
                    break;
                case 3:
                    System.out.print("ingrese el primer numero: ");
                    a= sc.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    b= sc.nextInt();
                    System.out.print("Respuesta:");
                    System.out.print(Multiplicacion(a,b));
                    break;
                case 4:
                    System.out.print("ingrese el primer numero: ");
                    a= sc.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    b= sc.nextInt();
                    System.out.print("Respuesta:");
                    System.out.print(Division(a,b));
                    break;
                case 5:
                    System.out.print("Gracias por su participacion");
                    break;
                default:
                    System.out.print("Opcion incorrecta");
                    break;
            }
        }while (opcion !=5);
        }
        public static float Suma(float a, float b){
        return  a+b;
        }
    public static  float Resta(float a, float b){
        return  a-b;
    }
    public static float Multiplicacion(float a, float b){
        return  a*b;
    }
    public static float Division(float a, float b){
        return  a/b;
    }

    }


