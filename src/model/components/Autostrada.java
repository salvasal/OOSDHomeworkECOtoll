/**
 * 
 */
package model.components;

import java.util.List;

/**
 * @author Salernitano Salvatore Matricola 242016
 *
 */
public class Autostrada {
	public String codice;
	public String nome;
	public String tipo;
	public List<Casello> Caselli;
	/**
	 * @param codice
	 * @param nome
	 * @param tipo
	 * @param caselli
	 */
	public Autostrada(String codice, String nome, String tipo, List<Casello> caselli) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.tipo = tipo;
		this.Caselli = caselli;
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the caselli
	 */
	public List<Casello> getCaselli() {
		return Caselli;
	}
	/**
	 * @param caselli the caselli to set
	 */
	public void setCaselli(List<Casello> caselli) {
		Caselli = caselli;
	}
	
	
	
	

}
