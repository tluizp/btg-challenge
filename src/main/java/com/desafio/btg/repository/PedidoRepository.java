package com.desafio.btg.repository;

import com.desafio.btg.model.Pedido;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends MongoRepository<Pedido, Integer> {

  Pedido findByCodigoPedido(Long codigoPedido);

  List<Pedido> findAllByCodigoCliente(Long codigoCliente);
}
