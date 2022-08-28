package it.pinfo.magazzino.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Data
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "descrizione")
	private String descrizione;
	

	@Override
	public String toString() {
		return "Roles [id=" + id + ", descrizione=" + descrizione + "]";
	}

}
