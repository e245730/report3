import jp.ac.uryukyu.ie.e245730.*;
//プッシュ練習2
public class Main {
    public static void main(String[] args){
        //Hero hero = new Hero("勇者", 10, 5);
       // Enemy enemy = new Enemy("スライム", 6, 3);
        LivingThing hero = new LivingThing("勇者１", 10, 5
        );
        LivingThing enemy = new LivingThing("スライム", 6, 3);
        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}