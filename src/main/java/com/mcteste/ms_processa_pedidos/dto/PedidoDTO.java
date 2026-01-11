package com.mcteste.ms_processa_pedidos.dto;

public class PedidoDTO {
    private Long id;

    private String descricao;

    public PedidoDTO() {

    }

    public PedidoDTO(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
