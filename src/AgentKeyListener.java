import java.awt.event.KeyEvent;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class AgentKeyListener extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4740039871776088967L;
	
	// Pegará o botão apertado e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	public void keyPressed(KeyEvent e) throws InterruptedException {
		int key = e.getKeyCode();
		
		// Set speed to move to the left
        if (key == KeyEvent.VK_LEFT) { 
        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
        	request.setContent("esq");
        	// myAgent.send(request);
        }

        // Set speed to move to the right
        if (key == KeyEvent.VK_RIGHT) {
        	ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
        	request.setContent("dir");
        	// myAgent.send(request);
        }
		
	}
	
	// Pegará o botão soltado, e se for o <- ou ->
	// ele irá mandar um REQUEST para o AlienAgente
	public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
        	request.setContent("stop");
        	// myAgent.send(request);
        }
	}
	
	protected void setup() {
		
	}

}
