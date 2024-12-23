package upnadirect;
import java.util.Scanner;
public class Vista
{
    private final Scanner scan = new Scanner(System.in);
    
    public String consultarTipo()
    {
           
        System.out.print("Introduce el tipo de bien: ");
        String Tipo = scan.nextLine();
        return Tipo;
        
    }
    
    public float consultarValor()
    {    
        
        System.out.print("Introduce el valor del bien: ");
        float Valor = scan.nextFloat();
        scan.nextLine();
        return Valor;
        
    }
    
    public int consultarAñoNacimiento()
    {    

        System.out.print("Introduce el año de nacimiento del cliente: ");
        int AñoNacimiento = scan.nextInt();
        scan.nextLine();
        return AñoNacimiento;
        
    }
    
    public float consultarSalario()
    {    
        
        System.out.print("Introduce el salario del cliente: ");
        float Salario = scan.nextFloat();
        scan.nextLine();
        return Salario;
        
    }
    
    public void MostrarAvisoCliente()
    {
        System.out.println("Aviso!! Datos del cliente incorrectamente introducidos.");
        System.out.println("Año de nacimiento debe ser mayor a 1900 y menor que el año actual");
    }
    
    public void MostrarAvisoBien()
    {
        System.out.println("Aviso!! Datos del bien incorrectamente introducidos.");
        System.out.println("El tipo de bien debe ser vivienda o vehiculo.");
        System.out.println("Si se trata de un vehículo, entonces su valor máximo es 50.000€.\n" + "Si se trata de una vivienda entonces su valor mínimo es 50.000€");
    }
}
