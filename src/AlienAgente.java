import jade.core.Agent;
import java.util.Objects;
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2143965605288620707L;
	public Alien alien;
	private static final int MAX_SPEED_X = 1;
	private int speed_x;
	public Application game;

	protected void setup() { 
		
		// Registrando o agente no DF 
		DFAgentDescription dfd = new DFAgentDescription(); 
		dfd.setName(getAID()); 
		ServiceDescription sd = new ServiceDescription(); 
		sd.setName(getName()); 
		sd.setType("AlienAgente"); 
		dfd.addServices(sd); 
		
		// implementação
		game = new Application();
		game.main();  //inicia interface grafica e tudo no jogo.
		try { 
			DFService.register(this, dfd);
			
			// Criando o behaviour 

			AlienAgentMoving movAlien = new AlienAgentMoving(this); 
			addBehaviour(movAlien);
			
			
			
		} catch(FIPAException e) { 
			e.printStackTrace();
			doDelete();
		}
	}
	
	
	public void move() {
		addBehaviour(new OneShotBehaviour() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void action() {
				// TODO Auto-generated method stub
				// Limits the movement of the alien to the side edges.
		        if((speed_x < 0 && alien.getX() <= 0) || (speed_x > 0 && alien.getX() + alien.width >= Game.getWidth())){
		            speed_x = 0;
		        }
		        
		        // Moves the alien on the horizontal axis
		        alien.setX(alien.getX() + speed_x);
			}
			
		});
	}
	
	// Sempre que receber um request o alien tentará se mover
	class AlienAgentMoving extends CyclicBehaviour {


		private static final long serialVersionUID = -1320369895090804438L;
		
		public AlienAgentMoving(Agent a) {
			super(a);
		}
		
		public void action() {
			
			
			ACLMessage msg = myAgent.receive();
			if(msg != null) {
				System.out.println("AlienAgent - Criando Resposta!");
	
				if(msg.getPerformative() == ACLMessage.REQUEST) {
					System.out.println("AlienAgent - REQUEST!");
					String content = msg.getContent();
					if(content != null) {
						System.out.println(content);
						// Fazer com que o alien se mova de acordo com o conteudo
						// que ele recebe no request
						if(Objects.equals(content,"esq")) {
							speed_x = -1 * MAX_SPEED_X;
						} else if(Objects.equals(content,"dir")) {
							speed_x = MAX_SPEED_X;
						} else if(Objects.equals(content,"stop")) {
							speed_x = 0;
						} else {
							System.out.println("AlienAgent - NOT_UNDERSTOOD");
							block();
						}
					}
					else {
						block();
					}
				}
			}
			
		}
	}
		
	// Após bater nas paredes laterais irá reagir andando para o lado oposto
	
	/*class movimentaAlien extends CyclicBehaviour { 
		
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
							alien.setX(alien.getX()+ MAX_SPEED);
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
	} */
	
 
	protected void takeDown() { 
		// Retira registro no DF 
		try { 
			DFService.deregister(this); 
		} catch(FIPAException e) { 
			e.printStackTrace(); 
		}
	}
}
