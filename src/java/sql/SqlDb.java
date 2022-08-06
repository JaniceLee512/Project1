/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.記帳資料庫;
import Model.記帳資料;
import java.util.List;

/**
 *
 * @author User
 */
public class SqlDb {

    private final String url;//Java DB 連線字串
    private final String user;
    private final String pass;
    private final 記帳資料庫 users;

    public SqlDb() {
        this.url = "jdbc:derby://localhost:1527/project2";
        this.user = "project2";
        this.pass = "8888";
        this.users = new 記帳資料庫();
    }

    public List<記帳資料> 查詢Home(String n) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select*from home");) {
                while (rs.next()) {
                    記帳資料 person = new 記帳資料();

                    String name = rs.getString("name");
                    String product = rs.getString("product");
                    int price = rs.getInt("price");
                    int number = rs.getInt("number");
                    int total = rs.getInt("total");
                    if (n.equals("ALL")) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                    else if (n.equals(name)) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                }//while   
            } catch (SQLException e) {
                //輸出錯誤訊息
                System.err.println(e);//System.err輸出訊息會是紅色
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return users.getA1();
    }


    public List<記帳資料> 查詢School(String n) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select*from school");) {
                while (rs.next()) {
                    記帳資料 person = new 記帳資料();

                    String name = rs.getString("name");
                    String product = rs.getString("product");
                    int price = rs.getInt("price");
                    int number = rs.getInt("number");
                    int total = rs.getInt("total");
                    if (n.equals("ALL")) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                    else if (n.equals(name)) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                }//while   
            } catch (SQLException e) {
                //輸出錯誤訊息
                System.err.println(e);//System.err輸出訊息會是紅色
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return users.getA1();
    }

    public List<記帳資料> 查詢Company(String n) {
       try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("select*from company");) {
                while (rs.next()) {
                    記帳資料 person = new 記帳資料();

                    String name = rs.getString("name");
                    String product = rs.getString("product");
                    int price = rs.getInt("price");
                    int number = rs.getInt("number");
                    int total = rs.getInt("total");
                    if (n.equals("ALL")) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                    else if (n.equals(name)) {
                        person.setName(name);
                        person.setProduct(product);
                        person.setPrice(price);
                        person.setNumber(number);
                        person.setTotal(total);

                        users.setA1(person);
                    }
                }//while   
            } catch (SQLException e) {
                //輸出錯誤訊息
                System.err.println(e);//System.err輸出訊息會是紅色
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return users.getA1();
    }

    public void 新增Home(String name, String product, int price, int number, int total) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();) {
                記帳資料 person = new 記帳資料();

                person.setName(name);
                person.setProduct(product);
                person.setPrice(price);
                person.setNumber(number);
                person.setTotal(total);

                users.setA1(person);

                String query = "INSERT INTO HOME VALUES" + "('" + name + "', '" + product + "', " + price + ", " + number + "," + total + ")";
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println(e);
            }
        } catch (ClassNotFoundException e) {
        }
    }

    public void 新增School(String name, String product, int price, int number, int total) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();) {
                記帳資料 person = new 記帳資料();

                person.setName(name);
                person.setProduct(product);
                person.setPrice(price);
                person.setNumber(number);
                person.setTotal(total);

                users.setA1(person);

                String query = "INSERT INTO SCHOOL VALUES" + "('" + name + "', '" + product + "', " + price + ", " + number + "," + total + ")";
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println(e);
            }
        } catch (ClassNotFoundException e) {
        }
    }

    public void 新增Company(String name, String product, int price, int number, int total) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (Connection con = DriverManager.getConnection(url, user, pass);
                    Statement stmt = con.createStatement();) {
                記帳資料 person = new 記帳資料();

                person.setName(name);
                person.setProduct(product);
                person.setPrice(price);
                person.setNumber(number);
                person.setTotal(total);

                users.setA1(person);

                String query = "INSERT INTO COMPANY VALUES" + "('" + name + "', '" + product + "', " + price + ", " + number + "," + total + ")";
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println(e);
            }
        } catch (ClassNotFoundException e) {
        }
    }

}
