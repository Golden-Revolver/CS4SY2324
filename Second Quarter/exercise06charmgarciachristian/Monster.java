package exercise06charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
import java.util.ArrayList;

public class Monster {
    protected final String name, type, strongAgainst, weakAgainst;
    protected int maxHP, hp, atk, def, atkBoost, defBoost, xp, lvl;
    protected boolean guard, charge;
    protected static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = hp = m;
        atk = def = base;
        atkBoost = defBoost = xp = 0;
        lvl = 1;
        monsterList.add(this);
        guard = charge = false;
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public int getAtkBoost() {
        return atkBoost;
    }
    public int getDefBoost() {
        return defBoost;
    }
    public int getLvl() {
        return lvl;
    }
    // returns in the format Monster (Lv. x)
    public String getTitle() {
        return name + " (Lv." + lvl + ")";
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        if(hp <= 0) return; // does not allow a fainted monster to attack
        int attack = atk + atkBoost;
        int defense = m.def + m.defBoost;
        
        int damage = (int) ((attack * attack)/(double)(attack + defense)); // damage is calculated as double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        if(m.guard){
            m.guard = false;
            damage *= 0.7;
        }
        if(charge){
            charge = false;
            damage *= 1.3;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
        
        System.out.println(name  + " attacked " + m.getName() +
        " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");
        gainXP(2); // every attack raises XP by 2

        if(m.getHP() <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.\n==");
            gainXP(10); // defeating a monster raises XP by 10
        }
    }
    
    public static void battle(Monster attacker, Monster defender) {  
        System.out.println("BATTLE START: " + attacker.getTitle() + 
                " VS " + defender.getTitle() + "\n==");
        attacker.special();
        defender.special();
        while (attacker.getHP() > 0 && defender.getHP() > 0) {
            attacker.attack(defender);
            defender.attack(attacker);
        }
        attacker.resetChanges();
        defender.resetChanges();
    }

    public void guard(){
        guard = true;
        System.out.println(name + " put up its guard. It will receive 30% less damage on the next attack.");
    }

    public void charge(){
        charge = true;
        System.out.println(name + " charged. Its next attack will do 30% more damage.");
    }

    public void rest(){
        hp += maxHP * 0.15;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void resetHealth(){
        hp = maxHP;
    }
    
    public void resetBoost() {
        atkBoost = defBoost = 0;
    }
    
    // resets all changes made in the battle except for XP gain
    public void resetChanges() { 
        resetHealth();
        resetBoost();
    }

    // handles all increases in XP
    private void gainXP(int i){
        xp += i;
        if(xp >= 100){
            xp %= 100;
            lvl++;
            maxHP += 5;
            hp += 5;
            atk += 2;
            def += 2;
            System.out.println(name + " levelled up to " + lvl + "!");
        }
    }
}