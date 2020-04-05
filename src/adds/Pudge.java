package adds;

public class Pudge implements Printable{
	
private int skill;
private int weight = 220;
private String weapon = "axe and hook";

public Pudge(int skill) {
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
	System.out.println("Pudge throws a hook");
}

}
