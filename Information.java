package com.mycompany.urma_project_sa;

public class Information {
    private static String currentUserType;  
    private static String currentUsername;   
    private static String currentUrmaId;    

    public static void startInformation(String userType, String username, String urmaId) {
        currentUserType = userType;
        currentUsername = username;
        currentUrmaId = urmaId;
    }

    public static void endInformation() {
        currentUserType = null;
        currentUsername = null;
        currentUrmaId = null;
    }

    public static String getCurrentUserType() {
        return currentUserType;
    }

    public static String getCurrentUsername() {
        return currentUsername;
    }

    public static String getCurrentUrmaId() {
        return currentUrmaId;
    }

}
