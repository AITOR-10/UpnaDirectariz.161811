package upnadirect;
import java.time.LocalDate;

public class Mafro implements Aseguradora{
    Cliente cliente;
    Bien bien;

    public Mafro(Bien bien, Cliente cliente){
        this.bien = bien;
        this.cliente = cliente;
    } 
    
    @Override
    public float Importe()
    {
        if (bien.getTipo().equals("vehiculo") && LocalDate.now().getYear() - cliente.getAnnoNacimiento() < 20)
        {
            return 0.05f * bien.getValor(); 
        } 
        else if (bien.getTipo().equals("vivienda") && bien.getValor() > 200000 && cliente.getSalario() < 20000)
        {
            return 0.02f * bien.getValor(); 
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
            comision = 0.03f * importeSeguro; 
        }

        return (int) Math.floor(comision);
    }   
}