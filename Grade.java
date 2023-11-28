package com.mycompany.urma_project_sa;

public class Grade {
    private String courseName;
    private String grade;
    private String Assignement;
    private String comment;

    public Grade(String courseName, String Assignement , String grade , String comment) {
        this.courseName = courseName;
        this.Assignement = Assignement;
        this.comment = comment;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getGrade() {
        return grade;
    }
    
    public String getAssignement(){
        return Assignement;
    }
    public String getComment(){
      return comment; 
    }
}
