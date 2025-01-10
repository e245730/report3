import jp.ac.uryukyu.ie.e245730.*;
//プッシュ練習2
public class Main {
    public static void main(String[] args){
        //Hero hero = new Hero("勇者", 10, 5);
       // Enemy enemy = new Enemy("スライム", 6, 3);
        Warrior warrior = new Warrior("勇者１", 10, 5
        );
        LivingThing enemy = new LivingThing("スライム", 6, 3);
        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);   //クラス名.関数名()でメゾットを呼び出している
            enemy.attack(warrior);                 //エネミーのアタックメゾット
        }
        System.out.println("戦闘終了");
    }
}