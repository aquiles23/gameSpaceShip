import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

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

	protected void setup() {
		
	}
	
	public void move() {
	      
        // Limits the movement of the alien to the side edges.
        if((speed_x < 0 && alien.getX() <= 0) || (speed_x > 0 && alien.getX() + alien.width >= Game.getWidth())){
            speed_x = 0;
        }
        
        // Moves the alien on the horizontal axis
        alien.setX(alien.getX() + speed_x);
	}
	
	// Sempre que receber um request o alien tentará se mover
	class AlienAgentMoving extends CyclicBehaviour {

		/**
		 * 
		 */
		private static final long serialVersionUID = -1320369895090804438L;
		
		public AlienAgentMoving(Agent a) {
			super(a);
		}
		
		public void action() {
			System.out.println("AlienAgent - Inicializando a action do meu comportamento");
			
			System.out.println("AlienAgent - Recebendo o conteúdo enviado por um terceiro");
			ACLMessage msg = myAgent.receive();
			if(msg != null) {
				System.out.println("AlienAgent - Criando Resposta!");
				
				if(msg.getPerformative() == ACLMessage.REQUEST) {
					System.out.println("AlienAgent - REQUEST!");
					String content = msg.getContent();
					
					if(content != null) {
						// Fazer com que o alien se mova de acordo com o conteudo
						// que ele recebe no request
						if(content == "esq") {
							speed_x = -1 * MAX_SPEED_X;
						} else if(content == "dir") {
							speed_x = MAX_SPEED_X;
						} else if(content == "stop") {
							speed_x = 0;
						} else {
							System.out.println("AlienAgent - NOT_UNDERSTOOD");
						}
					}
				}
			}
			
		}
		
	}
}
