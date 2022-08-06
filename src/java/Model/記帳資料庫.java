/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class 記帳資料庫 {
    private List<記帳資料> a1;

    public 記帳資料庫() {
        this.a1 = new ArrayList();
    }

    public List<記帳資料> getA1() {
        return a1;
    }

    public void setA1(記帳資料 st) {
       this.a1.add(st);
    }

    @Override
    public String toString() {
        String s="";
        for (記帳資料 st1 : a1) {
             s+=st1.toString()+"\n";
        }
        return s;
    }
    
    
    
}
