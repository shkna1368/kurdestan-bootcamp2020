// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee-service.proto

package com.kurdestanbootcamp.postemployeeservice;

public interface EmployeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmployeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>sint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string family = 3;</code>
   */
  java.lang.String getFamily();
  /**
   * <code>string family = 3;</code>
   */
  com.google.protobuf.ByteString
      getFamilyBytes();

  /**
   * <code>string nationalCode = 4;</code>
   */
  java.lang.String getNationalCode();
  /**
   * <code>string nationalCode = 4;</code>
   */
  com.google.protobuf.ByteString
      getNationalCodeBytes();

  /**
   * <code>sint64 birthDay = 5;</code>
   */
  long getBirthDay();

  /**
   * <code>bool isMarried = 6;</code>
   */
  boolean getIsMarried();

  /**
   * <code>int32 childCount = 7;</code>
   */
  int getChildCount();
}