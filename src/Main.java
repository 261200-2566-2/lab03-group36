/* Note: ตอนจะใส่อาวุธอย่าอัพLevelอาวุธก่อนใส่นะครับ ให้อัพเลเวลก่อนแล้วค่อยใส่ ไม่งั้นจะติดบัค:( */
public class Main {
    public static void main(String[] args) {

        RPGCharacter player1 = new RPGCharacter("AuMaster");
        Sword sw1 = new Sword("MasterPieceSword",100);
        Shield sh1 = new Shield("PainkillerShield",40);
        player1.levelUp();
        player1.displayStats();
        player1.equip(sw1);
        player1.displayStats();
        player1.takeDamage(sw1,sh1);
        player1.displayStats();
        player1.levelUp();

    }
}