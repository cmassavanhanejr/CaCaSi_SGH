/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controler.PacienteDAO;
import modelo.Paciente;

/**
 *
 * @author Carlos Massavanhane
 */
public class Testes {
    public static void main(String[] args) {
        Paciente p=new Paciente();
        
        p.setNome("Carlos");
        
        PacienteDAO.gravar(p);
    }
}
