/*
 * Copyright (c) 2013, 2020 Oracle and/or its affiliates and others.
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

package com.sun.ts.tests.websocket.ee.javax.websocket.clientendpointonmessage;

import java.io.IOException;
import java.nio.ByteBuffer;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.CloseReason;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;

import com.sun.ts.tests.websocket.common.client.AnnotatedClientEndpoint;
import com.sun.ts.tests.websocket.common.client.ByteBufferClientEndpoint;

@ClientEndpoint
public class WSByteBufferAndSessionClientEndpoint
    extends AnnotatedClientEndpoint<ByteBuffer> {
  public WSByteBufferAndSessionClientEndpoint() {
    super(new ByteBufferClientEndpoint());
  }

  @OnMessage
  public void echo(ByteBuffer b, Session s) throws IOException {
    super.onMessage(b);
    s.getBasicRemote().sendBinary(b);
  }

  @OnError
  @Override
  public void onError(Session session, Throwable t) {
    super.onError(session, t);
  }

  @OnClose
  @Override
  public void onClose(Session session, CloseReason closeReason) {
    super.onClose(session, closeReason);
  }

  @OnOpen
  @Override
  public void onOpen(Session session, EndpointConfig config) {
    super.onOpen(session, config);
  }
}
