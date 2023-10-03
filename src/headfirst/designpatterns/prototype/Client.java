package headfirst.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {

		for (Monster monster : MonsterRegistry.getMonsterList()) {
			Monster coolMonster = getCoolMonster(monster);
			System.out.println(coolMonster);
		}


	}
	
	public static Monster getCoolMonster(Monster p) {
		// This code doesn't know or care what the concrete type of p is
		Monster coolMonster = null;
		try {
			coolMonster = p.copy();
			// do something useful with coolMonster
			coolMonster.setName(String.format("The cool %s",p.name));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return coolMonster;
	}
}