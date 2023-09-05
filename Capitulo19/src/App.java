import entities.Courses;
import entities.Customer;
import entities.Teacher;
import services.Exercices;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class App {
    public static void main(String[] args) throws Exception {
        Set<Teacher> list = Exercices.geracaoCurso();
        Scanner sc = new Scanner(System.in);
        

        // Converting LnkedHashMap to Array
        Teacher[] teacherArrayList = new Teacher[list.size()];
        teacherArrayList = list.toArray(teacherArrayList);


        System.out.println("Selecione o professor desejado:");
        byte i = 1;
        for(Teacher t : teacherArrayList){
            System.out.print(i + " Professor: " + t.getName() + "\n");
            i++;
        }
        System.out.println(i + " Sair");
        byte esc = sc.nextByte();


        while(esc != i){
            if(esc > i || esc <= 0){
                System.out.println("Selecione uma opção válida");
            }else{
                Set<Courses> c = teacherArrayList[esc - 1].getCoursesTeacher();
                Set<Customer> studentList = new LinkedHashSet<>();



                for(Courses st : c){
                    System.out.println("Course:" + st.getName());

                    studentList.addAll(st.printNames());

                    
                   
                    System.out.println();
                }                

                System.out.println("Total de alunos do professor: "  + studentList.size());
                break;

              
            }

        }

        System.out.println("Sistema fechado");
        sc.close();
    }
}
