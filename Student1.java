package ExceptionandCollection;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException() {
        super("Age is not within the range of 15 to 21");
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name is not valid");
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException();
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException();
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

      public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException();
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

 public class Student1 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Sandhiya", 18, "Computer Science");
            System.out.println("Student created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
