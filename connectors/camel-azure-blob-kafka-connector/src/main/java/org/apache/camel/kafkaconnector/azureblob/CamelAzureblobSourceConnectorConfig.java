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
package org.apache.camel.kafkaconnector.azureblob;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzureblobSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_CONF = "camel.source.path.containerOrBlobUri";
    public static final String CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_DOC = "Container or Blob compact Uri";
    public static final String CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_CONF = "camel.source.endpoint.azureBlobClient";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_DOC = "The blob service client";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_CONF = "camel.source.endpoint.blobOffset";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_DOC = "Set the blob offset for the upload or download operations, default is 0";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_DEFAULT = "0";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_CONF = "camel.source.endpoint.blobType";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_DOC = "Set a blob type, 'blockblob' is default One of: [blockblob] [appendblob] [pageblob]";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_DEFAULT = "blockblob";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_CONF = "camel.source.endpoint.closeStreamAfterRead";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_DOC = "Close the stream after read or keep it open, default is true";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_CONF = "camel.source.endpoint.credentials";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_DOC = "Set the storage credentials, required in most cases";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_CONF = "camel.source.endpoint.dataLength";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_DOC = "Set the data length for the download or page blob upload operations";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_CONF = "camel.source.endpoint.fileDir";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_DOC = "Set the file directory where the downloaded blobs will be saved to";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_CONF = "camel.source.endpoint.publicForRead";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_DOC = "Storage resources can be public for reading their content, if this property is enabled then the credentials do not have to be set";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_CONF = "camel.source.endpoint.streamReadSize";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_DOC = "Set the minimum read size in bytes when reading the blob content";
    public static final Integer CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_CONF = "camel.source.endpoint.credentialsAccountKey";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DOC = "Set the storage account key used during authentication phase";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_CONF = "camel.source.endpoint.credentialsAccountName";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DOC = "Set the storage account name used during authentication phase";
    public static final String CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_CONF = "camel.component.azure-blob.azureBlobClient";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_DOC = "The blob service client";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_CONF = "camel.component.azure-blob.blobOffset";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_DOC = "Set the blob offset for the upload or download operations, default is 0";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_DEFAULT = "0";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_CONF = "camel.component.azure-blob.blobType";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_DOC = "Set a blob type, 'blockblob' is default One of: [blockblob] [appendblob] [pageblob]";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_DEFAULT = "blockblob";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_CONF = "camel.component.azure-blob.closeStreamAfterRead";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_DOC = "Close the stream after read or keep it open, default is true";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_CONF = "camel.component.azure-blob.credentials";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_DOC = "Set the storage credentials, required in most cases";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_CONF = "camel.component.azure-blob.dataLength";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_DOC = "Set the data length for the download or page blob upload operations";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_CONF = "camel.component.azure-blob.fileDir";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_DOC = "Set the file directory where the downloaded blobs will be saved to";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_CONF = "camel.component.azure-blob.publicForRead";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_DOC = "Storage resources can be public for reading their content, if this property is enabled then the credentials do not have to be set";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_CONF = "camel.component.azure-blob.streamReadSize";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_DOC = "Set the minimum read size in bytes when reading the blob content";
    public static final Integer CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.azure-blob.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.azure-blob.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_CONF = "camel.component.azure-blob.configuration";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_DOC = "The Blob Service configuration";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_CONF = "camel.component.azure-blob.credentialsAccountKey";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DOC = "Set the storage account key used during authentication phase";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_CONF = "camel.component.azure-blob.credentialsAccountName";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DOC = "Set the storage account name used during authentication phase";
    public static final String CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DEFAULT = null;

    public CamelAzureblobSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzureblobSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZUREBLOB_PATH_CONTAINER_OR_BLOB_URI_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_AZURE_BLOB_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_OFFSET_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BLOB_TYPE_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CLOSE_STREAM_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_DATA_LENGTH_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_FILE_DIR_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_PUBLIC_FOR_READ_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_STREAM_READ_SIZE_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_ENDPOINT_CREDENTIALS_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_AZURE_BLOB_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_OFFSET_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BLOB_TYPE_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CLOSE_STREAM_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_DATA_LENGTH_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_FILE_DIR_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_PUBLIC_FOR_READ_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_STREAM_READ_SIZE_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZUREBLOB_COMPONENT_CREDENTIALS_ACCOUNT_NAME_DOC);
        return conf;
    }
}