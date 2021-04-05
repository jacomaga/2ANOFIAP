package br.com.fiap.jpa.api.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "T_APISEM1_FILME")
@SequenceGenerator(name="filme", sequenceName = "SQ_T_FILME",allocationSize = 1)
public class Filme {

	@Id
	@Column(name = "cd_filme")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme")
	private int codigo;
	
	@Column(name = "nm_filme", length = 60)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_lancamento")
	private Calendar dataLancamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_genero", length = 40)
	private Genero genero;
	
	@Column(name = "ds_sinopse", length = 255)
	private String sinopse;
	
	@Column(name = "st_premiado")
	private boolean premiado;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro", updatable = false)
	private Calendar dataCadastro;

	
	public Filme() {}
	
	
	
	public Filme(String nome, Calendar dataLancamento, Genero genero, String sinopse, boolean premiado) {
		super();
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.sinopse = sinopse;
		this.premiado = premiado;
	}



	public Filme(int codigo, String nome, Calendar dataLancamento, Genero genero, String sinopse, boolean premiado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.sinopse = sinopse;
		this.premiado = premiado;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public boolean isPremiado() {
		return premiado;
	}

	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}