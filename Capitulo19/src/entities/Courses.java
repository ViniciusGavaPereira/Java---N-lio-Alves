package entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Courses {

        private String courseName;
        private Set<Customer> students = new LinkedHashSet<>();

        public Courses() {

        }

        public Courses(String name) {
            this.courseName= name;
            this.students = new LinkedHashSet<Customer>();
        }

        public String getName() {
            return courseName;
        }

        public void setName(String name) {
            this.courseName= name;
        }

   
        public Set<Customer> getStudents() {
            return students;
        }

        public void setStudents(Customer students) {
            this.students.add(students);
        }


        
        @Override
        public String toString() {
            return "Courses [name=" + courseName+ ", students=" + students + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
            result = prime * result + ((students == null) ? 0 : students.hashCode());
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
            Courses other = (Courses) obj;
            if (courseName == null) {
                if (other.courseName != null)
                    return false;
            } else if (!courseName.equals(other.courseName))
                return false;
            if (students == null) {
                if (other.students != null)
                    return false;
            } else if (!students.equals(other.students))
                return false;
            return true;
        }

        

        
}
