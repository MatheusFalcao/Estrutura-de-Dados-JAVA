package duplamenteEnc;

public class ExecListaDuplamente {

	public static void main(String[] args) {
		
		DuplamenteEnc inst = new DuplamenteEnc();
		
		
		inst.inserirNoInicio(999);
		inst.inserirNoFim(123);
		inst.inserirNoFim(3);
		inst.inserirNoFim(421);
		inst.inserirNoFim(512);
		inst.inserirNoFim(51);
		inst.inserirNoFim(12);
		inst.inserirNoInicio(90);
		
		
		inst.imprimir();
		
		if (inst.remover(512)){
			System.out.println("Elemento (512) Removido ----- imprimindo novamente a Lista \\|/");
			}
		
		inst.imprimir();
		
	}


}