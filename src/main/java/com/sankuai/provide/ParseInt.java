/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sankuai.provide;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ParseInt implements org.apache.thrift.TEnum {
  ONE(1),
  TWO(2),
  Three(3),
  FORE(4);

  private final int value;

  private ParseInt(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ParseInt findByValue(int value) { 
    switch (value) {
      case 1:
        return ONE;
      case 2:
        return TWO;
      case 3:
        return Three;
      case 4:
        return FORE;
      default:
        return null;
    }
  }
}