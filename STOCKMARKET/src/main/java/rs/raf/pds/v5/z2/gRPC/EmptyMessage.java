// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package rs.raf.pds.v5.z2.gRPC;

/**
 * Protobuf type {@code EmptyMessage}
 */
public final class EmptyMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmptyMessage)
    EmptyMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmptyMessage.newBuilder() to construct.
  private EmptyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmptyMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmptyMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_EmptyMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_EmptyMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.v5.z2.gRPC.EmptyMessage.class, rs.raf.pds.v5.z2.gRPC.EmptyMessage.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rs.raf.pds.v5.z2.gRPC.EmptyMessage)) {
      return super.equals(obj);
    }
    rs.raf.pds.v5.z2.gRPC.EmptyMessage other = (rs.raf.pds.v5.z2.gRPC.EmptyMessage) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(rs.raf.pds.v5.z2.gRPC.EmptyMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code EmptyMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmptyMessage)
      rs.raf.pds.v5.z2.gRPC.EmptyMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_EmptyMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_EmptyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.v5.z2.gRPC.EmptyMessage.class, rs.raf.pds.v5.z2.gRPC.EmptyMessage.Builder.class);
    }

    // Construct using rs.raf.pds.v5.z2.gRPC.EmptyMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_EmptyMessage_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.EmptyMessage getDefaultInstanceForType() {
      return rs.raf.pds.v5.z2.gRPC.EmptyMessage.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.EmptyMessage build() {
      rs.raf.pds.v5.z2.gRPC.EmptyMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.EmptyMessage buildPartial() {
      rs.raf.pds.v5.z2.gRPC.EmptyMessage result = new rs.raf.pds.v5.z2.gRPC.EmptyMessage(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.v5.z2.gRPC.EmptyMessage) {
        return mergeFrom((rs.raf.pds.v5.z2.gRPC.EmptyMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.v5.z2.gRPC.EmptyMessage other) {
      if (other == rs.raf.pds.v5.z2.gRPC.EmptyMessage.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:EmptyMessage)
  }

  // @@protoc_insertion_point(class_scope:EmptyMessage)
  private static final rs.raf.pds.v5.z2.gRPC.EmptyMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.v5.z2.gRPC.EmptyMessage();
  }

  public static rs.raf.pds.v5.z2.gRPC.EmptyMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyMessage>
      PARSER = new com.google.protobuf.AbstractParser<EmptyMessage>() {
    @java.lang.Override
    public EmptyMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EmptyMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmptyMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.EmptyMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

