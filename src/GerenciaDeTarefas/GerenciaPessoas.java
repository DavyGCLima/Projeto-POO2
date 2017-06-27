/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaDeTarefas;

import DAO.PessoaDAO;
import Dominio.Endereco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Dominio.PessoaFisica;
import Dominio.PessoaJuridica;
import java.sql.Date;
/**
 *
 * @author reida
 */
public class GerenciaPessoas {

    GTPrincipal gt;
    DAO.PessoaDAO pessoaDAO;
    public GerenciaPessoas(GTPrincipal gt) {
        pessoaDAO = new PessoaDAO();
        this.gt = gt;
    }
    
    public void cadastrarPessoaFisica(String nome, String uf, String cidade, String bairro,
            String rua,String cep, String numeroCasa, String telefone, String email,
            String cpf, String nascimento, String estadoCiv, String naturalidade, String nacionalidade){
        
        //CRIANDO ENDEREÇO
        Endereco endereco = gt.getGTEndereco().gerarEndereco(uf, cidade, bairro, rua, cep, numeroCasa);
        
        //CRIANDO INSTANCIA DE PESSOA FISICA
        PessoaFisica p = new PessoaFisica(Integer.parseInt(cpf), Date.valueOf(nascimento), estadoCiv, 
                naturalidade, nacionalidade, nome, 0, email, nome, endereco);
        
        //INSERE
        try {
            pessoaDAO.inserir(p);
        } catch (SQLException ex) {
            Logger.getLogger(GerenciaPessoas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciaPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
