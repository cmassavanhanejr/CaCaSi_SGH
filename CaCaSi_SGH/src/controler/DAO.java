/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FabricaSessoes;

/**
 *
 * @author Carlos Massavanhane
 */
public abstract class DAO {
    public static boolean gravar(Object obj){
        Session s = FabricaSessoes.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        
        try{
            s.save(obj);
            t.commit();
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao tentar gravar o paciente: \n"+ex);
            return false;
        }finally{
            s.close();
        }
    }
    public static boolean actualizar(Object obj){
        Session s = FabricaSessoes.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        
        try{
            s.merge(obj);
            t.commit();
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao tentar gravar: \n"+ex);
            return false;
        }finally{
            s.close();
        }
    }
    public static ArrayList<Object> lerTodosEstudantes(){
        Session s = FabricaSessoes.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Criteria cr = s.createCriteria(Object.class);
        
        try{
            ArrayList<Object> elementos = (ArrayList<Object>) cr.list();
            return elementos;
        }catch(Exception ex){
            System.out.println("Erro ao tentar ler estudantes: \n"+ex);
            return null;
        }finally{
            s.close();
        }
    }
    /*public static boolean remover(){
        Session s = FabricaSessoes.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        return false;
    }*/
}
