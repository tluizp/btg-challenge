package com.desafio.btg.controller;

import com.desafio.btg.model.Pedido;
import com.desafio.btg.service.PedidoService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

  private final PedidoService pedidoService;

  public PedidoController(PedidoService pedidoService){
    this.pedidoService = pedidoService;
  }

  @GetMapping("{codigoPedido}/valor-total")
  public BigDecimal consultarValorTotalPedido(@PathVariable Long codigoPedido){
    return pedidoService.consultarValorTotalPedido(codigoPedido);
  }

  @GetMapping("quantidade/por-cliente/{codigoCliente}")
  public Integer consultarQuantidadePedidoPorCliente(@PathVariable Long codigoCliente){
    return pedidoService.consultarQuantidadePedidoPorCliente(codigoCliente);
  }

  @GetMapping("lista/por-cliente/{codigoCliente}")
  public List<Pedido> retornarTodosPedidosPorCliente(@PathVariable Long codigoCliente){
    return pedidoService.retornarTodosPedidosPorCliente(codigoCliente);
  }

}
