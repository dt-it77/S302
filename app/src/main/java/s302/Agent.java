package s302;

import java.util.*;

public class Agent {
    //observable
	
	private List<Observador> agenciesBorsa = new ArrayList<Observador>();
	
	private HashMap<String,Double> valorBroker = new HashMap<String,Double>();
	
	public HashMap<String,Double> getStatus() {
		return valorBroker;
		
	}
	public void setValue(String name, double value) {
		this.valorBroker.put(name, value);
		notityToAll();
	}
	public void add(Observador observador) {
		agenciesBorsa.add(observador);
	}
	public void remove(Observador observador) {
		agenciesBorsa.remove(observador);
	}

	public void notityToAll() {
		agenciesBorsa.forEach(x->x.update());
	}
}