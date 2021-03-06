/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.server.dhcp.options.dhcp;

import org.apache.directory.server.dhcp.options.DhcpOption;

/**
 * This pseudo option represents all options which have not been recognized and
 * parsed as specific implementations. No special semantics are associated with
 * it. Users are therefore required to manually deal with the contained data.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class UnrecognizedOption extends DhcpOption {

    private final byte tag;

    public UnrecognizedOption() {
        tag = -1;
    }


    /*
     * @see org.apache.directory.server.dhcp.options.DhcpOption#getTag()
     */
    @Override
    public byte getTag() {
        return tag;
    }

    public UnrecognizedOption(byte tag) {
        this.tag = tag;
    }
}
