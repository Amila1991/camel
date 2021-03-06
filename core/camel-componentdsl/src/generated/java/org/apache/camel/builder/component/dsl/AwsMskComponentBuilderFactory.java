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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.msk.MSKComponent;

/**
 * The aws-msk is used for managing Amazon MSK
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsMskComponentBuilderFactory {

    /**
     * AWS MSK (camel-aws-msk)
     * The aws-msk is used for managing Amazon MSK
     * 
     * Category: cloud,management
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-msk
     */
    static AwsMskComponentBuilder awsMsk() {
        return new AwsMskComponentBuilderImpl();
    }

    /**
     * Builder for the AWS MSK component.
     */
    interface AwsMskComponentBuilder extends ComponentBuilder<MSKComponent> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.msk.MSKConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder configuration(
                org.apache.camel.component.aws.msk.MSKConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsMskComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured AWS MSK as client.
         * 
         * The option is a: <code>com.amazonaws.services.kafka.AWSKafka</code>
         * type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder mskClient(
                com.amazonaws.services.kafka.AWSKafka mskClient) {
            doSetProperty("mskClient", mskClient);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.msk.MSKOperations</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder operation(
                org.apache.camel.component.aws.msk.MSKOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MSK client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default AwsMskComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which MSK client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsMskComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsMskComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class AwsMskComponentBuilderImpl
            extends
                AbstractComponentBuilder<MSKComponent>
            implements
                AwsMskComponentBuilder {
        @Override
        protected MSKComponent buildConcreteComponent() {
            return new MSKComponent();
        }
        private org.apache.camel.component.aws.msk.MSKConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.msk.MSKComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.msk.MSKConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": getOrCreateConfiguration((MSKComponent) component).setAccessKey((java.lang.String) value); return true;
            case "configuration": ((MSKComponent) component).setConfiguration((org.apache.camel.component.aws.msk.MSKConfiguration) value); return true;
            case "lazyStartProducer": ((MSKComponent) component).setLazyStartProducer((boolean) value); return true;
            case "mskClient": getOrCreateConfiguration((MSKComponent) component).setMskClient((com.amazonaws.services.kafka.AWSKafka) value); return true;
            case "operation": getOrCreateConfiguration((MSKComponent) component).setOperation((org.apache.camel.component.aws.msk.MSKOperations) value); return true;
            case "proxyHost": getOrCreateConfiguration((MSKComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((MSKComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((MSKComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((MSKComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((MSKComponent) component).setSecretKey((java.lang.String) value); return true;
            case "basicPropertyBinding": ((MSKComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}