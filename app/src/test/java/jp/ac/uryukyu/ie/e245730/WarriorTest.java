package jp.ac.uryukyu.ie.e245730;

import org.junit.jupiter.api.Test;  //＠testを使用可能にするためのコード
import static org.junit.jupiter.api.Assertions.*;  //アサーションメゾットをインポートして使用可能にしている
//import static org.junit.jupiter.api.DynamicTest.stream; //自動生成されていたが何かわからない

//testなので内部で完結するからpublicにしなくて良い
class WarriorTest {
     /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを期待・これを検証する。
     */
    @Test
    void attackWithWeponSkillTest(){
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
       //三回攻撃してダメージを確認
       for (int i=0;i<3;i++){
        int enemyHpBeforesAttack = slime.getHitPoint(); //攻撃前のhp
        demoWarrior.attackWithWeponSkill(slime);       //攻撃
        int enemyHpAfterAttack = slime.getHitPoint();  //攻撃後のhp ここが違う可能性ある

        int expectDamage = (int)(demoWarrior.getAttack()*1.5); //期待されるダメージ
        int actualDamage =  enemyHpBeforesAttack - enemyHpAfterAttack; //実際のダメージを計算する
        assertEquals(expectDamage, actualDamage);

       
    }
    
}
}
