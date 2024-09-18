package br.com.zavala.animal_service.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Classe Raca como entidade
@Entity
@Table(name = "raca")
public class Raca {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @ManyToOne
 @JoinColumn(name = "id_especie", nullable = false)
 private Especie especie;

 @Column(name = "nome_raca", nullable = false)
 private String nomeRaca;

 @Column(name = "caracteristicas")
 private String caracteristicas;

 public Raca() { }

 public Raca(int id, Especie especie, String nomeRaca, String caracteristicas) {
     this.id = id;
     this.especie = especie;
     this.nomeRaca = nomeRaca;
     this.caracteristicas = caracteristicas;
 }

 public int getId() {
     return id;
 }

 public Especie getEspecie() {
     return especie;
 }

 public String getNomeRaca() {
     return nomeRaca;
 }

 public String getCaracteristicas() {
     return caracteristicas;
 }

 public void setNomeRaca(String nomeRaca) {
     this.nomeRaca = nomeRaca;
 }

 public void setCaracteristicas(String caracteristicas) {
     this.caracteristicas = caracteristicas;
 }
}
