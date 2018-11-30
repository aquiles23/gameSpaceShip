import java.awt.event.KeyEvent;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
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
			keyPressed();
			keyReleased();
			
		} catch(FIPAException e) { 
			e.printStackTrace();
			doDelete();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Pegará o botão apertado e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	
	// public void keyPressed(KeyEvent e) throws InterruptedException {
	public void keyPressed() throws InterruptedException {
		addBehaviour(new CyclicBehaviour() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void action() {
				// int key = e.getKeyCode();
				int x = (int)(Math.random()*3);
				
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
				
				// Set speed to move to the left
		        // if (key == KeyEvent.VK_LEFT) {
				if(x == 1) {
		        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("esq");
		        	request.addReceiver(new AID("alien", AID.ISLOCALNAME));
		        	send(request);
		        }

		        // Set speed to move to the right
		        // if (key == KeyEvent.VK_RIGHT) {
				if(x == 2) {
		        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("dir");
		        	request.addReceiver(new AID("alien", AID.ISLOCALNAME));
		        	send(request);
		        }
			}
		});
		
	}
	
	// Pegará o botão soltado, e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	// public void keyReleased(KeyEvent e) {
	public void keyReleased() {
		// addBehaviour(new OneShotBehaviour() {
		addBehaviour(new CyclicBehaviour() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void action() {
				// int key = e.getKeyCode();
				
				try { Thread.sleep (1000); } catch (InterruptedException ex) {}
				
				int x = (int)(Math.random()*2);
		        // if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
				if (x == 1) {
		            ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
		        	request.setContent("stop");
		        	request.addReceiver(new AID("alien", AID.ISLOCALNAME));
		        	send(request);
		        }
			}
			
		});
	}
	
	

}
