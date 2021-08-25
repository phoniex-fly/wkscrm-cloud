package com.wkscrm.common.rabbitmq.config;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * 监视消息是否成功发送至交换机
 *
 */
public class MessageConfirmWatcher implements RabbitTemplate.ConfirmCallback {

    /**
     *
     * @param correlationData  相关的消息
     * @param ack  消息是否成功到达交换机
     * @param cause 失败原因
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if(ack){
            System.out.println("消息发送至交换机成功");
        }else{
            System.out.println("消息发送至交换机失败");
        }
    }
}
