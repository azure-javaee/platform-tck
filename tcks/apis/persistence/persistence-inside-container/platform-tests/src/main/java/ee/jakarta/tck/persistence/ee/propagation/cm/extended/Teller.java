/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */

package ee.jakarta.tck.persistence.ee.propagation.cm.extended;

import ee.jakarta.tck.persistence.ee.common.Account;
import ee.jakarta.tck.persistence.ee.common.B;

import java.util.Properties;

public interface Teller {
	public double balance(final int acct);

	public double withdraw(final int acct, final double amt);

	public double deposit(final int acct, final double amt);

	public String getAllAccounts();

	public void removeTestData();

	public void createTestData();

	public boolean checkAccountStatus(final Account account);

	public boolean checkCustomerStatus(final B b);

	public boolean rollbackStatus(final B b);

	public boolean flushStatus(final B b);

	public void init(final Properties p);
}
