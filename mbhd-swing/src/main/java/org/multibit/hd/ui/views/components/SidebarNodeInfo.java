package org.multibit.hd.ui.views.components;

import org.multibit.hd.ui.views.detail_views.DetailView;

/**
 * <p>Value object to provide the following to sidebar tree nodes:</p>
 * <ul>
 * <li>Localised (or custom) text for the node</li>
 * <li>Required detail screen</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class SidebarNodeInfo {

  private final String text;
  private final DetailView detailScreen;

  /**
   * @param text         The text to display for custom nodes (e.g. wallet names)
   * @param detailScreen The detail screen to show if the node is selected
   */
  public SidebarNodeInfo(String text, DetailView detailScreen) {
    this.text = text;
    this.detailScreen = detailScreen;
  }

  public String getText() {
    return text;
  }

  public DetailView getDetailScreen() {
    return detailScreen;
  }
}
