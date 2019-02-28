/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.HashSet;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Emp> hs = new HashSet();
       
         Emp e = new Emp(24,"amit",50000);
          Emp f = new Emp(24,"amit",50000);
           Emp g = new Emp(21,"amit",50000);
            Emp h = new Emp(22,"amit",50000);
            System.out.println(hs.add(e));
            System.out.println(hs.add(f));
    }
    
}
