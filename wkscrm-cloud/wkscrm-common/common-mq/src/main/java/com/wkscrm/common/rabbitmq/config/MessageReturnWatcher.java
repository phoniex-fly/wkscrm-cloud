package com.wkscrm.common.rabbitmq.config;

import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * 监控消息队列是否成功由交换机发送至队列:失败时调用
 */
public class MessageReturnWatcher implements RabbitTemplate.ReturnsCallback {

    /**
     * returned.getMessage()消息内容
     * returned.getReplyCode() 回调的响应码
     * returned.getReplyText()影响文本
     * returned.getExchange() 交换机
     * returned.getRoutingKey() 路由key
     *
     * @param returned
     */
    @Override
    public void returnedMessage(ReturnedMessage returned) {
        System.out.println(returned.getExchange());
        System.out.println(returned.getMessage());
        System.out.println(returned.getReplyCode());
        System.out.println(returned.getReplyText());
        System.out.println(returned.getRoutingKey());
    }
}
