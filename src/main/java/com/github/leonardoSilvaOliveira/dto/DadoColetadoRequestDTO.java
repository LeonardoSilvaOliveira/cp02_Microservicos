package com.github.leonardoSilvaOliveira.dto;

import com.github.leonardoSilvaOliveira.entities.TipoDado;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DadoColetadoRequestDTO {
    @NotBlank(message = "Campo sondaNome é obrigatório")
    @Size(min = 3, max = 100, message = "O campo sondaNome deve ter entre 3 e 100 caracteres")
    private String sondaNome;

    @NotBlank(message = "Campo agenciaEspacial é obrigatório")
    @Size(min = 3, max = 100, message = "O campo agenciaEspacial deve ter entre 3 e 100 caracteres")
    private String agenciaEspacial;

    @NotNull(message = "Campo dataColeta é obrigatório")
    @PastOrPresent(message = "A dataColeta não pode ser posterior à data atual")
    private LocalDate dataColeta;

    @NotNull(message = "Campo tipoDado é obrigatório")
    private TipoDado tipoDado;

    @NotNull(message = "Campo valorMedido é obrigatório")
    private BigDecimal valorMedido;

    @NotBlank(message = "Campo unidadeMedida é obrigatório")
    @Size(min = 3, max = 100, message = "O campo unidadeMedida deve ter entre 3 e 100 caracteres")
    private String unidadeMedida;
}
