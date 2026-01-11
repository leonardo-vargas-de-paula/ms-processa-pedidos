package com.mcteste.ms_processa_pedidos.consumer;

import com.mcteste.ms_processa_pedidos.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listernerProcesamentoQueue(PedidoDTO pedidoDTO){
        System.out.println("Teste descrição = "+pedidoDTO.getDescricao());
    }
}
