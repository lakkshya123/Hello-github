
package newpackage;

import java.util.Objects;

public class Emp implements Comparable {
    private int age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emp other = (Emp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Emp{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }

    @Override
    public int compareTo(Object o) {
    double a = this.sal;
    Emp e = (Emp)o;
    double b =e.sal;
    if (a>b)
            return 1;
            else if (b>a)
                return -1;
            else
                return 0;
            
    }
    
}
