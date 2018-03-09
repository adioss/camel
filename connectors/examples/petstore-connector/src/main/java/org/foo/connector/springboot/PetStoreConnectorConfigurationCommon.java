/**
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
package org.foo.connector.springboot;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Pets in the store
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.connector.SpringBootAutoConfigurationMojo")
public class PetStoreConnectorConfigurationCommon {

    /**
     * Path to the Swagger specification file. The scheme host base path are
     * taken from this specification but these can be overriden with properties
     * on the component or endpoint level. If not given the component tries to
     * load swagger.json resource. Note that the host defined on the component
     * and endpoint of this Component should contain the scheme hostname and
     * optionally the port in the URI syntax (i.e.
     * https://api.example.com:8080). Can be overriden in endpoint
     * configuration.
     */
    private URI specificationUri;
    /**
     * ID of the operation from the Swagger specification.
     */
    private String operationId;
    /**
     * Delay in milli seconds between scheduling (executing)
     */
    private long schedulerPeriod = 5000L;

    public URI getSpecificationUri() {
        return specificationUri;
    }

    public void setSpecificationUri(URI specificationUri) {
        this.specificationUri = specificationUri;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public long getSchedulerPeriod() {
        return schedulerPeriod;
    }

    public void setSchedulerPeriod(long schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
    }
}