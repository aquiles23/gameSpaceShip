import jade.core.*; 
import jade.core.behaviours.*; 
import jade.lang.acl.ACLMessage; 
import jade.domain.FIPAAgentManagement.ServiceDescription; 
import jade.domain.FIPAAgentManagement.DFAgentDescription; 
import jade.domain.DFService; 
import jade.domain.FIPAException;

public class AlienAgente extends Agent {
	// Apertar as setas <- e -> fazem com que ele também se movimente para o lado,
	// porém se movimentando mais devagar que o usuário
	// Após bater nas paredes laterais irá reagir andando para o lado oposto
	public Alien alien;
	class movimentaAlien extends CyclicBehaviour { 
		
		private static final long serialVersionUID = 7768217846531384442L;

		// Construtor do behaviour. Necessário, pois passamos parâmetro. 
		public movimentaAlien(Agent a) { 
			super(a); 
		}
		
		public void action() {
			ACLMessage  msg = myAgent.receive();
			if(msg != null){
	
				if(msg.getPerformative() == ACLMessage.REQUEST) {
					System.out.println("REQUEST!");
					String content = msg.getContent();
					if(content == "esq") {
						if(alien.getX() == Game.getWidth()){
					        alien.setX(0);
					    }
						else {
							alien.setX(alien.getX()+1);
						}
					}
					else if(content == "dir") {
						if(alien.getX() == Game.getWidth()){
					        alien.setX(0);
					    }
						else {
							alien.setX(alien.getX()-1);
						}
					}
					else {
						block();
					}

				}
			}
			else {
				block();
			}
		}
	}
	
protected void setup() { 
			
		// Registrando o agente no DF 
		DFAgentDescription dfd = new DFAgentDescription(); 
		dfd.setName(getAID()); 
		ServiceDescription sd = new ServiceDescription(); 
		sd.setName(getName()); 
		sd.setType("AlienAgente"); 
		dfd.addServices(sd); 
		try { 
			DFService.register(this, dfd);
			
			// Criando o behaviour 

			movimentaAlien movAlien = new movimentaAlien(this); 
			addBehaviour(movAlien);
			
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
