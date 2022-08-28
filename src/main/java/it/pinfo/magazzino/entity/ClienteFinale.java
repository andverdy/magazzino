package it.pinfo.magazzino.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_finale")
@Data
public class ClienteFinale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente_finale")
	private Long idClienteFinale;

	@Column(name = "insegna")
	private String insegna;

	@Column(name = "indirizzo")
	private String indirizzo;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	private String email;


}
