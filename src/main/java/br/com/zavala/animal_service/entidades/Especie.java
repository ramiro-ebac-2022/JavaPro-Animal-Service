package br.com.zavala.animal_service.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Classe Especie como entidade
@Entity
@Table(name = "especie")
public class Especie {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id", nullable = false)
 private int id;

 @Column(name = "nome_especie" ,nullable = false)
 private String nomeEspecie;

 public Especie() { }

 public Especie(int id, String nomeEspecie) {
     this.id = id;
     this.nomeEspecie = nomeEspecie;
 }

 public int getId() {
     return id;
 }

 public String getNomeEspecie() {
     return nomeEspecie;
 }

 public void setNomeEspecie(String nomeEspecie) {
     this.nomeEspecie = nomeEspecie;
 }
}