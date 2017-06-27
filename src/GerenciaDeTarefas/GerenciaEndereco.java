/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaDeTarefas;
import Dominio.Endereco;
import Dominio.Logradouro;
import Dominio.Bairro;
import Dominio.Cidade;
import Dominio.Uf;
/**
 *
 * @author reida
 */
public class GerenciaEndereco {

    GTPrincipal gt;
    public GerenciaEndereco(GTPrincipal gt) {
        this.gt = gt;
    }
    
    public Endereco gerarEndereco(String nomeUf, String nomeCidade, String nomeBairro, String nomeLogradouro,
            String cep, String numeroCasa){
        //TRATAR FALHA NA CRIACAO
        Uf uf = new Uf(nomeUf);
        Cidade cidade = new Cidade(uf, nomeCidade);
        Bairro bairro = new Bairro(cidade, nomeBairro);
        Logradouro logr = new Logradouro(Integer.parseInt(cep), bairro, nomeLogradouro);
        Endereco end = new Endereco(logr, Integer.parseInt(numeroCasa));
        
        return end;
    }
}
