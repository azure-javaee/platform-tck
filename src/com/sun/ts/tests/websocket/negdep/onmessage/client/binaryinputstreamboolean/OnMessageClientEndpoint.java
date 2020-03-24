/*
 * Copyright (c) 2015, 2020 Oracle and/or its affiliates and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.websocket.negdep.onmessage.client.binaryinputstreamboolean;

import java.io.InputStream;
import java.nio.ByteBuffer;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;

import com.sun.ts.tests.websocket.common.client.AnnotatedByteBufferClientEndpoint;

@ClientEndpoint
public class OnMessageClientEndpoint extends AnnotatedByteBufferClientEndpoint {

  @OnMessage
  public void onMessage(InputStream msg, boolean finito) {
    // there is no server endpoint that sends binary messages
  }

  @OnError
  public void onError(Session session, Throwable t) {
    clientEndpoint.onError(session, t);
  }

  @OnMessage
  public void onMessage(String msg) {
    clientEndpoint.onMessage(ByteBuffer.wrap(msg.getBytes()));
  }

  @OnOpen
  public void onOpen(Session session, EndpointConfig config) {
    clientEndpoint.onOpen(session, config, false);
  }
}
