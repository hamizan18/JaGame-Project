import javax.swing.*;
import java.awt.*;

public class Fighter {
    private String name;
    private int maxHp;
    private int hp;
    private int attack;
    private int heal;

    public Fighter(String name, int maxHp, int attack, int heal) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attack = attack;
        this.heal = heal;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public void BasicAttack(Fighter target) {
            target.hp -= getAttack();
            if (target.hp < 0) {
                target.hp = 0;
        }
    }

    public void checker(Fighter target) {
        if (target.hp <= 0){
            JOptionPane.showMessageDialog(
                null,
                "YOU WIN!",
                "Victory",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void Healing(Fighter target) {
        target.hp += heal;
        if (target.hp > maxHp) target.hp = target.maxHp;
        if (target.hp <= 0) {
            target.hp = 0;
        }
    }
}