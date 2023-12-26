public class Main {

  public static void main(String[] args) {
        University university = new University();
        Student studentA=new Student("Alice");
        Student studentB= new Student("Sara");
        university.addStudent(studentA);
        university.addStudent(studentB);
        Course courseA=new Course("Math");
        Course courseB=new Course("History");

        university.addCourse(courseA);
        university.addCourse(courseB);
        university.addGrade("Math",58);
        university.addGrade("Math",100);
        university.addGrade("History",70);
        courseA.addGrade("Alice",100);
        courseA.addGrade("Sara",80);
        university.getAllCourses();
        university.getAllStudents();
        System.out.println(university.numberOfCourses());
        System.out.println( courseA.topStudent());





  }

}