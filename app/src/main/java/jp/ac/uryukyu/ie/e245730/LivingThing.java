package jp.ac.uryukyu.ie.e245730;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

//コンストラクタ
    public LivingThing (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    //getter
    public String getName () {
        return this.name;
    }
    public int getHitPoint () {
        return this.hitPoint;
    }
    public int getAttack () {
        return this.attack;

    }
    public boolean isDead () {
        return this.dead;
    }
    
    public void attack(LivingThing opponent){
        if(!this.dead){
        int damage = (int)(Math.random() * this.attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
         opponent.wounded(damage);
        }
    }
    
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", this.name);
            
        }
    }
    
}
