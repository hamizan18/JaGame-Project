import javax.swing.*;
import java.awt.*;

public class BattlePanel {
    JFrame frame;

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

        hpPanel.add(hpLabel1);
        hpPanel.add(hpLabel2);

        atkBtn.addActionListener(e -> {
            hero1.BasicAttack(enemy1);
            hpLabel2.setText("HP: " + enemy1.getHp());
            hero1.checker(enemy1);
        });

        healBtn.addActionListener(e -> {
            hero1.Healing(hero1);
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