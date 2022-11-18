package controladores;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

import modelos.Group;
import modelos.Team;

public class Puntos {
	static ArrayList<Group> groups = new ArrayList<Group>();
	static ReadJSON read = new ReadJSON();
	
	
	
	static public void InitList() {
		groups.clear();
		read.InitList(groups);
	}
	
	static public String Mensaje() {
		String s = "";
		
		ArrayList<Group> mensaje = new ArrayList<Group>();
		mensaje.add(groups.get(0));
		for(int i=0;i < groups.size(); i++) {
			
			if(mensaje.get(0).calcularPuntos() ==  groups.get(i).calcularPuntos()) {
				
				mensaje.add(groups.get(i));
			}
			if(mensaje.get(0).calcularPuntos() < groups.get(i).calcularPuntos()) {
				mensaje.clear();
				mensaje.add(groups.get(i));
			}
			
		}int ini=0;
		for(int i = 0; i < mensaje.size();i++) {
		
			if(mensaje.size()>1&& ini==0) {
				s+="Empates entre: \n ";
				ini++;
			}else if(ini==0){
			s+="Los que van en cabeza son: ";}
			s+= mensaje.get(i).getName()+" con "+ mensaje.get(i).calcularPuntos() +" puntos \n";
		}
		
		return s;
	}
	
	//Info del team buscado
	static public String MensajeTeam(String nombre) {
		String s = "";
		boolean encontrado = false;
		int i = 0;
		while(i < groups.size() && !encontrado) {
			if(groups.get(i).getName().equals(nombre)) encontrado = true;
			else i++;
		}
		
		return groups.get(i).toString();
	}
	
	//Equipos Ordenados
	static public String MensajeTabla() {
		//Los ordenamos
		ArrayList<Team> Teams = new ArrayList<Team>();
		
		for(Group g : groups) { Teams.add(new Team(g)); }
		Collections.sort(Teams, new Comparator<Team>() {
			public int compare(Team t1, Team t2) {
				return t2.getPuntos()-t1.getPuntos();
			}
		});
		
		//Lo mostramos
		String s = "RANKING DE EQUIPOS\n";
		s += "\t\t----------------\n\n";
		int cnt = 0;
		for(Team t : Teams) {
			if(cnt++ == 0) s += t.toString() +"🏆\n";	//Windows+. para cambiar emoticono
			else if(cnt == Teams.size()) s += t.toString() +"💩\n";
			else s += t.toString()+"\n";
		}
		
		return s;
	}
	
	
	static public void main(String [] args) {
		
		InitList();
		System.out.println(Mensaje());
	}
}
