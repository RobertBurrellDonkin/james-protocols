/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.protocols.api;

/**
 * Implementations of this Interface will get called after a full line (terminated with \r\n) was received.
 * 
 * Only one {@link LineHandler} will get called per line
 */
public interface LineHandler<Session extends ProtocolSession> {
     
    /**
     * Processing the give line. The line includes the CRLF delimiter.
     * If true is returned the connection is closed
     * 
     * @param session not null
     * @param line not null 
     * @return disconnect
     */
    boolean onLine(Session session, byte[] line);
    
}
