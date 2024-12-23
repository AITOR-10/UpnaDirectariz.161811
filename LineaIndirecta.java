package upnadirect;
import java.time.LocalDate;

public class LineaIndirecta implements Aseguradora
{
    Cliente cliente;
    Bien bien;
    
    public LineaIndirecta(Bien bien, Cliente cliente)
    {
        this.bien = bien;
        this.cliente = cliente;
    }
    
    @Override
    public float Importe()
    {
        if ((bien.getTipo().equals("vehiculo") && bien.getValor() < 20000) || (bien.getTipo().equals("vivienda") && bien.getValor() < 150000))
        {
            return 0.04f * bien.getValor(); 
        } 
        else if (bien.getTipo().equals("vehiculo") && bien.getValor() >= 20000 && LocalDate.now().getYear() - cliente.getAnnoNacimiento() > 60)
        {
            return 0.06f * bien.getValor(); 
        } 
        else
        {
            return 0.03f * bien.getValor(); 
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
            comision = 0.04f * importeSeguro; 
        }

        return (int) Math.floor(comision); 

    }
    
}