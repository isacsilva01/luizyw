/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luiz;

import java.sql.*;

/**
 *
 * @author 20221074010064
 */
public class Luiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Customer c = new Customer(1, "Jonathas", "Roberto", "r.jonathas@escolar.ifrn.edu.br", 1, 1);
        
        CustomerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
        dao.updateCustomer(611);
        dao.deleteCustomer(666);
        dao.showCustomers();
        
    }
    
}
