// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serivce.proto

package com.guan.sso.server.grpc.server;

public final class SsoServerProtos {
  private SsoServerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_TokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_TokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_TokenReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_TokenReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_LogoutReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_LogoutReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rserivce.proto\022\003api\"\035\n\014TokenRequest\022\r\n\005" +
      "token\030\001 \001(\t\"\031\n\nTokenReply\022\013\n\003uid\030\001 \001(\003\"\036" +
      "\n\rLogoutRequest\022\r\n\005token\030\001 \001(\t\"\r\n\013Logout" +
      "Reply2s\n\nSsoService\0223\n\013verifyToken\022\021.api" +
      ".TokenRequest\032\017.api.TokenReply\"\000\0220\n\006logo" +
      "ut\022\022.api.LogoutRequest\032\020.api.LogoutReply" +
      "\"\000B4\n\037com.guan.sso.server.grpc.serverB\017S" +
      "soServerProtosP\001b\006proto3"
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
    internal_static_api_TokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_TokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_TokenRequest_descriptor,
        new String[] { "Token", });
    internal_static_api_TokenReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_TokenReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_TokenReply_descriptor,
        new String[] { "Uid", });
    internal_static_api_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_LogoutRequest_descriptor,
        new String[] { "Token", });
    internal_static_api_LogoutReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_LogoutReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_LogoutReply_descriptor,
        new String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}