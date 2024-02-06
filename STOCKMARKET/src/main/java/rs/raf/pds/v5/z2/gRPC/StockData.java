// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package rs.raf.pds.v5.z2.gRPC;

/**
 * Protobuf type {@code StockData}
 */
public final class StockData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StockData)
    StockDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StockData.newBuilder() to construct.
  private StockData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StockData() {
    symbol_ = "";
    companyName_ = "";
    history_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StockData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_StockData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_StockData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.v5.z2.gRPC.StockData.class, rs.raf.pds.v5.z2.gRPC.StockData.Builder.class);
  }

  public static final int SYMBOL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object symbol_ = "";
  /**
   * <code>string symbol = 1;</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 1;</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPANYNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object companyName_ = "";
  /**
   * <code>string companyName = 2;</code>
   * @return The companyName.
   */
  @java.lang.Override
  public java.lang.String getCompanyName() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyName_ = s;
      return s;
    }
  }
  /**
   * <code>string companyName = 2;</code>
   * @return The bytes for companyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompanyNameBytes() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICEATSTART_FIELD_NUMBER = 3;
  private double priceAtStart_ = 0D;
  /**
   * <code>double priceAtStart = 3;</code>
   * @return The priceAtStart.
   */
  @java.lang.Override
  public double getPriceAtStart() {
    return priceAtStart_;
  }

  public static final int PRICECHANGE_FIELD_NUMBER = 4;
  private double priceChange_ = 0D;
  /**
   * <code>double priceChange = 4;</code>
   * @return The priceChange.
   */
  @java.lang.Override
  public double getPriceChange() {
    return priceChange_;
  }

  public static final int DATE_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp date_;
  /**
   * <code>.google.protobuf.Timestamp date = 5;</code>
   * @return Whether the date field is set.
   */
  @java.lang.Override
  public boolean hasDate() {
    return date_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp date = 5;</code>
   * @return The date.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDate() {
    return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
  }
  /**
   * <code>.google.protobuf.Timestamp date = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDateOrBuilder() {
    return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
  }

  public static final int HISTORY_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList history_;
  /**
   * <pre>
   * Assuming history is a list of price changes
   * </pre>
   *
   * <code>repeated double history = 6;</code>
   * @return A list containing the history.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getHistoryList() {
    return history_;
  }
  /**
   * <pre>
   * Assuming history is a list of price changes
   * </pre>
   *
   * <code>repeated double history = 6;</code>
   * @return The count of history.
   */
  public int getHistoryCount() {
    return history_.size();
  }
  /**
   * <pre>
   * Assuming history is a list of price changes
   * </pre>
   *
   * <code>repeated double history = 6;</code>
   * @param index The index of the element to return.
   * @return The history at the given index.
   */
  public double getHistory(int index) {
    return history_.getDouble(index);
  }
  private int historyMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(companyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companyName_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceAtStart_) != 0) {
      output.writeDouble(3, priceAtStart_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceChange_) != 0) {
      output.writeDouble(4, priceChange_);
    }
    if (date_ != null) {
      output.writeMessage(5, getDate());
    }
    if (getHistoryList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(historyMemoizedSerializedSize);
    }
    for (int i = 0; i < history_.size(); i++) {
      output.writeDoubleNoTag(history_.getDouble(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(symbol_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(companyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companyName_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceAtStart_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, priceAtStart_);
    }
    if (java.lang.Double.doubleToRawLongBits(priceChange_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, priceChange_);
    }
    if (date_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDate());
    }
    {
      int dataSize = 0;
      dataSize = 8 * getHistoryList().size();
      size += dataSize;
      if (!getHistoryList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      historyMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof rs.raf.pds.v5.z2.gRPC.StockData)) {
      return super.equals(obj);
    }
    rs.raf.pds.v5.z2.gRPC.StockData other = (rs.raf.pds.v5.z2.gRPC.StockData) obj;

    if (!getSymbol()
        .equals(other.getSymbol())) return false;
    if (!getCompanyName()
        .equals(other.getCompanyName())) return false;
    if (java.lang.Double.doubleToLongBits(getPriceAtStart())
        != java.lang.Double.doubleToLongBits(
            other.getPriceAtStart())) return false;
    if (java.lang.Double.doubleToLongBits(getPriceChange())
        != java.lang.Double.doubleToLongBits(
            other.getPriceChange())) return false;
    if (hasDate() != other.hasDate()) return false;
    if (hasDate()) {
      if (!getDate()
          .equals(other.getDate())) return false;
    }
    if (!getHistoryList()
        .equals(other.getHistoryList())) return false;
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
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    hash = (37 * hash) + COMPANYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyName().hashCode();
    hash = (37 * hash) + PRICEATSTART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPriceAtStart()));
    hash = (37 * hash) + PRICECHANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPriceChange()));
    if (hasDate()) {
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDate().hashCode();
    }
    if (getHistoryCount() > 0) {
      hash = (37 * hash) + HISTORY_FIELD_NUMBER;
      hash = (53 * hash) + getHistoryList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.StockData parseFrom(
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
  public static Builder newBuilder(rs.raf.pds.v5.z2.gRPC.StockData prototype) {
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
   * Protobuf type {@code StockData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StockData)
      rs.raf.pds.v5.z2.gRPC.StockDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_StockData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_StockData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.v5.z2.gRPC.StockData.class, rs.raf.pds.v5.z2.gRPC.StockData.Builder.class);
    }

    // Construct using rs.raf.pds.v5.z2.gRPC.StockData.newBuilder()
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
      symbol_ = "";
      companyName_ = "";
      priceAtStart_ = 0D;
      priceChange_ = 0D;
      date_ = null;
      if (dateBuilder_ != null) {
        dateBuilder_.dispose();
        dateBuilder_ = null;
      }
      history_ = emptyDoubleList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.internal_static_StockData_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.StockData getDefaultInstanceForType() {
      return rs.raf.pds.v5.z2.gRPC.StockData.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.StockData build() {
      rs.raf.pds.v5.z2.gRPC.StockData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.StockData buildPartial() {
      rs.raf.pds.v5.z2.gRPC.StockData result = new rs.raf.pds.v5.z2.gRPC.StockData(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(rs.raf.pds.v5.z2.gRPC.StockData result) {
      if (((bitField0_ & 0x00000020) != 0)) {
        history_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.history_ = history_;
    }

    private void buildPartial0(rs.raf.pds.v5.z2.gRPC.StockData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.symbol_ = symbol_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.companyName_ = companyName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.priceAtStart_ = priceAtStart_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.priceChange_ = priceChange_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.date_ = dateBuilder_ == null
            ? date_
            : dateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.v5.z2.gRPC.StockData) {
        return mergeFrom((rs.raf.pds.v5.z2.gRPC.StockData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.v5.z2.gRPC.StockData other) {
      if (other == rs.raf.pds.v5.z2.gRPC.StockData.getDefaultInstance()) return this;
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCompanyName().isEmpty()) {
        companyName_ = other.companyName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPriceAtStart() != 0D) {
        setPriceAtStart(other.getPriceAtStart());
      }
      if (other.getPriceChange() != 0D) {
        setPriceChange(other.getPriceChange());
      }
      if (other.hasDate()) {
        mergeDate(other.getDate());
      }
      if (!other.history_.isEmpty()) {
        if (history_.isEmpty()) {
          history_ = other.history_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureHistoryIsMutable();
          history_.addAll(other.history_);
        }
        onChanged();
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
              symbol_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              companyName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 25: {
              priceAtStart_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 33: {
              priceChange_ = input.readDouble();
              bitField0_ |= 0x00000008;
              break;
            } // case 33
            case 42: {
              input.readMessage(
                  getDateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 49: {
              double v = input.readDouble();
              ensureHistoryIsMutable();
              history_.addDouble(v);
              break;
            } // case 49
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureHistoryIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                history_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            } // case 50
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

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 1;</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      symbol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      symbol_ = getDefaultInstance().getSymbol();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 1;</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      symbol_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object companyName_ = "";
    /**
     * <code>string companyName = 2;</code>
     * @return The companyName.
     */
    public java.lang.String getCompanyName() {
      java.lang.Object ref = companyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string companyName = 2;</code>
     * @return The bytes for companyName.
     */
    public com.google.protobuf.ByteString
        getCompanyNameBytes() {
      java.lang.Object ref = companyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string companyName = 2;</code>
     * @param value The companyName to set.
     * @return This builder for chaining.
     */
    public Builder setCompanyName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      companyName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string companyName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompanyName() {
      companyName_ = getDefaultInstance().getCompanyName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string companyName = 2;</code>
     * @param value The bytes for companyName to set.
     * @return This builder for chaining.
     */
    public Builder setCompanyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      companyName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private double priceAtStart_ ;
    /**
     * <code>double priceAtStart = 3;</code>
     * @return The priceAtStart.
     */
    @java.lang.Override
    public double getPriceAtStart() {
      return priceAtStart_;
    }
    /**
     * <code>double priceAtStart = 3;</code>
     * @param value The priceAtStart to set.
     * @return This builder for chaining.
     */
    public Builder setPriceAtStart(double value) {

      priceAtStart_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double priceAtStart = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriceAtStart() {
      bitField0_ = (bitField0_ & ~0x00000004);
      priceAtStart_ = 0D;
      onChanged();
      return this;
    }

    private double priceChange_ ;
    /**
     * <code>double priceChange = 4;</code>
     * @return The priceChange.
     */
    @java.lang.Override
    public double getPriceChange() {
      return priceChange_;
    }
    /**
     * <code>double priceChange = 4;</code>
     * @param value The priceChange to set.
     * @return This builder for chaining.
     */
    public Builder setPriceChange(double value) {

      priceChange_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>double priceChange = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriceChange() {
      bitField0_ = (bitField0_ & ~0x00000008);
      priceChange_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp date_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     * @return Whether the date field is set.
     */
    public boolean hasDate() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     * @return The date.
     */
    public com.google.protobuf.Timestamp getDate() {
      if (dateBuilder_ == null) {
        return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
      } else {
        return dateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public Builder setDate(com.google.protobuf.Timestamp value) {
      if (dateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        date_ = value;
      } else {
        dateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public Builder setDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateBuilder_ == null) {
        date_ = builderForValue.build();
      } else {
        dateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public Builder mergeDate(com.google.protobuf.Timestamp value) {
      if (dateBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          date_ != null &&
          date_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDateBuilder().mergeFrom(value);
        } else {
          date_ = value;
        }
      } else {
        dateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public Builder clearDate() {
      bitField0_ = (bitField0_ & ~0x00000010);
      date_ = null;
      if (dateBuilder_ != null) {
        dateBuilder_.dispose();
        dateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateOrBuilder() {
      if (dateBuilder_ != null) {
        return dateBuilder_.getMessageOrBuilder();
      } else {
        return date_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : date_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateFieldBuilder() {
      if (dateBuilder_ == null) {
        dateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDate(),
                getParentForChildren(),
                isClean());
        date_ = null;
      }
      return dateBuilder_;
    }

    private com.google.protobuf.Internal.DoubleList history_ = emptyDoubleList();
    private void ensureHistoryIsMutable() {
      if (!((bitField0_ & 0x00000020) != 0)) {
        history_ = mutableCopy(history_);
        bitField0_ |= 0x00000020;
      }
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @return A list containing the history.
     */
    public java.util.List<java.lang.Double>
        getHistoryList() {
      return ((bitField0_ & 0x00000020) != 0) ?
               java.util.Collections.unmodifiableList(history_) : history_;
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @return The count of history.
     */
    public int getHistoryCount() {
      return history_.size();
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @param index The index of the element to return.
     * @return The history at the given index.
     */
    public double getHistory(int index) {
      return history_.getDouble(index);
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @param index The index to set the value at.
     * @param value The history to set.
     * @return This builder for chaining.
     */
    public Builder setHistory(
        int index, double value) {

      ensureHistoryIsMutable();
      history_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @param value The history to add.
     * @return This builder for chaining.
     */
    public Builder addHistory(double value) {

      ensureHistoryIsMutable();
      history_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @param values The history to add.
     * @return This builder for chaining.
     */
    public Builder addAllHistory(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureHistoryIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, history_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Assuming history is a list of price changes
     * </pre>
     *
     * <code>repeated double history = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHistory() {
      history_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:StockData)
  }

  // @@protoc_insertion_point(class_scope:StockData)
  private static final rs.raf.pds.v5.z2.gRPC.StockData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.v5.z2.gRPC.StockData();
  }

  public static rs.raf.pds.v5.z2.gRPC.StockData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StockData>
      PARSER = new com.google.protobuf.AbstractParser<StockData>() {
    @java.lang.Override
    public StockData parsePartialFrom(
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

  public static com.google.protobuf.Parser<StockData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StockData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.StockData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

