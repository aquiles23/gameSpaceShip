import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;

public class startApplicationAgent extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5052316128910232730L;
	public Application game;
	
	protected void setup() { 
		
		// Registrando o agente no DF 
		DFAgentDescription dfd = new DFAgentDescription(); 
		dfd.setName(getAID()); 
		ServiceDescription sd = new ServiceDescription(); 
		sd.setName(getName()); 
		sd.setType("startApplicationAgent"); 
		dfd.addServices(sd); 
		
		// implementação
		game = new Application();
		game.main();  //inicia interface grafica e tudo no jogo.
		try { 
			DFService.register(this, dfd);
		} catch(FIPAException e) { 
			e.printStackTrace();
			doDelete();
		}
	}
		
	protected void takeDown() { 
		// Retira registro no DF 
		try { 
			DFService.deregister(this); 
		} catch(FIPAException e) { 
			e.printStackTrace(); 
		}
	}
}
