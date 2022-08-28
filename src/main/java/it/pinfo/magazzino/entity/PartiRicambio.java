package it.pinfo.magazzino.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parti_ricambio")
@Data
public class PartiRicambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_parte")
	private Long idParte;

	@Column(name = "matricola")
	private String matricola;

	@Column(name = "desc_parte")
	private String descParte;

	@Column(name = "stato")
	private String stato;

	@Column(name = "aggiornato")
	private Boolean aggiornato;

	@Column(name = "condizioni_parte")
	private String condizioniParte;

	@Column(name = "cliente")
	private String cliente;


}
