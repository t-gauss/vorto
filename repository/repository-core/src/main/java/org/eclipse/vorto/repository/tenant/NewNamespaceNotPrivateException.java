/**
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.vorto.repository.tenant;

import java.util.List;
import org.eclipse.xtext.util.Strings;

public class NewNamespaceNotPrivateException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = -4438741182469165758L;

  public NewNamespaceNotPrivateException(List<String> nonPrivateNamespaces) {
    super("Non-private namespaces are not allowed : " + Strings.concat(",", nonPrivateNamespaces));
  }
}
