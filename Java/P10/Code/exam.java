import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Color ;
public class exam extends javax.swing.JFrame {
private static final long serialVersionUID = 1L;
public exam() {
initComponents();
}
Connection con = null;
PreparedStatement pst; String userLoggedin="";
public exam(String username) {
userLoggedin=username;
initComponents();
}
private void initComponents() {
jLabel1 = new javax.swing.JLabel(); jLabel2 = new javax.swing.JLabel(); jLabel3 = new javax.swing.JLabel(); jLabel4 = new javax.swing.JLabel(); jLabel5 = new javax.swing.JLabel(); jLabel6 = new javax.swing.JLabel(); jLabel7 = new javax.swing.JLabel(); jLabel8 = new javax.swing.JLabel(); jLabel9 = new javax.swing.JLabel(); jComboBox1 = new javax.swing.JComboBox<>(); jComboBox2 = new javax.swing.JComboBox<>(); jComboBox3 = new javax.swing.JComboBox<>(); jComboBox4 = new javax.swing.JComboBox<>(); jButton1 = new javax.swing.JButton(); jLabel10 = new javax.swing.JLabel();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); addWindowListener(new java.awt.event.WindowAdapter() {
public void windowOpened(java.awt.event.WindowEvent evt) {
	formWindowOpened(evt);
	}
});
jLabel1.setText("1");
jLabel1.setForeground(Color.white);
jLabel2.setText("2");
jLabel2.setForeground(Color.white);
jLabel3.setText("3");
jLabel3.setForeground(Color.white);
jLabel4.setText("4");
jLabel4.setForeground(Color.white);
jLabel5.setText("Central Perk is a coffee shop featured in which show?"); jLabel5.setForeground(Color.white);
jLabel6.setText("Which supernatural show is set in the fictional town of Hawkins, Indiana?"); jLabel6.setForeground(Color.white);
jLabel7.setText("In which show would you see a sonic screwdriver?"); jLabel7.setForeground(Color.white);
jLabel8.setText("Which show features Aang and Katara? "); jLabel8.setForeground(Color.white);
jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24));
jLabel9.setText("Exam");
jLabel9.setForeground(Color.white);
jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scrubs", "Friends", "Doctor Who", "Stranger Things" }));
jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor Who", "Scrubs","Friends", "Stranger Things" }));
jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stranger Things", "Doctor Who", "Scrubs", "Friends" }));
jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Friends","Doctor Who", "Scrubs", "Avatar - the last Airbender" })); jButton1.setText("SUBMIT");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); jLabel10.setText("jLabel10");
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); getContentPane().setBackground( new Color(90, 113, 148));
getContentPane().setLayout(layout); layout.setHorizontalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(35, 35, 35)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5)))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel2)
.addGap(18, 18,
18)	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel6)))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel3)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7)))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jButton1)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel4)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel8))))))
.addGroup(layout.createSequentialGroup()
.addGap(212, 212, 212)
.addComponent(jLabel9))
.addGroup(layout.createSequentialGroup()
.addGap(196, 196, 196)
.addComponent(jLabel10)))
.addContainerGap(75, Short.MAX_VALUE))
);
layout.setVerticalGroup( layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel10)
.addGap(26, 26, 26)
.addComponent(jLabel9)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) .addComponent(jLabel1)
.addComponent(jLabel5))
.addGap(18, 18, 18)
.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(27, 27, 27)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(jLabel6))
.addGap(14, 14, 14)
.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(jLabel7))
.addGap(18, 18, 18)
.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(31, 31, 31)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel4)
.addComponent(jLabel8))
.addGap(18, 18, 18)
.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jButton1)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
pack();
setLocationRelativeTo(null);
}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
String answer1,answer2,answer3,answer4; int score=0;
answer1 = jComboBox1.getSelectedItem().toString(); answer2 = jComboBox2.getSelectedItem().toString(); answer3 = jComboBox3.getSelectedItem().toString(); answer4 = jComboBox4.getSelectedItem().toString(); if(answer1.equals("Friends")){
score++;
}
if(answer2.equals("Stranger Things")){
score++;
}
if(answer3.equals("Doctor Who")){
score++;
}
if(answer4.equals("Avatar - the last Airbender")){
score++;
}
JOptionPane.showMessageDialog(this,userLoggedin+" your score is : "+score); try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical10?serverTimezone=UTC","root","");
String query="update user set score = ? where username=?"; pst = con.prepareStatement(query); pst.setInt(1,score); pst.setString(2,userLoggedin); int r=pst.executeUpdate();
if(r==1){
JOptionPane.showMessageDialog(null, "Value has been updated");
}else
JOptionPane.showMessageDialog(null, "DB connection issue");
} catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(exam.class.getName()).log(Level.SEVERE, null, ex);
}}
private void formWindowOpened(java.awt.event.WindowEvent evt) { jLabel10.setText(userLoggedin);
}public static void main(String args[]) { try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
}}
} catch (ClassNotFoundException ex) { java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) { java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) { java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) { java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new exam().setVisible(true);
}
});
}
private javax.swing.JButton jButton1;
private javax.swing.JComboBox<String> jComboBox1; private javax.swing.JComboBox<String> jComboBox2; private javax.swing.JComboBox<String> jComboBox3; private javax.swing.JComboBox<String> jComboBox4; private javax.swing.JLabel jLabel1; private javax.swing.JLabel jLabel10; private javax.swing.JLabel jLabel2; private javax.swing.JLabel jLabel3; private javax.swing.JLabel jLabel4; private javax.swing.JLabel jLabel5; private javax.swing.JLabel jLabel6; private javax.swing.JLabel jLabel7; private javax.swing.JLabel jLabel8; private javax.swing.JLabel jLabel9;
}
