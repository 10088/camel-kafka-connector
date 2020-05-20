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
package org.apache.camel.kafkaconnector.jcr;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJcrSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JCR_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_JCR_PATH_HOST_DOC = "Name of the javax.jcr.Repository to lookup from the Camel registry to be used.";
    public static final String CAMEL_SINK_JCR_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_PATH_BASE_CONF = "camel.sink.path.base";
    public static final String CAMEL_SINK_JCR_PATH_BASE_DOC = "Get the base node when accessing the repository";
    public static final String CAMEL_SINK_JCR_PATH_BASE_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_DEEP_CONF = "camel.sink.endpoint.deep";
    public static final String CAMEL_SINK_JCR_ENDPOINT_DEEP_DOC = "When isDeep is true, events whose associated parent node is at absPath or within its subgraph are received.";
    public static final Boolean CAMEL_SINK_JCR_ENDPOINT_DEEP_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_CONF = "camel.sink.endpoint.eventTypes";
    public static final String CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_DOC = "eventTypes (a combination of one or more event types encoded as a bit mask value such as javax.jcr.observation.Event.NODE_ADDED, javax.jcr.observation.Event.NODE_REMOVED, etc.).";
    public static final Integer CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_CONF = "camel.sink.endpoint.nodeTypeNames";
    public static final String CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_DOC = "When a comma separated nodeTypeName list string is set, only events whose associated parent node has one of the node types (or a subtype of one of the node types) in this list will be received.";
    public static final String CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_CONF = "camel.sink.endpoint.noLocal";
    public static final String CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_DOC = "If noLocal is true, then events generated by the session through which the listener was registered are ignored. Otherwise, they are not ignored.";
    public static final Boolean CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_JCR_ENDPOINT_PASSWORD_DOC = "Password for login";
    public static final String CAMEL_SINK_JCR_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_CONF = "camel.sink.endpoint.sessionLiveCheckInterval";
    public static final String CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_DOC = "Interval in milliseconds to wait before each session live checking The default value is 60000 ms.";
    public static final Long CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_DEFAULT = 60000L;
    public static final String CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_CONF = "camel.sink.endpoint.sessionLiveCheckIntervalOnStart";
    public static final String CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_DOC = "Interval in milliseconds to wait before the first session live checking. The default value is 3000 ms.";
    public static final Long CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_DEFAULT = 3000L;
    public static final String CAMEL_SINK_JCR_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_JCR_ENDPOINT_USERNAME_DOC = "Username for login";
    public static final String CAMEL_SINK_JCR_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_UUIDS_CONF = "camel.sink.endpoint.uuids";
    public static final String CAMEL_SINK_JCR_ENDPOINT_UUIDS_DOC = "When a comma separated uuid list string is set, only events whose associated parent node has one of the identifiers in the comma separated uuid list will be received.";
    public static final String CAMEL_SINK_JCR_ENDPOINT_UUIDS_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_CONF = "camel.sink.endpoint.workspaceName";
    public static final String CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_DOC = "The workspace to access. If it's not specified then the default one will be used";
    public static final String CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.jcr.lazyStartProducer";
    public static final String CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.jcr.basicPropertyBinding";
    public static final String CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelJcrSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJcrSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JCR_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JCR_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_JCR_PATH_BASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_PATH_BASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_PATH_BASE_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_DEEP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_ENDPOINT_DEEP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_DEEP_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_CONF, ConfigDef.Type.INT, CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_EVENT_TYPES_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_NODE_TYPE_NAMES_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_NO_LOCAL_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_CONF, ConfigDef.Type.LONG, CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_CONF, ConfigDef.Type.LONG, CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_SESSION_LIVE_CHECK_INTERVAL_ON_START_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_UUIDS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_ENDPOINT_UUIDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_UUIDS_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_WORKSPACE_NAME_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JCR_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}