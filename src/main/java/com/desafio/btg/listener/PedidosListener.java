package com.desafio.btg.listener;

import com.desafio.btg.model.Pedido;
import com.desafio.btg.service.PedidoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class PedidosListener {

  @Autowired
  PedidoService pedidoService;

  @JmsListener(destination = "pedidos")
  public void onMessage(String message) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    Pedido pedido = objectMapper.readValue(message, Pedido.class);
    pedidoService.save(pedido);
  }
}
