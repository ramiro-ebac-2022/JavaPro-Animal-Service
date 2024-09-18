package br.com.zavala.animal_service.dto;

public class EspecieRacaDTO {
	private Long idRaca;
	private Long idEspecie;
	private String nomeEspecie;
	private String nomeRaca;
	private String caracteristicas;
	
	//construtor
	public EspecieRacaDTO(Long idRaca, Long idEspecie, String nomeEspecie, String nomeRaca, String caracteristicas) {
		this.idRaca = idRaca;
		this.idEspecie = idEspecie;
		this.nomeEspecie = nomeEspecie;
		this.nomeRaca = nomeRaca;
		this.caracteristicas = caracteristicas;
	}

	//
	public Long getIdRaca() {
		return idRaca;
	}

	public void setIdRaca(Long idRaca) {
		this.idRaca = idRaca;
	}

	public Long getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(Long idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public String getNomeRaca() {
		return nomeRaca;
	}

	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	

}
