package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Ludoman extends Hero {

    public Ludoman(int health, String name) {
        super(health, 0, name, SuperAbility.DICE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dice1 = RPG_Game.random.nextInt(1, 7);
        int dice2 = RPG_Game.random.nextInt(1, 7);
        if (dice1 == dice2) {
            int damage = (dice1 * dice2);
            int newHealth = boss.getHealth() - damage;
            boss.setHealth(newHealth);
            System.out.println("Ludoman бросил кости " + this.getName() + " Шеф атакует " + damage);
        } else {
            Hero hero = heroes[RPG_Game.random.nextInt(heroes.length)];
            int damage = (dice1 + dice2);
            int newHealth = hero.getHealth() - damage;
            hero.setHealth(newHealth);
            System.out.println("Ludoman бросил кости " + this.getName() + " атакует " + hero.getName() + " " + damage);
        }



    }


}
