package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data //Getter, setter, equals e hashcode
@NoArgsConstructor // criar construtor vazio
@AllArgsConstructor // construtor completo
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) //por usar o lazy

public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno",fetch = FetchType.LAZY) //por ser bidirecional - tbm ter um aluno lá em avaliazao fisica - temos que mapear - e Lazy não vai deixar puxar as avaliações fisicas
  @JsonIgnore

  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
