/**
 * 
 */
package model.components;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public class VeicoloD extends Veicolo {
	public Integer tariffa;
	public Integer onero;
	
	
	
	/**
	 * @param targa
	 * @param modello
	 * @param marca
	 * @param anno
	 * @param assi
	 * @param peso
	 * @param altezza
	 * @param qtaCO2
	 * @param tariffa
	 * @param onero
	 * @param euro
	 */
	public VeicoloD(String targa, String modello, String marca, Integer anno, Integer assi, Integer peso,
			Integer altezza, Integer qtaCO2,Integer euro, Integer tariffa, Integer onero) {
		super(targa, modello, marca, anno, assi, peso, altezza, qtaCO2, euro);
		this.tariffa = tariffa;
		this.onero = onero;
	}
	
	/**
	 * @return the tariffa
	 */
	public Integer getTariffa() {
		return tariffa;
	}
	/**
	 * @param tariffa the tariffa to set
	 */
	public void setTariffa(Integer tariffa) {
		this.tariffa = tariffa;
	}
	/**
	 * @return the onero
	 */
	public Integer getOnero() {
		return onero;
	}
	/**
	 * @param onero the onero to set
	 */
	public void setOnero(Integer onero) {
		this.onero = onero;
	}
	
	

}
