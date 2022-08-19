package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlunoForm {


  @NotEmpty(message = "Preeencha o campo corretamente")//
  @Size(min = 3, max = 50,message = "'$validatedValue' precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotEmpty(message = "Preeencha o campo corretamente")
  @CPF(message = "'$'{validatedValue} é inválido")
  private String cpf;

  @NotEmpty(message = "Preeencha o campo corretamente")
  @Size(min = 3, max = 50,message = "'$validatedValue' precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "Preeencha o campo corretamente")
  @Past(message = "Data '${validatedValue}' é invlálida ")
  private LocalDate dataDeNascimento;
}
