import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CursorJiggler {
    public static void main(String[] args) throws Exception {
        int time;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        Robot robot = new Robot();
        JFrame f = new JFrame("Cursor Jiggler");
        JLabel label = new JLabel("Time interval (in seconds): ");
        JLabel creator = new JLabel("Created by Parag Nirwan");
        String[] timeIntervals = {"OFF", "5", "10", "20", "30", "45", "60", "120", "180", "300"};
        JComboBox<String> jComboBox = new JComboBox<>(timeIntervals);

        // Icon
        ImageIcon icon = new ImageIcon("src/assets/CJ.png");
        f.setIconImage(icon.getImage());

        Random random = new Random();

        // GUI Part
        f.setSize(300, 200);
        f.setLayout(null);
        label.setBounds(25, 50, 200, 40);
        creator.setBounds(70, 100, 200, 100);
        f.add(label);
        f.add(creator);
        // JCombo
        jComboBox.setBounds(200, 60, 50, 20);
        f.add(jComboBox);

        f.setVisible(true);
        f.setResizable(false);
        while (true) {
            String s = jComboBox.getItemAt(jComboBox.getSelectedIndex());

            if (s.equals("OFF")) {
                continue;
            } else {
                time = Integer.parseInt(s);
                time = time * 1000;
            }
            robot.mouseMove(random.nextInt(width), random.nextInt(height));
            Thread.sleep(time);
        }

    }
}
