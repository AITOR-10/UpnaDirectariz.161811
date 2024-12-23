package upnadirect;

public class OfrecerOferta
{
    public String OfertaMasVentajosa()
    {
        Presentador presentador = new Presentador();
        Cliente cliente = presentador.SolicitaDatosCliente();
        Bien bien = presentador.SolicitaDatosBien();
        Aseguradora[] Agentes = new Aseguradora[3];
        Agentes[0] = new Mafro(bien, cliente);
        Agentes[1] = new LineaIndirecta(bien, cliente);
        Agentes[2] = new Adasles(bien, cliente);
        return ComparaOfertas(Agentes);
    }
    
    private String ComparaOfertas(Aseguradora[] Agentes)
    {
        Aseguradora AgenteMejorOferta = Agentes[0];
        for(int i=1; i<3;i++)
        {
            if(AgenteMejorOferta.Importe() > Agentes[i].Importe())
            {
               AgenteMejorOferta = Agentes[i]; 
            }
            else if((AgenteMejorOferta.Importe() == Agentes[i].Importe()) && (AgenteMejorOferta.Comision() < Agentes[i].Comision()))
            {
                AgenteMejorOferta = Agentes[i]; 
            }
        }
        return "|" + AgenteMejorOferta.getClass().getSimpleName() + "|" +  AgenteMejorOferta.Importe() + "|" + AgenteMejorOferta.Comision() + "|";
    }
    
    public String OfertaMasVentajosaPruebas(Cliente cliente, Bien bien)
    {
        Aseguradora[] Agentes = new Aseguradora[3];
        Agentes[0] = new Mafro(bien, cliente);
        Agentes[1] = new LineaIndirecta(bien, cliente);
        Agentes[2] = new Adasles(bien, cliente);
        return ComparaOfertas(Agentes);
    }
}
