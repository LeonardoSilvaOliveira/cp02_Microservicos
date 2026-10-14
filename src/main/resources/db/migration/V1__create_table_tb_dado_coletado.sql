CREATE TABLE IF NOT EXISTS tb_dado_coletado (
                                            id BIGINT NOT NULL AUTO_INCREMENT,
                                            sonda_nome VARCHAR(100) NOT NULL,
                                            agencia_espacial VARCHAR(100) NOT NULL,
                                            data_coleta DATE NOT NULL,
                                            tipo_dado VARCHAR(50) NOT NULL,
                                            valor_medido DECIMAL(19,4) NOT NULL,
                                            unidade_medida VARCHAR(100) NOT NULL,
                                            CONSTRAINT pk_tb_dado_coletado PRIMARY KEY (id)
    );