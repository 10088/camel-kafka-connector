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
package org.apache.camel.kafkaconnector.web3j;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWeb3jSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_CONF = "camel.source.path.nodeAddress";
    public static final String CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_DOC = "Sets the node address used to communicate";
    public static final String CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_CONF = "camel.source.endpoint.addresses";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_DOC = "Contract address or a list of addresses.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_CONF = "camel.source.endpoint.fromAddress";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_DOC = "The address the transaction is send from";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_CONF = "camel.source.endpoint.fromBlock";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_DOC = "The block number, or the string latest for the last mined block or pending, earliest for not yet mined transactions.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_CONF = "camel.source.endpoint.fullTransactionObjects";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_DOC = "If true it returns the full transaction objects, if false only the hashes of the transactions.";
    public static final Boolean CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_CONF = "camel.source.endpoint.gasLimit";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_DOC = "The maximum gas allowed in this block.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_CONF = "camel.source.endpoint.privateFor";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_DOC = "A transaction privateFor nodes with public keys in a Quorum network";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APICONF = "camel.source.endpoint.quorumAPI";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APIDOC = "If true, this will support Quorum API.";
    public static final Boolean CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APIDEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_CONF = "camel.source.endpoint.toAddress";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_DOC = "The address the transaction is directed to.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_CONF = "camel.source.endpoint.toBlock";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_DOC = "The block number, or the string latest for the last mined block or pending, earliest for not yet mined transactions.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_CONF = "camel.source.endpoint.topics";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_DOC = "Topics are order-dependent. Each topic can also be a list of topics. Specify multiple topics separated by comma.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JCONF = "camel.source.endpoint.web3j";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JDOC = "The preconfigured Web3j object.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JDEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_CONF = "camel.component.web3j.addresses";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_DOC = "Contract address or a list of addresses.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_CONF = "camel.component.web3j.configuration";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_DOC = "Default configuration";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_CONF = "camel.component.web3j.fromAddress";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_DOC = "The address the transaction is send from";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_CONF = "camel.component.web3j.fromBlock";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_DOC = "The block number, or the string latest for the last mined block or pending, earliest for not yet mined transactions.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_CONF = "camel.component.web3j.fullTransactionObjects";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_DOC = "If true it returns the full transaction objects, if false only the hashes of the transactions.";
    public static final Boolean CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_CONF = "camel.component.web3j.gasLimit";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_DOC = "The maximum gas allowed in this block.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_CONF = "camel.component.web3j.privateFor";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_DOC = "A transaction privateFor nodes with public keys in a Quorum network";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APICONF = "camel.component.web3j.quorumAPI";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APIDOC = "If true, this will support Quorum API.";
    public static final Boolean CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APIDEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_CONF = "camel.component.web3j.toAddress";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_DOC = "The address the transaction is directed to.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_CONF = "camel.component.web3j.toBlock";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_DOC = "The block number, or the string latest for the last mined block or pending, earliest for not yet mined transactions.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_DEFAULT = "latest";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_CONF = "camel.component.web3j.topics";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_DOC = "Topics are order-dependent. Each topic can also be a list of topics. Specify multiple topics separated by comma.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_DEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JCONF = "camel.component.web3j.web3j";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JDOC = "The preconfigured Web3j object.";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JDEFAULT = null;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.web3j.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.web3j.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelWeb3jSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWeb3jSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WEB3J_PATH_NODE_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_ADDRESSES_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_FROM_BLOCK_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_FULL_TRANSACTION_OBJECTS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_GAS_LIMIT_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_PRIVATE_FOR_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APICONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APIDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_QUORUM_APIDOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_TO_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_TO_BLOCK_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_TOPICS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JCONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_WEB_3JDOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_ADDRESSES_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_FROM_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_FROM_BLOCK_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_FULL_TRANSACTION_OBJECTS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_GAS_LIMIT_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_PRIVATE_FOR_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APICONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APIDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_QUORUM_APIDOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_TO_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_TO_BLOCK_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_TOPICS_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JCONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_WEB_3JDOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WEB3J_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}