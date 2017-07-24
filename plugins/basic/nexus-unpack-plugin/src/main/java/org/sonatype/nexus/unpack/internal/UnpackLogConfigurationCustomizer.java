/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.unpack.internal;

import javax.inject.Named;
import javax.inject.Singleton;

import org.sonatype.nexus.log.LogConfigurationCustomizer;
import org.sonatype.nexus.log.LoggerLevel;

/**
 * Configures Unpack loggers.
 *
 * @since 2.7
 */
@Singleton
@Named
public class UnpackLogConfigurationCustomizer
    implements LogConfigurationCustomizer
{

  @Override
  public void customize(final Configuration configuration) {
    // Useful loggers (level will be calculated as effective level)
    configuration.setLoggerLevel("org.sonatype.nexus.unpack", LoggerLevel.DEFAULT);
  }

}