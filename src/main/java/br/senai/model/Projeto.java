package br.senai.model;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity(name = "projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Size(max = 100)
    @NotNull
    private String nome;

    @Column(name = "data_inicial")
        private Date dataInicial;

    @Column(name = "data_final")
        private Date dataFinal;

    @Size(max = 60)
        private String status;

    private double orcamento;

    @ManyToMany
    @JoinTable(
            name = "projeto_funcionario",
            joinColumns = @JoinColumn(name = "projeto_id",
            referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(name = "funcionario_id",
            referencedColumnName = "id")
    )
    private List<Funcionario> funcionarios;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }
    public Date getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
    public List< Funcionario > getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List< Funcionario > funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", status='" + status + '\'' +
                ", orcamento=" + orcamento +
                '}';
    }
}
