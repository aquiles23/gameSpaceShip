import java.awt.event.KeyEvent;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.lang.acl.ACLMessage;

public class AgentKeyListener extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4740039871776088967L;
	public Application game;
	
	protected void setup() {
		// Registrando o agente no DF 
		DFAgentDescription dfd = new DFAgentDescription(); 
		dfd.setName(getAID()); 
		ServiceDescription sd = new ServiceDescription(); 
		sd.setName(getName()); 
		sd.setType("AgentKeyListener"); 
		dfd.addServices(sd); 
		
		// implementação
		try { 
			DFService.register(this, dfd);
			
			// Criando o behaviour 
			
		} catch(FIPAException e) { 
			e.printStackTrace();
			doDelete();
		}
	}
	
	// Pegará o botão apertado e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	public void keyPressed(KeyEvent e) throws InterruptedException {
		addBehaviour(new OneShotBehaviour() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void action() {
				int key = e.getKeyCode();
				
				// Set speed to move to the left
		        if (key == KeyEvent.VK_LEFT) { 
		        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("esq");
		        	send(request);
		        }

		        // Set speed to move to the right
		        if (key == KeyEvent.VK_RIGHT) {
		        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("dir");
		        	send(request);
		        }
			}
		});
		
	}
	
	// Pegará o botão soltado, e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	public void keyReleased(KeyEvent e) {
		addBehaviour(new OneShotBehaviour() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void action() {
				int key = e.getKeyCode();

		        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
		            ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("stop");
		        	send(request);
		        }
			}
			
		});
	}
	
	

}
