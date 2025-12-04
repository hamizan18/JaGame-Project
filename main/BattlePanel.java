import javax.swing.*;
import java.awt.*;

public class BattlePanel {
    JFrame frame;
    int lastHit = 0;

    JButton atkBtn = new JButton("Attack");
    JButton healBtn = new JButton("Heal");
    JPanel btnPanel = new JPanel();
    JPanel hpPanel = new JPanel();
    Player hero1 = new Player("Alice", 100, 15, 10);
    Enemy enemy1 = new Enemy("Slime", 100, 3, 2);

    public BattlePanel() {
        frame = new JFrame("Mijan no Windowsu");
        atkBtn = new JButton("Attack");
        healBtn = new JButton("Heal");
        btnPanel = new JPanel();
        hpPanel = new JPanel();

        final int[] hp = {hero1.getHp(), enemy1.getHp()};

        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        hpPanel.setLayout(new GridLayout(1, 2));
        JLabel hpLabel1 = new JLabel("HP: " + hero1.getHp(), SwingConstants.CENTER);
        JLabel hpLabel2 = new JLabel("HP: " + enemy1.getHp(), SwingConstants.CENTER);

        hpPanel.setBackground(new Color(0, 180, 235));
        hpPanel.add(hpLabel1);
        hpPanel.add(hpLabel2);
        atkBtn.setFont(new Font("Verdana", Font.BOLD, 18));
        healBtn.setFont(new Font("Verdana", Font.BOLD, 18));

        btnPanel.setFont(new Font("Arial", Font.BOLD, 14));

        atkBtn.addActionListener(e -> {
            if (lastHit == 0) {
                if (hero1.getHp() <= 0 || enemy1.getHp() <= 0) {
                    lastHit = 1;
                }
                hero1.BasicAttack(enemy1);
            }
            if (enemy1.getHp() > 0) enemy1.BasicAttack(hero1);
            hpLabel2.setText("HP: " + enemy1.getHp());
            hpLabel1.setText("HP: " + hero1.getHp());
            hero1.checker(enemy1);
        });

        healBtn.addActionListener(e -> {
            if (lastHit == 0) {
                if (hero1.getHp() <= 0 || enemy1.getHp() <= 0) {
                    hero1.Healing(hero1);
                }
            }
            if (enemy1.getHp() > 0) enemy1.BasicAttack(hero1);
            hpLabel1.setText("HP: " + hero1.getHp());
        });

        btnPanel.setLayout(new GridLayout(2, 1, 5, 5));

        frame.add(btnPanel, BorderLayout.WEST);
        frame.add(hpPanel, BorderLayout.NORTH);

        btnPanel.add(atkBtn);
        btnPanel.add(healBtn);

        frame.setVisible(true);
    }
}