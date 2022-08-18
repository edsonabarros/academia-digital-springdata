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
@Table(name = "tb_matriculas")

public class Matricula {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL) //estudar cardinalidades no bd e nas anotações - relacionamento bidirecional
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;
 //one to one não precisa de mapeamento para aluno
  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
