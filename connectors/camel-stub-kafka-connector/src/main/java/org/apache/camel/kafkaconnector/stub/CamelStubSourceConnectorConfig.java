/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.stub;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelStubSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_STUB_PATH_NAME_CONF = "camel.source.path.name";
    public static final String CAMEL_SOURCE_STUB_PATH_NAME_DOC = "Name of queue";
    public static final String CAMEL_SOURCE_STUB_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_SIZE_CONF = "camel.source.endpoint.size";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_SIZE_DOC = "The maximum capacity of the SEDA queue (i.e., the number of messages it can hold). Will by default use the defaultSize set on the SEDA component.";
    public static final Integer CAMEL_SOURCE_STUB_ENDPOINT_SIZE_DEFAULT = 1000;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_CONF = "camel.source.endpoint.concurrentConsumers";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_DOC = "Number of concurrent threads processing exchanges.";
    public static final Integer CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT = 1;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_CONF = "camel.source.endpoint.limitConcurrentConsumers";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_DOC = "Whether to limit the number of concurrentConsumers to the maximum of 500. By default, an exception will be thrown if an endpoint is configured with a greater number. You can disable that check by turning this option off.";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_CONF = "camel.source.endpoint.multipleConsumers";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_DOC = "Specifies whether multiple consumers are allowed. If enabled, you can use SEDA for Publish-Subscribe messaging. That is, you can send a message to the SEDA queue and have each consumer receive a copy of the message. When enabled, this option should be specified on every consumer endpoint.";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_CONF = "camel.source.endpoint.pollTimeout";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_DOC = "The timeout used when polling. When a timeout occurs, the consumer can check whether it is allowed to continue running. Setting a lower value allows the consumer to react more quickly upon shutdown.";
    public static final Integer CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_DEFAULT = 1000;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_CONF = "camel.source.endpoint.purgeWhenStopping";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_DOC = "Whether to purge the task queue when stopping the consumer/route. This allows to stop faster, as any pending messages on the queue is discarded.";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_CONF = "camel.source.endpoint.queue";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_DOC = "Define the queue instance which will be used by the endpoint";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_DEFAULT = null;
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.stub.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_CONF = "camel.component.stub.concurrentConsumers";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_DOC = "Sets the default number of concurrent threads processing exchanges.";
    public static final Integer CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_DEFAULT = 1;
    public static final String CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.stub.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_CONF = "camel.component.stub.defaultQueueFactory";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_DOC = "Sets the default queue factory.";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_CONF = "camel.component.stub.queueSize";
    public static final String CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_DOC = "Sets the default maximum capacity of the SEDA queue (i.e., the number of messages it can hold).";
    public static final Integer CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_DEFAULT = 1000;

    public CamelStubSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelStubSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_STUB_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STUB_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_STUB_PATH_NAME_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STUB_ENDPOINT_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_SIZE_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_LIMIT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_MULTIPLE_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_POLL_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_PURGE_WHEN_STOPPING_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_QUEUE_DOC);
        conf.define(CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_COMPONENT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_COMPONENT_DEFAULT_QUEUE_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STUB_COMPONENT_QUEUE_SIZE_DOC);
        return conf;
    }
}