
package br.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "manutencoes")
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_bicicleta")
    private Bicicleta bicicleta;

    private String descricao;
    private LocalDateTime dataManutencao;
    private String status;

    public Manutencao() {
    }

    public Manutencao(Bicicleta bicicleta, String descricao) {
        this.bicicleta = bicicleta;
        this.descricao = descricao;
        this.dataManutencao = LocalDateTime.now();
        this.status = "PENDENTE";
    }

    public Long getId() {
        return id;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(LocalDateTime dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
