/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author User
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SqlDb db = new SqlDb();
        int x=50;
        String y="666";
        
        db.新增Company(y, y, x, x, x);
        System.out.println(db.查詢Company("ALL"));
    }
    
}
