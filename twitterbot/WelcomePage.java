import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("HELLO :)");
    JButton logoutButton = new JButton("Logout");

    WelcomePage(String userid) {

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 15));
        welcomeLabel.setText("Hello " + userid);
        frame.add(welcomeLabel);

        frame.add(logoutButton);
        logoutButton.setBounds(150, 100, 100, 25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(logoutButton, "Are you sure?");
                IDandPasswords idandPasswords = new IDandPasswords();

                if (confirm == JOptionPane.YES_OPTION) {
                    frame.dispose();
                    LogInPage login = new LogInPage(idandPasswords.getLoginInfo());
                    login.frame.setVisible(true);
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
