public class Employee {
    
    public String Name;
    public double GrossSalary;
    public double Tax;
    
    public Employee() {
    }
    
    public Employee(String name, double grossSalary, double tax) {
        Name = name;
        GrossSalary = grossSalary;
        Tax = tax;
    }


    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage / 100;
        System.out.println("Salário aumentado!!!");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Employee \nName = " + Name + ", \nGrossSalary = " + GrossSalary + ", \nTax=" + Tax + ", \nGross Salary = "
        + this.NetSalary() + "";
    }


}
