package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data //Getter, setter, equals e hashcode
@NoArgsConstructor // criar construtor vazio
@AllArgsConstructor // construtor completo
@Entity
@Table(name = "tb_avaliacoes")

public class AvaliacaoFisica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  //contrario da ourtra
  @ManyToOne(cascade = CascadeType.ALL) //tudo que fizer aqui reflete em aluno
  @JoinColumn(name = "aluno_id") //colunas de fk estarao dentro de avaliacao fisica
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();


  @Column(name = "peso_atual")
  private double peso;
  @Column(name = "altura_atual")
  private double altura;

}
