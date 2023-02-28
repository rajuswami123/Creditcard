package org.example;

class Cc implements Cloneable {
    String name;
    int num;
    String exp;

    public Cc(String name, int num, String exp) {
        this.name = name;
        this.num = num;
        this.exp = exp;
    }

    public boolean equals(Object ob2) {
        if (ob2 == this) return true;
        if (!(ob2 instanceof Cc)) {
            return false;
        }
        Cc emp = (Cc) ob2;
        return emp.name == (this.name) && emp.num == this.num && emp.exp == this.exp;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
