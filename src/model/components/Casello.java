/**
 * 
 */
package model.components;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public class Casello {
	public String id;
	public String Citta;
	public String Coordinate;
	public Integer km;
	/**
	 * @param id
	 * @param citta
	 * @param coordinate
	 * @param km
	 */
	public Casello(String id, String citta, String coordinate, Integer km) {
		this.id = id;
		Citta = citta;
		Coordinate = coordinate;
		this.km = km;
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
	 * @return the citta
	 */
	public String getCitta() {
		return Citta;
	}
	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		Citta = citta;
	}
	/**
	 * @return the coordinate
	 */
	public String getCoordinate() {
		return Coordinate;
	}
	/**
	 * @param coordinate the coordinate to set
	 */
	public void setCoordinate(String coordinate) {
		Coordinate = coordinate;
	}
	/**
	 * @return the km
	 */
	public Integer getKm() {
		return km;
	}
	/**
	 * @param km the km to set
	 */
	public void setKm(Integer km) {
		this.km = km;
	}
	
	

}
