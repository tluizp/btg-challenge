package com.desafio.btg.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pedido")
public class Pedido {

  @Id
  private String id;
  private Long codigoPedido;
  private Long codigoCliente;
  private List<Item> itens;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getCodigoPedido() {
    return codigoPedido;
  }

  public void setCodigoPedido(Long codigoPedido) {
    this.codigoPedido = codigoPedido;
  }

  public Long getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(Long codigoCliente) {
    this.codigoCliente = codigoCliente;
  }

  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }
}
