package DigitalInovationOne.GOF.Facade;

import DigitalInovationOne.SubSistema1_CRM.CrmService;
import DigitalInovationOne.SubSistema2_CEP.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);


    }
}
