import java.util.*;
class Course extends University {
    private String courseName;
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public void addCourse(Course course) {
        super.addCourse(course);
    }

    public void addGrade(String name, int grade) {
        grades.put(name, grade);
    }

    public String topStudent() {
        int maxValue= 0;
        String maxKey=null;
        for (Map.Entry<String,Integer>entry : grades.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;
    }
}
