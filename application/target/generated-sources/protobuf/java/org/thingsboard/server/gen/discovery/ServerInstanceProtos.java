// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: discovery.proto

package org.thingsboard.server.gen.discovery;

public final class ServerInstanceProtos {
  private ServerInstanceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:discovery.ServerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string host = 1;</code>
     */
    java.lang.String getHost();
    /**
     * <code>optional string host = 1;</code>
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>optional int32 port = 2;</code>
     */
    int getPort();

    /**
     * <code>optional int64 ts = 3;</code>
     */
    long getTs();
  }
  /**
   * Protobuf type {@code discovery.ServerInfo}
   */
  public  static final class ServerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:discovery.ServerInfo)
      ServerInfoOrBuilder {
    // Use ServerInfo.newBuilder() to construct.
    private ServerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerInfo() {
      host_ = "";
      port_ = 0;
      ts_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ServerInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              host_ = s;
              break;
            }
            case 16: {

              port_ = input.readInt32();
              break;
            }
            case 24: {

              ts_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thingsboard.server.gen.discovery.ServerInstanceProtos.internal_static_discovery_ServerInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thingsboard.server.gen.discovery.ServerInstanceProtos.internal_static_discovery_ServerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.class, org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.Builder.class);
    }

    public static final int HOST_FIELD_NUMBER = 1;
    private volatile java.lang.Object host_;
    /**
     * <code>optional string host = 1;</code>
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <code>optional int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }

    public static final int TS_FIELD_NUMBER = 3;
    private long ts_;
    /**
     * <code>optional int64 ts = 3;</code>
     */
    public long getTs() {
      return ts_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
      }
      if (port_ != 0) {
        output.writeInt32(2, port_);
      }
      if (ts_ != 0L) {
        output.writeInt64(3, ts_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
      }
      if (port_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, port_);
      }
      if (ts_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, ts_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo)) {
        return super.equals(obj);
      }
      org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo other = (org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo) obj;

      boolean result = true;
      result = result && getHost()
          .equals(other.getHost());
      result = result && (getPort()
          == other.getPort());
      result = result && (getTs()
          == other.getTs());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort();
      hash = (37 * hash) + TS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code discovery.ServerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:discovery.ServerInfo)
        org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.thingsboard.server.gen.discovery.ServerInstanceProtos.internal_static_discovery_ServerInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.thingsboard.server.gen.discovery.ServerInstanceProtos.internal_static_discovery_ServerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.class, org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.Builder.class);
      }

      // Construct using org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        host_ = "";

        port_ = 0;

        ts_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.thingsboard.server.gen.discovery.ServerInstanceProtos.internal_static_discovery_ServerInfo_descriptor;
      }

      public org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo getDefaultInstanceForType() {
        return org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.getDefaultInstance();
      }

      public org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo build() {
        org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo buildPartial() {
        org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo result = new org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo(this);
        result.host_ = host_;
        result.port_ = port_;
        result.ts_ = ts_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo) {
          return mergeFrom((org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo other) {
        if (other == org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo.getDefaultInstance()) return this;
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (other.getPort() != 0) {
          setPort(other.getPort());
        }
        if (other.getTs() != 0L) {
          setTs(other.getTs());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object host_ = "";
      /**
       * <code>optional string host = 1;</code>
       */
      public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string host = 1;</code>
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string host = 1;</code>
       */
      public Builder setHost(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string host = 1;</code>
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>optional string host = 1;</code>
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>optional int32 port = 2;</code>
       */
      public int getPort() {
        return port_;
      }
      /**
       * <code>optional int32 port = 2;</code>
       */
      public Builder setPort(int value) {
        
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 port = 2;</code>
       */
      public Builder clearPort() {
        
        port_ = 0;
        onChanged();
        return this;
      }

      private long ts_ ;
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public long getTs() {
        return ts_;
      }
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public Builder setTs(long value) {
        
        ts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public Builder clearTs() {
        
        ts_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:discovery.ServerInfo)
    }

    // @@protoc_insertion_point(class_scope:discovery.ServerInfo)
    private static final org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo();
    }

    public static org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerInfo>
        PARSER = new com.google.protobuf.AbstractParser<ServerInfo>() {
      public ServerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ServerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerInfo> getParserForType() {
      return PARSER;
    }

    public org.thingsboard.server.gen.discovery.ServerInstanceProtos.ServerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_discovery_ServerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_discovery_ServerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017discovery.proto\022\tdiscovery\"4\n\nServerIn" +
      "fo\022\014\n\004host\030\001 \001(\t\022\014\n\004port\030\002 \001(\005\022\n\n\002ts\030\003 \001" +
      "(\003B<\n$org.thingsboard.server.gen.discove" +
      "ryB\024ServerInstanceProtosb\006proto3"
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
    internal_static_discovery_ServerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_discovery_ServerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_discovery_ServerInfo_descriptor,
        new java.lang.String[] { "Host", "Port", "Ts", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}