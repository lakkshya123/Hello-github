/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class UseEmp {
    public static void main(String[] args) {
        ArrayList<Emp>empList=new ArrayList<>();
        Emp e = new Emp(24,"Rav",50000.0);
        Emp f = new Emp(34,"Raiv",40000.0);
        Emp g = new Emp(24,"Raghu",30000.0);
        Emp h = new Emp(24,"Rashi",20000.0);
        empList.add(e);
        empList.add(f);
    empList.add(g);
    empList.add(h);
    for(Emp obj:empList)
    {
            System.out.println(obj);
    }
    System.out.println("enter emp details to be removed");
    Scanner kb = new Scanner(System.in);
    System.out.println("enterage");
    int a = kb.nextInt();
   System.out.println("enter name");
   String s = kb.next();
   System.out.println("enter sal");
   double d = kb.nextDouble();
   Emp x = new Emp(a,s,d);
   System.out.println("Emp remove"+empList.remove(x));
        System.out.println("before sorting");
        for ( Emp obj:empList)
            System.out.println(empList);
        System.out.println("After sorting");
        for(Emp obj:empList)
        {
            System.out.println(obj);
        }
        }
        
        
    
    }
    

