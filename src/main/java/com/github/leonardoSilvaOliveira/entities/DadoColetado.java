package com.github.leonardoSilvaOliveira.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "dadoId")
@Entity
@Table(name = "tb_dado_coletado")
public class DadoColetado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dadoId;
    private String sondaNome;
    private String agenciaEspacial;
    private LocalDate dataColeta;

    @Enumerated(EnumType.STRING)
    private TipoDado tipoDado;
    private BigDecimal valorMedido;
    private String unidadeMedida;
}
