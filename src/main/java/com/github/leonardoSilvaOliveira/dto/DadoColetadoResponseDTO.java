package com.github.leonardoSilvaOliveira.dto;

import com.github.leonardoSilvaOliveira.entities.DadoColetado;
import com.github.leonardoSilvaOliveira.entities.TipoDado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DadoColetadoResponseDTO {
    private Long dadoId;
    private String sondaNome;
    private String agenciaEspacial;
    private LocalDate dataColeta;
    private TipoDado tipoDado;
    private BigDecimal valorMedido;
    private String unidadeMedida;

    public DadoColetadoResponseDTO(DadoColetado dado) {
        dadoId = dado.getDadoId();
        sondaNome = dado.getSondaNome();
        agenciaEspacial = dado.getAgenciaEspacial();
        dataColeta = dado.getDataColeta();
        tipoDado = dado.getTipoDado();
        valorMedido = dado.getValorMedido();
        unidadeMedida = dado.getUnidadeMedida();
    }
}
