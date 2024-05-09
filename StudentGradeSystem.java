package ExceptionandCollection;

import java.util.HashMap;

public class StudentGradeSystem {
    private HashMap<String, Integer> studentGrades;

        public StudentGradeSystem() {
        studentGrades = new HashMap<>();
    }

  
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

   
    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

        public void displayGradeByName(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Grade of " + name + ": " + grade);
        } else {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    
    public static void main(String[] args) {
        StudentGradeSystem gradeSystem = new StudentGradeSystem();


        	gradeSystem.addStudent("Sanjay", 90);
        	gradeSystem.addStudent("Vicky", 85);
        	gradeSystem.addStudent("Guru", 95);

               	gradeSystem.displayGradeByName("Sanjay");
               	gradeSystem.displayGradeByName("Vicky");
	       	gradeSystem.removeStudent("Guru");
               	gradeSystem.displayGradeByName("Guru");
    }
}
