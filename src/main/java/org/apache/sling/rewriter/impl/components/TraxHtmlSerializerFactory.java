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
package org.apache.sling.rewriter.impl.components;

import org.apache.sling.rewriter.SerializerFactory;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;


/**
 * This sax serializer serializes html-
 */
@Component(service = SerializerFactory.class,
    property = {
            Constants.SERVICE_VENDOR + "=The Apache Software Foundation",
            "pipeline.type=trax-html-serializer"
    })
public class TraxHtmlSerializerFactory extends AbstractTraxSerializerFactory {

    @Override
    protected String getOutputFormat() {
        return "html";
    }

    @Override
    protected String getDoctypePublic() {
        return "-//W3C//DTD HTML 4.01 Transitional//EN";
    }

    @Override
    protected String getDoctypeSystem() {
        return "http://www.w3.org/TR/html4/loose.dtd";
    }
}
