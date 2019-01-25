package practice13.common;

public class SuperHero extends Hero{

Item equipment;
	public SuperHero(int hp, int power, int endurance) {
		super(25,10,7);

	}
	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */
	public int attack() {
		int attackDamage = super.attack() + equipment.additionalDamage;
		return attackDamage;
	}

	public Item getEquipment() {
		return equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment=equipment;
	}

}

