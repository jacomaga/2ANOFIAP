package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SQ_TB_CLIENTE TB_CLIENTE
 * 
 * cd_cliente NUMBER PK NOT NULL nm_cliente VARCHAR(50) NOT NULL ds_email
 * VARCHAR(100) dt_nascimento DATE
 * 
 */

@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "cliente", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name = "cd_cliente")
	private int codigo;

	@Column(name = "nm_cliente", nullable = false, length = 50)
	private String nome;

	@Column(name = "ds_email", length = 100)
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNascimento;

}
