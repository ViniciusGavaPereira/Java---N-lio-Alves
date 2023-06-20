public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public Student() {
    }

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3 + "]";
    }


    public void finalGrade(){
        double notaFinal = grade1 * 0.30 + grade2 * 0.35 + grade3 * 0.35;
        
        System.out.printf("Nota final: %.1f\n", notaFinal);

        
        if(notaFinal >= 6){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
    }


}
