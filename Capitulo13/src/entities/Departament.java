package entities;

public class Departament {
    String name;

    public Departament() {
   
    }

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departament [name=" + name + "]";
    }

    
}
