/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.List;

import model.components.Autostrada;
import model.components.Casello;
import model.components.Pedaggio;
import model.components.Veicolo;
import model.components.VeicoloA;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public class RunECOtoll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veicolo v = new VeicoloA("Aq204de", "SX-8", "Suzuki", 2012, 2, 2200, 150, 210, 1, 2, 2);
		Casello c1 = new Casello("c01", "L'Aquila", "12 33 21 N 12 56 43 E", 90);
		Casello c2 = new Casello("c02", "Magliano dei marsi", "13 33 23 N 13 44 43 E", 135);
		Casello c3 = new Casello("c03", "Avezzano", "13 76 21 N 13 90 43 E", 140);
		List<Casello> Caselli = new ArrayList<Casello>();
		Caselli.add(c1);
		Caselli.add(c2);
		Caselli.add(c3);
		Autostrada a = new Autostrada("A24", "Strada dei parchi", "Montagna", Caselli);
		Pedaggio p = new Pedaggio("1", "31/03/19", a, v, c1, c2);
	}

}
