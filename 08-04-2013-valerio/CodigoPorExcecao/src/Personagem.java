public class Personagem {

	private int health_points = 100;
	private int mana = 80;
	private int stamina = 70;
	
	private boolean interface_visivel = false;
	
	public void verificaStatus() {
		if(health_points > 90) {
			if (!recuperaMana())
				recuperaStamina();
			atualiza();
		}
	}
	
	private boolean recuperaMana() {
		// TODO Auto-generated method stub
		if(mana  > 80){
			//recupera mana
			return true;
			
		}
		return false;
		
	}

	private void recuperaStamina() {
		// TODO Auto-generated method stub
		if(stamina  > 60) {
			//recupera 
		}
	}

	private void atualiza() {
		//atualiza elementos da UI
		setInterface_visivel(true);
	}

	public boolean isInterface_visivel() {
		return interface_visivel;
	}

	public void setInterface_visivel(boolean interface_visivel) {
		this.interface_visivel = interface_visivel;
	}
	
}
