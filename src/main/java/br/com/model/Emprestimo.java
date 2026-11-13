
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
@Table(name = "emprestimos")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_bicicleta")
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(name = "id_estacao_retirada")
    private Estacao estacaoRetirada;

    @ManyToOne
    @JoinColumn(name = "id_estacao_devolucao")
    private Estacao estacaoDevolucao;

    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(Usuario usuario, Bicicleta bicicleta, Estacao estacaoRetirada) {
        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.estacaoRetirada = estacaoRetirada;
        this.dataRetirada = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Estacao getEstacaoRetirada() {
        return estacaoRetirada;
    }

    public void setEstacaoRetirada(Estacao estacaoRetirada) {
        this.estacaoRetirada = estacaoRetirada;
    }

    public Estacao getEstacaoDevolucao() {
        return estacaoDevolucao;
    }

    public void setEstacaoDevolucao(Estacao estacaoDevolucao) {
        this.estacaoDevolucao = estacaoDevolucao;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDateTime dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
