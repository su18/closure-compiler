// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conformance.proto

package com.google.javascript.jscomp;

public final class Conformance {
  private Conformance() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_ConformanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_ConformanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_Requirement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_Requirement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021conformance.proto\022\006jscomp\"=\n\021Conforman" +
      "ceConfig\022(\n\013requirement\030\001 \003(\0132\023.jscomp.R" +
      "equirement\"\303\004\n\013Requirement\022\025\n\rerror_mess" +
      "age\030\001 \001(\t\022\021\n\twhitelist\030\002 \003(\t\022\030\n\020whitelis" +
      "t_regexp\030\003 \003(\t\022\025\n\ronly_apply_to\030\004 \003(\t\022\034\n" +
      "\024only_apply_to_regexp\030\005 \003(\t\022&\n\004type\030\006 \001(" +
      "\0162\030.jscomp.Requirement.Type\022\r\n\005value\030\007 \003" +
      "(\t\022\022\n\njava_class\030\010 \001(\t\022\017\n\007rule_id\030\t \001(\t\022" +
      "\017\n\007extends\030\n \001(\t\022*\n\034report_loose_type_vi" +
      "olations\030\013 \001(\010:\004true\"\225\002\n\004Type\022\n\n\006CUSTOM\020",
      "\001\022\025\n\021BANNED_DEPENDENCY\020\002\022\017\n\013BANNED_NAME\020" +
      "\003\022\023\n\017BANNED_PROPERTY\020\004\022\030\n\024BANNED_PROPERT" +
      "Y_READ\020\005\022\031\n\025BANNED_PROPERTY_WRITE\020\006\022\030\n\024R" +
      "ESTRICTED_NAME_CALL\020\007\022\032\n\026RESTRICTED_METH" +
      "OD_CALL\020\010\022\027\n\023BANNED_CODE_PATTERN\020\t\022\030\n\024BA" +
      "NNED_PROPERTY_CALL\020\n\022&\n\"BANNED_PROPERTY_" +
      "NON_CONSTANT_WRITE\020\013*\n\010\300\204=\020\200\200\200\200\002B \n\034com." +
      "google.javascript.jscompP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_jscomp_ConformanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_jscomp_ConformanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_ConformanceConfig_descriptor,
        new java.lang.String[] { "Requirement", });
    internal_static_jscomp_Requirement_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_jscomp_Requirement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_Requirement_descriptor,
        new java.lang.String[] { "ErrorMessage", "Whitelist", "WhitelistRegexp", "OnlyApplyTo", "OnlyApplyToRegexp", "Type", "Value", "JavaClass", "RuleId", "Extends", "ReportLooseTypeViolations", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
