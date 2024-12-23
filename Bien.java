package upnadirect;

public class Bien
{
    private String Tipo;
    private float Valor;
    
    public Bien(String Tipo, float Valor){
        this.Valor = Valor;
        this.Tipo = Tipo;
    }
    
    public float getValor(){
        return this.Valor;
    }
    public String getTipo(){
        return this.Tipo;
    }
    public boolean EsUnBienCorrecto(){
        return (this.Tipo.equals("vivienda") && this.Valor >= 50000) || (this.Tipo.equals("vehiculo") && this.Valor <= 50000 && this.Valor >= 0);
    }
}
