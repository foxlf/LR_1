package adds;

public class Techies {

	private int skill;
	private int weight = 90;
	private String weapon = "bazooka";

	public Techies(int skill) {
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
		System.out.println("Techies set mines");
	}
}
