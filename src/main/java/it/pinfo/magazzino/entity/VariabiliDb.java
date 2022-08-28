package it.pinfo.magazzino.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variabili_db")
@Data
public class VariabiliDb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_variabile_db")
	private Integer idVariabileDb;

	@Column(name = "primo_processo_effettuato")
	private Boolean primoProcessoEffettuato;

}
