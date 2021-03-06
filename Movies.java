/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movie.seat.booking.system;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import static movie.seat.booking.system.BookSeat.DateTime;

/**
 *
 * @author Me
 */
public class Movies extends javax.swing.JFrame {

    /**
     * Creates new form Movies
     */
    public Movies() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        MovieList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movies");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MovieList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Type", "Movie Name", "Date & Time", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MovieList.getTableHeader().setResizingAllowed(false);
        MovieList.getTableHeader().setReorderingAllowed(false);
        MovieList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MovieListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MovieList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MovieListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovieListMouseClicked
        var MovieType =  MovieList.getValueAt(MovieList.getSelectedRow(), 0);
        var MovieName = MovieList.getValueAt(MovieList.getSelectedRow(), 1);
        BookSeat bookseat = new BookSeat();
        bookseat.MType.setText(MovieType.toString());
        bookseat.MName.setText(MovieName.toString());
        bookseat.setVisible(true);
    }//GEN-LAST:event_MovieListMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RefreshTable();
    }//GEN-LAST:event_formWindowOpened
    public static void RefreshTable(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) MovieList.getModel();
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movieseatbooking","root","root");
            Statement stmt = con.createStatement();
            ResultSet RS = stmt.executeQuery("Select * from movie Order by Date,Time asc");
            int ctr = 0;
            while(RS.next()){
                    String mtype = RS.getString("MovieType");
                    String mname = RS.getString("MovieName");
                    var date = RS.getDate("Date");
                    var time = RS.getTime("Time");
                    String dateSet = new SimpleDateFormat("MMM d, YYYY").format(date);
                    String timeSet = new SimpleDateFormat("hh:mm a").format(time);
                    String datetime =  dateSet + " " + timeSet;
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMM d, YYYY hh:mm a");
                    String DateTimeNow = DTF.format(now);
                    String designation = RS.getString("Designation");
         
                   if(datetime.compareTo(DateTimeNow)>=0){
                       tableModel.addRow(new Object[] {mtype,mname,dateSet+" "+timeSet,designation});
                        ctr++;
                   } 
                   
                } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Movies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        RefreshTable();
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movies().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable MovieList;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
