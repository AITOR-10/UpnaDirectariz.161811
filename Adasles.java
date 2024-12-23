package upnadirect;
import java.time.LocalDate;

public class Adasles implements Aseguradora
{
    Cliente cliente;
    Bien bien;
    
    public Adasles(Bien bien, Cliente cliente)
    {
        this.bien = bien;
        this.cliente = cliente;
    }
    
    @Override
    public float Importe()
    {
        if ((bien.getTipo().equals("vehiculo") && (LocalDate.now().getYear() - cliente.getAnnoNacimiento() < 20 || LocalDate.now().getYear() - cliente.getAnnoNacimiento() > 60)))
        {
            return 0.06f * bien.getValor(); 
        } 
        else
        {
            return 0.02f * bien.getValor(); 
        }  
    }
    
    @Override
    public int Comision()
    {
        float importeSeguro = Importe();
        float comision;

        if (importeSeguro <= 1000)
        {
            comision = 0.01f * importeSeguro;
        } 
        else
        {
            comision = 0.05f * importeSeguro; 
        }

        return (int) Math.floor(comision); 

    }
    
}
