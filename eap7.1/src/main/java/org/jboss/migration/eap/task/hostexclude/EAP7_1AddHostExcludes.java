/*
 * Copyright 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.migration.eap.task.hostexclude;

import org.jboss.migration.core.jboss.HostExclude;
import org.jboss.migration.core.jboss.HostExcludes;
import org.jboss.migration.wfly10.config.task.hostexclude.AddHostExcludes;

/**
 * @author emmartins
 */
public class EAP7_1AddHostExcludes<S> extends AddHostExcludes<S> {

    private static final HostExcludes HOST_EXCLUDES = HostExcludes.builder()
            .hostExclude(HostExclude.builder()
                    .name("EAP62")
                    .release("EAP6.2")
                    .excludedExtension("org.wildfly.extension.batch.jberet")
                    .excludedExtension("org.wildfly.extension.bean-validation")
                    .excludedExtension("org.wildfly.extension.clustering.singleton")
                    .excludedExtension("org.wildfly.extension.core-management")
                    .excludedExtension("org.wildfly.extension.discovery")
                    .excludedExtension("org.wildfly.extension.elytron")
                    .excludedExtension("org.wildfly.extension.io")
                    .excludedExtension("org.wildfly.extension.messaging-activemq")
                    .excludedExtension("org.wildfly.extension.request-controller")
                    .excludedExtension("org.wildfly.extension.security.manager")
                    .excludedExtension("org.wildfly.extension.undertow")
                    .excludedExtension("org.wildfly.iiop-openjdk"))
            .hostExclude(HostExclude.builder()
                    .name("EAP63")
                    .release("EAP6.3")
                    .excludedExtension("org.wildfly.extension.batch.jberet")
                    .excludedExtension("org.wildfly.extension.bean-validation")
                    .excludedExtension("org.wildfly.extension.clustering.singleton")
                    .excludedExtension("org.wildfly.extension.core-management")
                    .excludedExtension("org.wildfly.extension.discovery")
                    .excludedExtension("org.wildfly.extension.elytron")
                    .excludedExtension("org.wildfly.extension.io")
                    .excludedExtension("org.wildfly.extension.messaging-activemq")
                    .excludedExtension("org.wildfly.extension.request-controller")
                    .excludedExtension("org.wildfly.extension.security.manager")
                    .excludedExtension("org.wildfly.extension.undertow")
                    .excludedExtension("org.wildfly.iiop-openjdk"))
            .hostExclude(HostExclude.builder()
                    .name("EAP64")
                    .release("EAP6.4")
                    .excludedExtension("org.wildfly.extension.batch.jberet")
                    .excludedExtension("org.wildfly.extension.bean-validation")
                    .excludedExtension("org.wildfly.extension.clustering.singleton")
                    .excludedExtension("org.wildfly.extension.core-management")
                    .excludedExtension("org.wildfly.extension.discovery")
                    .excludedExtension("org.wildfly.extension.elytron")
                    .excludedExtension("org.wildfly.extension.io")
                    .excludedExtension("org.wildfly.extension.messaging-activemq")
                    .excludedExtension("org.wildfly.extension.request-controller")
                    .excludedExtension("org.wildfly.extension.security.manager")
                    .excludedExtension("org.wildfly.extension.undertow")
                    .excludedExtension("org.wildfly.iiop-openjdk"))
            .hostExclude(HostExclude.builder()
                    .name("EAP64z")
                    .apiVersion("1","8")
                    .excludedExtension("org.wildfly.extension.batch.jberet")
                    .excludedExtension("org.wildfly.extension.bean-validation")
                    .excludedExtension("org.wildfly.extension.clustering.singleton")
                    .excludedExtension("org.wildfly.extension.core-management")
                    .excludedExtension("org.wildfly.extension.discovery")
                    .excludedExtension("org.wildfly.extension.elytron")
                    .excludedExtension("org.wildfly.extension.io")
                    .excludedExtension("org.wildfly.extension.messaging-activemq")
                    .excludedExtension("org.wildfly.extension.request-controller")
                    .excludedExtension("org.wildfly.extension.security.manager")
                    .excludedExtension("org.wildfly.extension.undertow")
                    .excludedExtension("org.wildfly.iiop-openjdk"))
            .hostExclude(HostExclude.builder()
                    .name("EAP70")
                    .release("EAP7.0")
                    .excludedExtension("org.wildfly.extension.core-management")
                    .excludedExtension("org.wildfly.extension.discovery")
                    .excludedExtension("org.wildfly.extension.elytron"))
            .build();

    public EAP7_1AddHostExcludes() {
        super(HOST_EXCLUDES);
    }
}
