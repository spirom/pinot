package com.linkedin.pinot.controller.helix.starter;

import org.apache.commons.lang.StringUtils;


public class HelixConfig {
  public static final String HELIX_ZK_PATH_PREFIX = "pinot-helix";
  public static final String PINOT_RESOURCE_MANAGER = "HelixResourceManager";

  public static String getAbsoluteZkPathForHelix(String zkBaseUrl) {
    zkBaseUrl = StringUtils.chomp(zkBaseUrl, "/");

    final String[] paths = { zkBaseUrl, HELIX_ZK_PATH_PREFIX };
    return StringUtils.join(paths, "/");
  }
}