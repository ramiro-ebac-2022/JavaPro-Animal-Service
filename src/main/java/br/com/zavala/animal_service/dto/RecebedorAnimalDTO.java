package br.com.zavala.animal_service.dto;

public class RecebedorAnimalDTO {
	private String nomeRecebedor;
	private Long numeroAnimais;
	
	//Construtor
	public RecebedorAnimalDTO(String nomeRecebedor, Long numeroAnimais) {
		this.nomeRecebedor = nomeRecebedor;
		this.numeroAnimais = numeroAnimais;
	}

	public String getNomeRecebedor() {
		return nomeRecebedor;
	}

	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}

	public Long getNumeroAnimais() {
		return numeroAnimais;
	}

	public void setNumeroAnimais(Long numeroAnimais) {
		this.numeroAnimais = numeroAnimais;
	}
	
	
}
