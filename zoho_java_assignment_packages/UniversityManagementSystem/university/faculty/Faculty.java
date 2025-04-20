package university.faculty;

import university.courses.Course;

public class Faculty {
    private String name;
    private int facultyId;
    private Course assignedCourse;

    public Faculty(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public void assignCourse(Course course) {
        this.assignedCourse = course;
    }

    public String getName() {
        return name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    @Override
    public String toString() {
        String courseInfo = (assignedCourse != null) ? assignedCourse.toString() : "No course assigned";
        return "Faculty: " + name + " (ID: " + facultyId + "), Teaching: " + courseInfo;
    }
}
