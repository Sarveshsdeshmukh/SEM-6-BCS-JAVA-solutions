import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class empFrame extends JFrame implements ActionListener {
    Connection conn = null;
    PreparedStatement pstmt = null;
    JPanel jp;
    JTextField jtf1, jtf2, jtf3, jtf4;
    JLabel jl1, jl2, jl3, jl4;
    JButton jb;

    empFrame() {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.10/examdb21", "examdb21", "");
            pstmt = conn.prepareStatement("Insert into emp values(?,?,?,?)");

            setSize(400, 400);
            setTitle("Emp Table");
            setLocationRelativeTo(null);

            jp = new JPanel();
            jp.setLayout(new GridLayout(4, 2));

            jl1 = new JLabel("Eno");
            jp.add(jl1);
            jtf1 = new JTextField(40);
            jp.add(jtf1);

            jl2 = new JLabel("E Name");
            jp.add(jl2);
            jtf2 = new JTextField(40);
            jp.add(jtf2);

            jl3 = new JLabel("Designation");
            jp.add(jl3);
            jtf3 = new JTextField(40);
            jp.add(jtf3);

            jl4 = new JLabel("Salary");
            jp.add(jl4);
            jtf4 = new JTextField(40);
            jp.add(jtf4);

            add(jp, BorderLayout.CENTER);

            jb = new JButton("Submit");
            add(jb, BorderLayout.SOUTH);
            jb.addActionListener(this);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(this, "Driver not found:" + cnfe, "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(this, "SQLException: " + sqle.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Exception: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button click event here
    }

    public static void main(String[] args) {
        new empFrame();
    }
}
