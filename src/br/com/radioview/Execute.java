package br.com.radioview;

import br.com.radioview.window.LoginWindow;
import br.com.radioview.window.PrincipalWindow;
import br.com.radioview.window.RadioWindow;
import java.awt.EventQueue;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.UIManager;

/**
 *
 * @author bruno
 */
public class Execute {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final RadioWindow loginFrame = new LoginWindow();
        final RadioWindow principalFrame = new PrincipalWindow();
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginFrame.execute();
            	principalFrame.execute();
            }
        });
        
        
    }

}
