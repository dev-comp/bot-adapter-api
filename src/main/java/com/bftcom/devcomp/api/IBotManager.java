package com.bftcom.devcomp.api;

import java.util.Map;

/**
 * @author ikka
 * @date: 16.09.2016.
 */
public interface IBotManager {
  /**
   * @param id     Id of a new bot instance for fast access
   * @param config any config properties necessary to start a bot instance
   * @return true if a bot session started without errors
   */
  boolean startBotSession(String id, Map<String, String> config);

  /**
   * @param id Id of a new bot instance for fast access
   * @return true if a bot session identified by id stopped  without errors
   */
  boolean stopBotSession(String id);
}
