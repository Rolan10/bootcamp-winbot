package modelos;

public class Team {
	
	private Group team;
	private int puntos;
	public Team() {
		
	}
	public Team(Group t) {
		this.team = t;
		this.puntos = t.calcularPuntos();
	}
	public Group getTeam() {
		return team;
	}
	public void setTeam(Group team) {
		this.team = team;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		String s =""+ team.getName();
		s += " - " + this.puntos;
		return s;
	}
	
	/*
	@Override
	public int compareTo(Object team) {
		return this.puntos - ((Team)team).getPuntos();
	}//*/

}
