package entities;


public class Register {

    private String name;
    private String localDate;


    public Register() {
    }

    public Register(String name, String localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLocalDate() {
        return localDate;
    }
    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + ",\nLocalDate: " + localDate + ".\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Register other = (Register) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    
    
    
}
