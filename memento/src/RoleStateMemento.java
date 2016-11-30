/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 0:07
 * 角色状态存储箱类
 */
public class RoleStateMemento {

	private int vitality;		// 生命力
	private int attack;		// 攻击力
	private int defense;		// 防御力

	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	public RoleStateMemento(int vitality, int attack, int defense) {
		this.vitality = vitality;
		this.attack = attack;
		this.defense = defense;
	}
}
