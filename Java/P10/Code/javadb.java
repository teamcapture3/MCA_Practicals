import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class javadb extends javax.swing.JFrame {
private static final long serialVersionUID = 1L;
public javadb() {
initComponents();
}
Connection con;
PreparedStatement pst1,pst2,pst3,pst4;
private void initComponents() {
jPanel1 = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
jPanel2 = new javax.swing.JPanel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jTextField1 = new javax.swing.JTextField();
jTextField2 = new javax.swing.JTextField();
jTextField3 = new javax.swing.JTextField();
jTextField4 = new javax.swing.JTextField();
jTextField5 = new javax.swing.JTextField();
jTextField6 = new javax.swing.JTextField();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
addWindowListener(new java.awt.event.WindowAdapter() {
@Override
public void windowOpened(java.awt.event.WindowEvent evt)
{
formWindowOpened(evt);
}
});
jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28));
jLabel1.setText("DATABASE OPERATIONS");
jLabel1.setForeground(Color.darkGray);
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(76, 76, 76)
.addComponent(jLabel1)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel1)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
jButton1.setText("SELECT");
jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
    jButton1ActionPerformed(evt);
});
jButton2.setText("UPDATE");
jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
    jButton2ActionPerformed(evt);
});
jButton3.setText("DELETE");
jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
    jButton3ActionPerformed(evt);
});
jButton4.setText("INSERT");
jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
    jButton4ActionPerformed(evt);
});
jTextField1.setText("Please enter the id for name");
jTextField1.addActionListener((java.awt.event.ActionEvent evt) -> {
    jTextField1ActionPerformed(evt);
});
jTextField2.setText("Please enter id");
jTextField3.setText("Please enter the id to be deleted");
jTextField4.setText("Name to be updated");
jTextField5.setText("Enter the id");
jTextField6.setText("Enter the username");
javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addGap(44, 44, 44)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton1)
.addComponent(jButton2)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,false)
.addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
Short.MAX_VALUE)
.addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
Short.MAX_VALUE)))
.addGap(24, 24, 24)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField1)
.addComponent(jTextField3)
.addGroup(jPanel2Layout.createSequentialGroup()
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jTextField4))
.addGroup(jPanel2Layout.createSequentialGroup()
.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jTextField6))
)));
jPanel2Layout.setVerticalGroup(
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addGap(43, 43, 43)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton1)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton3)
.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton4)
.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(32, Short.MAX_VALUE))
);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 0, Short.MAX_VALUE))
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.PREFERRED_SIZE) .addContainerGap(19,
Short.MAX_VALUE))
);
pack();
setLocationRelativeTo(null);
}
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
{
try
{
int id=Integer.parseInt(jTextField3.getText());
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical10?serverTimezone=UTC","root","");
String query3="DELETE FROM users WHERE id = ?";
pst3 = con.prepareStatement(query3);
pst3.setInt(1,id);
int r3=pst3.executeUpdate();
if(r3==1){
JOptionPane.showMessageDialog(null,"The details have been deleted");
}
else
JOptionPane.showMessageDialog(null,"Some connection issue");
}
catch (ClassNotFoundException | SQLException ex)
{
Logger.getLogger(javadb.class.getName()).log(Level.SEVERE, null, ex);
}
}
private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
{
try
{
int id=Integer.parseInt(jTextField1.getText());
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical10?serverTimezone=UTC","root","");
String query="select username from users where id = ?";
pst1 = con.prepareStatement(query);
pst1.setInt(1,id);
ResultSet r=pst1.executeQuery();
while(r.next()){
JOptionPane.showMessageDialog(null,"The username of id : "+id+" is : "+r.getString(1));
}
}
catch (ClassNotFoundException | SQLException ex)
{
Logger.getLogger(javadb.class.getName()).log(Level.SEVERE, null, ex);
}
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
{
try
{
int id=Integer.parseInt(jTextField2.getText());
String updatedName=jTextField4.getText();
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical10?serverTimezone=UTC","root","");
String query2="update users set username = ? where id = ?";
pst2 = con.prepareStatement(query2);
pst2.setInt(2,id);
pst2.setString(1,updatedName);
int r1=pst2.executeUpdate();
if(r1==1){
JOptionPane.showMessageDialog(null,"Username has been updated");
}
else
JOptionPane.showMessageDialog(null,"Some connection issue");
}
catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(javadb.class.getName()).log(Level.SEVERE, null, ex);
}
}
private void formWindowOpened(java.awt.event.WindowEvent evt) {}
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
{
try {
int ID=Integer.parseInt(jTextField5.getText());
String name=jTextField6.getText();
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical10?serverTimezone=UTC","root","");
String query2="INSERT INTO users VALUES(" + ID + ",'" + name + "')";
pst4 = con.prepareStatement(query2);
int r1=pst4.executeUpdate();
if(r1==1){
JOptionPane.showMessageDialog(null,"Records inserted");
}
else
JOptionPane.showMessageDialog(null,"Some connection issue");
}
catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(javadb.class.getName()).log(Level.SEVERE, null, ex);
}
}
public static void main(String args[])
{
try
{
for (javax.swing.UIManager.LookAndFeelInfo info :
javax.swing.UIManager.getInstalledLookAndFeels())
{
if ("Nimbus".equals(info.getName()))
{
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
}
catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
{
java.util.logging.Logger.getLogger(javadb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
java.awt.EventQueue.invokeLater(() -> {
    new javadb().setVisible(true);
});
}
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JLabel jLabel1;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JTextField jTextField1;
private javax.swing.JTextField jTextField2;
private javax.swing.JTextField jTextField3;
private javax.swing.JTextField jTextField4;
private javax.swing.JTextField jTextField5;
private javax.swing.JTextField jTextField6;
}