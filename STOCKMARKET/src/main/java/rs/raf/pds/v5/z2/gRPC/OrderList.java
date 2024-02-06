// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package rs.raf.pds.v5.z2.gRPC;

/**
 * Protobuf type {@code OrderList}
 */
public final class OrderList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderList)
    OrderListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderList.newBuilder() to construct.
  private OrderList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderList() {
    offers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_OrderList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_OrderList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.v5.z2.gRPC.OrderList.class, rs.raf.pds.v5.z2.gRPC.OrderList.Builder.class);
  }

  public static final int OFFERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<rs.raf.pds.v5.z2.gRPC.Order> offers_;
  /**
   * <code>repeated .Order offers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<rs.raf.pds.v5.z2.gRPC.Order> getOffersList() {
    return offers_;
  }
  /**
   * <code>repeated .Order offers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends rs.raf.pds.v5.z2.gRPC.OrderOrBuilder> 
      getOffersOrBuilderList() {
    return offers_;
  }
  /**
   * <code>repeated .Order offers = 1;</code>
   */
  @java.lang.Override
  public int getOffersCount() {
    return offers_.size();
  }
  /**
   * <code>repeated .Order offers = 1;</code>
   */
  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.Order getOffers(int index) {
    return offers_.get(index);
  }
  /**
   * <code>repeated .Order offers = 1;</code>
   */
  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.OrderOrBuilder getOffersOrBuilder(
      int index) {
    return offers_.get(index);
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
    for (int i = 0; i < offers_.size(); i++) {
      output.writeMessage(1, offers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < offers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, offers_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rs.raf.pds.v5.z2.gRPC.OrderList)) {
      return super.equals(obj);
    }
    rs.raf.pds.v5.z2.gRPC.OrderList other = (rs.raf.pds.v5.z2.gRPC.OrderList) obj;

    if (!getOffersList()
        .equals(other.getOffersList())) return false;
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
    if (getOffersCount() > 0) {
      hash = (37 * hash) + OFFERS_FIELD_NUMBER;
      hash = (53 * hash) + getOffersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.OrderList parseFrom(
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
  public static Builder newBuilder(rs.raf.pds.v5.z2.gRPC.OrderList prototype) {
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
   * Protobuf type {@code OrderList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderList)
      rs.raf.pds.v5.z2.gRPC.OrderListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_OrderList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_OrderList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.v5.z2.gRPC.OrderList.class, rs.raf.pds.v5.z2.gRPC.OrderList.Builder.class);
    }

    // Construct using rs.raf.pds.v5.z2.gRPC.OrderList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (offersBuilder_ == null) {
        offers_ = java.util.Collections.emptyList();
      } else {
        offers_ = null;
        offersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_OrderList_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.OrderList getDefaultInstanceForType() {
      return rs.raf.pds.v5.z2.gRPC.OrderList.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.OrderList build() {
      rs.raf.pds.v5.z2.gRPC.OrderList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.OrderList buildPartial() {
      rs.raf.pds.v5.z2.gRPC.OrderList result = new rs.raf.pds.v5.z2.gRPC.OrderList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(rs.raf.pds.v5.z2.gRPC.OrderList result) {
      if (offersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          offers_ = java.util.Collections.unmodifiableList(offers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.offers_ = offers_;
      } else {
        result.offers_ = offersBuilder_.build();
      }
    }

    private void buildPartial0(rs.raf.pds.v5.z2.gRPC.OrderList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.v5.z2.gRPC.OrderList) {
        return mergeFrom((rs.raf.pds.v5.z2.gRPC.OrderList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.v5.z2.gRPC.OrderList other) {
      if (other == rs.raf.pds.v5.z2.gRPC.OrderList.getDefaultInstance()) return this;
      if (offersBuilder_ == null) {
        if (!other.offers_.isEmpty()) {
          if (offers_.isEmpty()) {
            offers_ = other.offers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOffersIsMutable();
            offers_.addAll(other.offers_);
          }
          onChanged();
        }
      } else {
        if (!other.offers_.isEmpty()) {
          if (offersBuilder_.isEmpty()) {
            offersBuilder_.dispose();
            offersBuilder_ = null;
            offers_ = other.offers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            offersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOffersFieldBuilder() : null;
          } else {
            offersBuilder_.addAllMessages(other.offers_);
          }
        }
      }
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
            case 10: {
              rs.raf.pds.v5.z2.gRPC.Order m =
                  input.readMessage(
                      rs.raf.pds.v5.z2.gRPC.Order.parser(),
                      extensionRegistry);
              if (offersBuilder_ == null) {
                ensureOffersIsMutable();
                offers_.add(m);
              } else {
                offersBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<rs.raf.pds.v5.z2.gRPC.Order> offers_ =
      java.util.Collections.emptyList();
    private void ensureOffersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        offers_ = new java.util.ArrayList<rs.raf.pds.v5.z2.gRPC.Order>(offers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        rs.raf.pds.v5.z2.gRPC.Order, rs.raf.pds.v5.z2.gRPC.Order.Builder, rs.raf.pds.v5.z2.gRPC.OrderOrBuilder> offersBuilder_;

    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public java.util.List<rs.raf.pds.v5.z2.gRPC.Order> getOffersList() {
      if (offersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(offers_);
      } else {
        return offersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public int getOffersCount() {
      if (offersBuilder_ == null) {
        return offers_.size();
      } else {
        return offersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.Order getOffers(int index) {
      if (offersBuilder_ == null) {
        return offers_.get(index);
      } else {
        return offersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder setOffers(
        int index, rs.raf.pds.v5.z2.gRPC.Order value) {
      if (offersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOffersIsMutable();
        offers_.set(index, value);
        onChanged();
      } else {
        offersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder setOffers(
        int index, rs.raf.pds.v5.z2.gRPC.Order.Builder builderForValue) {
      if (offersBuilder_ == null) {
        ensureOffersIsMutable();
        offers_.set(index, builderForValue.build());
        onChanged();
      } else {
        offersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder addOffers(rs.raf.pds.v5.z2.gRPC.Order value) {
      if (offersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOffersIsMutable();
        offers_.add(value);
        onChanged();
      } else {
        offersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder addOffers(
        int index, rs.raf.pds.v5.z2.gRPC.Order value) {
      if (offersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOffersIsMutable();
        offers_.add(index, value);
        onChanged();
      } else {
        offersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder addOffers(
        rs.raf.pds.v5.z2.gRPC.Order.Builder builderForValue) {
      if (offersBuilder_ == null) {
        ensureOffersIsMutable();
        offers_.add(builderForValue.build());
        onChanged();
      } else {
        offersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder addOffers(
        int index, rs.raf.pds.v5.z2.gRPC.Order.Builder builderForValue) {
      if (offersBuilder_ == null) {
        ensureOffersIsMutable();
        offers_.add(index, builderForValue.build());
        onChanged();
      } else {
        offersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder addAllOffers(
        java.lang.Iterable<? extends rs.raf.pds.v5.z2.gRPC.Order> values) {
      if (offersBuilder_ == null) {
        ensureOffersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, offers_);
        onChanged();
      } else {
        offersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder clearOffers() {
      if (offersBuilder_ == null) {
        offers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        offersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public Builder removeOffers(int index) {
      if (offersBuilder_ == null) {
        ensureOffersIsMutable();
        offers_.remove(index);
        onChanged();
      } else {
        offersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.Order.Builder getOffersBuilder(
        int index) {
      return getOffersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.OrderOrBuilder getOffersOrBuilder(
        int index) {
      if (offersBuilder_ == null) {
        return offers_.get(index);  } else {
        return offersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public java.util.List<? extends rs.raf.pds.v5.z2.gRPC.OrderOrBuilder> 
         getOffersOrBuilderList() {
      if (offersBuilder_ != null) {
        return offersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(offers_);
      }
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.Order.Builder addOffersBuilder() {
      return getOffersFieldBuilder().addBuilder(
          rs.raf.pds.v5.z2.gRPC.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.Order.Builder addOffersBuilder(
        int index) {
      return getOffersFieldBuilder().addBuilder(
          index, rs.raf.pds.v5.z2.gRPC.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .Order offers = 1;</code>
     */
    public java.util.List<rs.raf.pds.v5.z2.gRPC.Order.Builder> 
         getOffersBuilderList() {
      return getOffersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        rs.raf.pds.v5.z2.gRPC.Order, rs.raf.pds.v5.z2.gRPC.Order.Builder, rs.raf.pds.v5.z2.gRPC.OrderOrBuilder> 
        getOffersFieldBuilder() {
      if (offersBuilder_ == null) {
        offersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            rs.raf.pds.v5.z2.gRPC.Order, rs.raf.pds.v5.z2.gRPC.Order.Builder, rs.raf.pds.v5.z2.gRPC.OrderOrBuilder>(
                offers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        offers_ = null;
      }
      return offersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OrderList)
  }

  // @@protoc_insertion_point(class_scope:OrderList)
  private static final rs.raf.pds.v5.z2.gRPC.OrderList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.v5.z2.gRPC.OrderList();
  }

  public static rs.raf.pds.v5.z2.gRPC.OrderList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderList>
      PARSER = new com.google.protobuf.AbstractParser<OrderList>() {
    @java.lang.Override
    public OrderList parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrderList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.OrderList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

