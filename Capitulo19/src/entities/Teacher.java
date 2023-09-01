package entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Teacher {

 
    private String name;
    private Set<Courses> coursesList= new LinkedHashSet<Courses>();

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
        this.coursesList = new LinkedHashSet<Courses>();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Courses> getCoursesTeacher() {
        return coursesList;
    }

    public Courses getCourse(String coursesFromTeacher){
        for(Courses cs :  this.getCoursesTeacher()){
            if(cs.getName().equals(coursesFromTeacher)){
                return cs;
            }
        }
        return null;
    }

    public void setStudentToCourse(String coursesFromTeacher, Customer customer){

            Courses course = this.getCourse(coursesFromTeacher);
            if(course != null){
                course.setStudents(customer);
            }else{
                System.out.println("Course " + coursesFromTeacher +  " not founded");
            }
            
    }

    public void setCoursesTeacher(String courseName) {
        this.coursesList.add(new Courses(courseName));
    }

    

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", coursesList=" + coursesList + "]";
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((coursesList == null) ? 0 : coursesList.hashCode());
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
        Teacher other = (Teacher) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (coursesList == null) {
            if (other.coursesList != null)
                return false;
        } else if (!coursesList.equals(other.coursesList))
            return false;
        return true;
    }


    
}
