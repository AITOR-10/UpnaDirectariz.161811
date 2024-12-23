package upnadirect;
import java.time.LocalDate;
public class Cliente
{
    private int AnnoNacimiento;
    private float Salario;
    
    public Cliente(int AnnoNacimiento, float Salario)
    {
        this.AnnoNacimiento = AnnoNacimiento;
        this.Salario = Salario;
    }
    
    public int getAnnoNacimiento(){
        return this.AnnoNacimiento;
    }
    
    public float getSalario(){
        return this.Salario;
    }
    
    public boolean ClienteValido(){
        return (this.AnnoNacimiento > 1900 && LocalDate.now().getYear() > this.AnnoNacimiento);
    }
}
