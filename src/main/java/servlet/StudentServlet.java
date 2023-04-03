package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Student> students = new ArrayList<>();

        Student firstStudent = new Student();
        firstStudent.setName("Дарина");
        firstStudent.setAge(20);
        firstStudent.setSex("жен");
        firstStudent.setCourse(3);

        Student secondStudent = new Student();
        secondStudent.setName("Егор");
        secondStudent.setAge(22);
        secondStudent.setSex("муж");
        secondStudent.setCourse(4);

        Student thirdStudent = new Student();
        thirdStudent.setName("Максим");
        thirdStudent.setAge(18);
        thirdStudent.setSex("муж");
        thirdStudent.setCourse(1);

        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        for (Student student : students) {
            writer.println("<p>" + student.toString() + "</p>");
        }
    }
}
