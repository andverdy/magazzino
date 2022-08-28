package it.pinfo.magazzino.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Entity
@Table(name = "movimento")
@Data
public class Movimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movimento")
	private Integer idMovimento;

	@Column(name = "matricola_parte")
	private String matricolaParte;

	@Column(name = "descrizione_parte")
	private String descrizioneParte;

	@Column(name = "tipo_movimento")
	private String tipoMovimento;

	@Column(name = "condizioni_parte")
	private String condizioniParte;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "data_Movimento")
	private Date dataMovimento;

	@Column(name = "cliente")
	private String cliente;


	@Override
	public String toString() {
		return "Movimento [idMovimento=" + idMovimento + ", matricolaParte=" + matricolaParte + ", descrizioneParte="
				+ descrizioneParte + ", tipoMovimento=" + tipoMovimento + ", condizioniParte=" + condizioniParte
				+ ", dataMovimento=" + dataMovimento + ", idCliente=" + cliente + "]";
	}

}
