package com.mycompany.urma_project_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccessDatabase {
    public static List<Grade> getStudentGrades(String username, String urmaId) {
        List<Grade> grades = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sjanr\\Desktop\\Oracle\\sqlite-tools\\sqlite-tools\\databases\\URMAapp.db")) {
            String query = "SELECT course, assignement , grade , comment  FROM student_grade WHERE student_name = ? AND urma_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, urmaId);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String courseName = resultSet.getString("course");
                        String Assignement = resultSet.getString("assignement");
                        String grade = resultSet.getString("grade");
                        String note = resultSet.getString("comment");

                        Grade studentGrade = new Grade(courseName,Assignement, grade, note);
                        grades.add(studentGrade);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();  // Handle the exception according to your needs
                }
            } catch (SQLException e) {
                e.printStackTrace();  // Handle the exception according to your needs
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Handle the exception according to your needs
        }

return grades;
    }
}
