package upnadirect;

public class Presentador
{
    private final Vista vista = new Vista();

    public Cliente SolicitaDatosCliente()
    {
        int AñoNacimiento = this.vista.consultarAñoNacimiento();
        float Salario = this.vista.consultarSalario();
        
        if(new Cliente(AñoNacimiento,Salario).ClienteValido())
        {
            return new Cliente(AñoNacimiento, Salario);
        }
        
        this.vista.MostrarAvisoCliente();
        return SolicitaDatosCliente();
    }
    public Bien SolicitaDatosBien()
    {
        String Tipo = this.vista.consultarTipo();
        float Valor = this.vista.consultarValor();
        
        if(new Bien(Tipo, Valor).EsUnBienCorrecto())
        {     
            return new Bien(Tipo,Valor);
        }
        
        else
        {
          this.vista.MostrarAvisoBien();
          return SolicitaDatosBien();  
        }
    }
}
