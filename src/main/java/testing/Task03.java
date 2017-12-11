package testing;

import java.util.ArrayList;
import java.util.Comparator;

public class Task03 {
    public static ArrayList<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        courses.add(new Course("spring", 0, 3));
        courses.add(new Course("agile", 3, 5));
        courses.add(new Course("streams", 6, 8));
        courses.add(new Course("java core", 8, 10));
        courses.add(new Course("patterns", 2, 4));
        courses.add(new Course("database", 5, 7));
        courses.add(new Course("threads", 7, 9));
        courses.add(new Course("english", 9, 11));

        courses.sort(Comparator.comparing(course -> course.end));

        int end = 0;
        for (Course course : courses) {
            if (course.start >= end) {
                System.out.format("%s -> ", course.name);
                end = course.end;
            }
        }
    }

    private static class Course {
        String name;
        int start;
        int end;

        public Course(String name, int start, int end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }
}
