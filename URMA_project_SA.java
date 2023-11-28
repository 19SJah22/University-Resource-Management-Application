package com.mycompany.urma_project_sa;

public class URMA_project_SA {

   public static void main(String args[]) {
        /* Create and display the form */
        // This will open up the LogIn frame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
}
