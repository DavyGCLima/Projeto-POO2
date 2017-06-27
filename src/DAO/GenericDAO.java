/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author reida
 */
public class GenericDAO {

    public GenericDAO() {
        
    }
    
    public void inserir(Object obj) throws SQLException, ClassNotFoundException {
        Session sessao = DAO.ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.save(obj);
        
        sessao.getTransaction().commit();
        sessao.close();
        
    }
    
    public void alterar(Object obj) throws SQLException, ClassNotFoundException {
        Session sessao = DAO.ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.update(obj);
        
        sessao.getTransaction().commit();
        sessao.close();
    }
    
    public void excluir(Object obj) throws SQLException {
        Session sessao = DAO.ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.delete(obj);
        
        sessao.getTransaction().commit();
        sessao.close();
    }
   
    
    public Object get(Class classe, Serializable id ) throws SQLException {
        Session sessao = DAO.ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        Object obj = sessao.get(classe, id);
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return obj;
    }
    
    
    public List listar(Class classe) throws SQLException {
        List lista;
        Session sessao = DAO.ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        Criteria cons = sessao.createCriteria(classe);
        lista = cons.list();
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return lista;
    } 
}
