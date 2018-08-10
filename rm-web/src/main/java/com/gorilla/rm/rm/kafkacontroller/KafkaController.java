//package com.gorilla.rm.rmweb.rm.kafkacontroller;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.util.concurrent.ListenableFuture;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/kafka")
//public class KafkaController {
//
//    public static Logger logger = LoggerFactory.getLogger(KafkaController.class);
//
//    @Autowired
//    private KafkaTemplate<String, String> template;
//
//    // http://localhost:9091/kafka/send?topic=t2&key=test1&data=hello122
//    @RequestMapping("/send")
//    public Boolean send(String topic, String key, String data) {
//        ListenableFuture<SendResult<String, String>> future = template.send(topic, key, data);
//        return future.isDone();
//    }
//
//    @KafkaListener(topics = "t1")
//    public void listenT1(ConsumerRecord<?, ?> record) throws Exception {
//        System.out.printf("offset = %d,key =%s,value=%s\n", record.offset(), record.key(), record.value());
//    }
//
//    @KafkaListener(topics = "HelloWorld")
//    public void listenT2(ConsumerRecord<?, ?> record) throws Exception {
//        System.out.printf("offset = %d,key =%s,value=%s\n", record.offset(), record.key(), record.value());
//    }
//}
