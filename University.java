import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    protected Map<String, Integer> grades;

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public int numberOfStudents(){
        return students.size();
    }

    public void getAllStudents(){
        for (Student student : students){
            System.out.println("Name: " +student.getName());
        }

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int numberOfCourses(){
        return courses.size();
    }
    public void getAllCourses(){
        for (Course course : courses){
            System.out.println("Course Name: "+course.getCourseName());
        }
    }

    public void addGrade(String courseName, int grade) {
      grades.put(courseName,grade);
                return;
        }
    }







