package s302;

public class Agencia extends Observador{
	//Observer	
	private String name;
	
	public Agencia(String name, Agent agent) {
		this.name = name;
		this.agentBorsa = agent;
		this.agentBorsa.add(this);
	}

    @Override
	public void update() {
		System.out.println("Agent" + this.name+ ", update values with company/stock ===> " + agentBorsa.getStatus());
	}
	
}