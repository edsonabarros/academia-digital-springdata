package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

public class AlunoUpdateForm {


  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}
