/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjdbc;

/**
 *
 * @author pbergqui
 */
public class TestJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySQLAccess dao = new MySQLAccess();
        try {
            dao.readDataBase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Da er vi ferdige");
    }

}
