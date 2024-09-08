package br.com.zavala.animal_service.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	
	@Column(nullable = false)
	private String nomeProvisorio;
	
	@Column(nullable = false)
	private Integer idadeEstimada;
	
	@Column(nullable = false)
	private String raca;
	
	@Column(nullable = false)
	private Date dataEntrada;
	
	@Column
	private Date dataAdocao;
	
	@Column(nullable = false)
	private String condicoesChegada;
	
	@Column(nullable = false)
	private String nomeRecebedor;
	
	@Column
	private Date dataObito;
	
	@Column(nullable = false)
	private String porte;

	public String getNomeProvisorio() {
		return nomeProvisorio;
	}

	public void setNomeProvisorio(String nomeProvisorio) {
		this.nomeProvisorio = nomeProvisorio;
	}

	public Integer getIdadeEstimada() {
		return idadeEstimada;
	}

	public void setIdadeEstimada(Integer idadeEstimada) {
		this.idadeEstimada = idadeEstimada;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataAdoção() {
		return dataAdocao;
	}

	public void setDataAdoção(Date dataAdoção) {
		this.dataAdocao = dataAdoção;
	}

	public String getCondicoesChegada() {
		return condicoesChegada;
	}

	public void setCondicoesChegada(String condicoesChegada) {
		this.condicoesChegada = condicoesChegada;
	}

	public String getNomeRecebedor() {
		return nomeRecebedor;
	}

	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}

	public Date getDataObito() {
		return dataObito;
	}

	public void setDataObito(Date dataObito) {
		this.dataObito = dataObito;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	
}
