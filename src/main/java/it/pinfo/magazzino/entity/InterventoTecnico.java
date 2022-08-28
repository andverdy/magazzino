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
@Table(name = "intervento_tecnico")
@Data
public class InterventoTecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_intervento_tecnico")
	private Integer idInterventoTecnico;

	@Column(name = "matricola_parte_new")
	private String matricolaParteNew;

	@Column(name = "matricola_parte_old")
	private String matricolaParteOld;

	@Column(name = "tipo_intervento")
	private String tipoIntervento;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "data_intervento")
	private Date dataIntervento;

	@Column(name = "esito")
	private String esito;

	@Column(name = "cliente")
	private String cliente;

	public InterventoTecnico() {

	}

	@Override
	public String toString() {
		return "InterventoTecnico [idInterventoTecnico=" + idInterventoTecnico + ", matricolaParteNew="
				+ matricolaParteNew + ", matricolaParteOld=" + matricolaParteOld + ", tipoIntervento=" + tipoIntervento + ", dataIntervento=" + dataIntervento + ", esito=" + esito
				+ ", idCliente=" + cliente + "]";
	}

}
