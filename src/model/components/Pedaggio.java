/**
 * 
 */
package model.components;

import java.util.Date;

import model.interfaces.PedaggioManager;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public class Pedaggio implements PedaggioManager {
	public String id;
	public Date data;
	public Integer percorso;
	public Integer CostoTot;
	/**
	 * @param id
	 * @param data
	 * @param Autostrada
	 * @param Veicolo
	 */
	public Pedaggio(String id, Date data, Autostrada a, Veicolo v) {
		super();
		this.id = id;
		this.data = data;
		this.percorso = setPercorso(a.Caselli.get(0), a.Caselli.get(1));
		this.CostoTot = setPedaggio(v, a);
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the percorso
	 */
	public Integer getPercorso() {
		return percorso;
	}
	/**
	 * @param c1 the casello on entry 
	 * @param c2 the casello on exit 
	 */
	public Integer setPercorso(Casello c1, Casello c2) {
		return 0;
	}
	/**
	 * @return the costoTot
	 */
	public Integer getPedaggio() {
		return CostoTot;
	}
	/**
	 * @param c the Veicolo that has to pay the toll
	 * @param a the Autostrada traveled by the vehicle
	 */
	public Integer setPedaggio(Veicolo c, Autostrada a) {
		return 0;
	}
	
	
	
	

}
