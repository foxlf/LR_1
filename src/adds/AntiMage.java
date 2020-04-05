package adds;

public class AntiMage {
	
	private int skill;
	private int weight = 65;
	private String weapon = "blades";

	public AntiMage(int skill) {
		super();
		this.skill = skill;
	}

	public int getName() {
		return skill;
	}

	public void setName(int skill) {
		this.skill = skill;
	}

	public void print() {
		if(skill == 1)
		System.out.println("Anti-Mage burns your mana");
	}

}
