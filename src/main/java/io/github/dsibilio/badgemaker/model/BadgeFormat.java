package io.github.dsibilio.badgemaker.model;

import io.github.dsibilio.badgemaker.core.BadgeFormatBuilder;

/**
 * It is recommended to use the {@link BadgeFormatBuilder}
 * to create instances of this class
 * @author Domenico Sibilio
 */
public class BadgeFormat {

  public static final int SCALE_MULTI_LOWER_BOUND = 1;
  public static final int SCALE_MULTI_UPPER_BOUND = 10000;
  private String label;
  private String message;
  private NamedColor labelColor;
  private NamedColor messageColor;
  private String logo;
  private int scaleMultiplier;

  public BadgeFormat(String label, String message, NamedColor labelColor, NamedColor messageColor, String logo, int scaleMultiplier) {
    this.label = label;
    this.message = message;
    this.labelColor = labelColor;
    this.messageColor = messageColor;
    this.logo = logo;
    this.setScaleMultiplier(scaleMultiplier);
  }

  private static boolean isWithinBounds(int scaleMultiplier) {
    return scaleMultiplier >= SCALE_MULTI_LOWER_BOUND && scaleMultiplier <= SCALE_MULTI_UPPER_BOUND;
  }

  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public NamedColor getLabelColor() {
    return labelColor;
  }
  public void setLabelColor(NamedColor labelColor) {
    this.labelColor = labelColor;
  }
  public NamedColor getMessageColor() {
    return messageColor;
  }
  public void setMessageColor(NamedColor messageColor) {
    this.messageColor = messageColor;
  }
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }
  public int getScaleMultiplier() {
    return scaleMultiplier;
  }
  public void setScaleMultiplier(int scaleMultiplier) {
    this.scaleMultiplier = isWithinBounds(scaleMultiplier) ? scaleMultiplier : 1;
  }

  @Override
  public String toString() {
    return "BadgeFormat [label=" + label + ", labelColor=" + labelColor + ", logo=" + logo + ", message=" + message
        + ", messageColor=" + messageColor + ", scaleMultiplier=" + scaleMultiplier + "]";
  }

}
