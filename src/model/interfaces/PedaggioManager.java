/**
 * 
 */
package model.interfaces;

import model.components.Autostrada;
import model.components.Casello;
import model.components.Veicolo;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public interface PedaggioManager {
	public Integer setpercorso(Casello c1, Casello c2);
	public Integer setpedaggio(Veicolo v, Autostrada a);
	

}
