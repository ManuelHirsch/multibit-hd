package org.multibit.hd.ui.events.controller;

import org.multibit.hd.core.services.CoreServices;
import org.multibit.hd.ui.models.AlertModel;
import org.multibit.hd.ui.views.detail_views.DetailView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * <p>Factory to provide the following to application API:</p>
 * <ul>
 * <li>Entry point to broadcast application events associated with UI controllers</li>
 * </ul>
 * <p>An application event is a high level event with specific semantics. Normally a
 * low level event (such as a mouse click) will initiate it.</p>
 *
 * @since 0.0.1
 *         
 */
public class ControllerEvents {

  private static final Logger log = LoggerFactory.getLogger(ControllerEvents.class);

  /**
   * Utilities have a private constructor
   */
  private ControllerEvents() {
  }

  /**
   * <p>Broadcast a new "change locale" event</p>
   *
   * @param locale The new locale
   */
  public static void fireChangeLocaleEvent(Locale locale) {
    log.debug("Firing 'change locale' event");
    CoreServices.uiEventBus.post(new ChangeLocaleEvent(locale));
  }

  /**
   * <p>Broadcast a new "show detail screen" event</p>
   *
   * @param detailScreen The screen to show
   */
  public static void fireShowDetailScreenEvent(DetailView detailScreen) {
    log.debug("Firing 'show detail screen' event");
    CoreServices.uiEventBus.post(new ShowDetailScreenEvent(detailScreen));
  }

  /**
   * <p>Broadcast a new "add alert" event</p>
   *
   * @param alertModel The alert model
   */
  public static void fireAddAlertEvent(AlertModel alertModel) {
    log.debug("Firing 'add alert' event");
    CoreServices.uiEventBus.post(new AddAlertEvent(alertModel));
  }

  /**
   * <p>Broadcast a new "remove alert" event</p>
   */
  public static void fireRemoveAlertEvent() {
    log.debug("Firing 'remove alert' event");
    CoreServices.uiEventBus.post(new RemoveAlertEvent());
  }

}