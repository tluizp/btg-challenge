package com.desafio.btg.service;

import com.desafio.btg.model.Pedido;
import com.desafio.btg.repository.PedidoRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

  private final PedidoRepository pedidoRepository;

  public PedidoService(PedidoRepository pedidoRepository){
    this.pedidoRepository = pedidoRepository;
  }

  public Pedido save(Pedido pedido){
    return pedidoRepository.save(pedido);
  }

  public BigDecimal consultarValorTotalPedido(Long codigoPedido) {
    Pedido byCodigoPedido = pedidoRepository.findByCodigoPedido(codigoPedido);
    return byCodigoPedido.getItens().stream()
        .map(item -> BigDecimal.valueOf(item.getQuantidade()).multiply(item.getPreco()))
        .reduce(BigDecimal.ZERO, BigDecimal::add);
  }

  public Integer consultarQuantidadePedidoPorCliente(Long codigoCliente) {
    List<Pedido> pedidosCliente = pedidoRepository.findAllByCodigoCliente(codigoCliente);
    return pedidosCliente.stream().map(pedido -> pedido.getItens().size()).reduce(0, Integer::sum);
  }

  public List<Pedido> retornarTodosPedidosPorCliente(Long codigoCliente){
    return pedidoRepository.findAllByCodigoCliente(codigoCliente);
  }
}
