/**
 * 
 */
package model.components;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
abstract class Veicolo {
	public String targa;
	public String modello;
	public String marca;
	public Integer anno;
	public Integer assi;
	public Integer peso;
	public Integer altezza;
	public Integer qtaCO2;
	public Integer euro;
	
	
	
	/**
	 * @param targa
	 * @param modello
	 * @param marca
	 * @param anno
	 * @param assi
	 * @param peso
	 * @param altezza
	 * @param qtaCO2
	 * @param euro
	 */
	public Veicolo(String targa, String modello, String marca, Integer anno, Integer assi, Integer peso,
			Integer altezza, Integer qtaCO2, Integer euro) {
		this.targa = targa;
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.assi = assi;
		this.peso = peso;
		this.altezza = altezza;
		this.qtaCO2 = qtaCO2;
		this.euro = euro;
	}
	
	/**
	 * @return the euro
	 */
	public Integer getEuro() {
		return euro;
	}

	/**
	 * @param euro the euro to set
	 */
	public void setEuro(Integer euro) {
		this.euro = euro;
	}

	/**
	 * @return the targa
	 */
	public String getTarga() {
		return targa;
	}
	/**
	 * @param targa the targa to set
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}
	/**
	 * @return the modello
	 */
	public String getModello() {
		return modello;
	}
	/**
	 * @param modello the modello to set
	 */
	public void setModello(String modello) {
		this.modello = modello;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the assi
	 */
	public Integer getAssi() {
		return assi;
	}
	/**
	 * @param assi the assi to set
	 */
	public void setAssi(Integer assi) {
		this.assi = assi;
	}
	/**
	 * @return the peso
	 */
	public Integer getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	/**
	 * @return the altezza
	 */
	public Integer getAltezza() {
		return altezza;
	}
	/**
	 * @param altezza the altezza to set
	 */
	public void setAltezza(Integer altezza) {
		this.altezza = altezza;
	}
	/**
	 * @return the qtaCO2
	 */
	public Integer getQtaCO2() {
		return qtaCO2;
	}
	/**
	 * @param qtaCO2 the qtaCO2 to set
	 */
	public void setQtaCO2(Integer qtaCO2) {
		this.qtaCO2 = qtaCO2;
	}
	
	

}
