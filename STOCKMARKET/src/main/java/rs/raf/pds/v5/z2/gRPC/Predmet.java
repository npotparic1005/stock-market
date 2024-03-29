// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_service.proto

package rs.raf.pds.v5.z2.gRPC;

/**
 * Protobuf type {@code Predmet}
 */
public final class Predmet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Predmet)
    PredmetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Predmet.newBuilder() to construct.
  private Predmet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Predmet() {
    sifra_ = "";
    naziv_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Predmet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.internal_static_Predmet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.internal_static_Predmet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.v5.z2.gRPC.Predmet.class, rs.raf.pds.v5.z2.gRPC.Predmet.Builder.class);
  }

  public static final int SIFRA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sifra_ = "";
  /**
   * <code>string sifra = 1;</code>
   * @return The sifra.
   */
  @java.lang.Override
  public java.lang.String getSifra() {
    java.lang.Object ref = sifra_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sifra_ = s;
      return s;
    }
  }
  /**
   * <code>string sifra = 1;</code>
   * @return The bytes for sifra.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSifraBytes() {
    java.lang.Object ref = sifra_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sifra_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAZIV_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object naziv_ = "";
  /**
   * <code>string naziv = 2;</code>
   * @return The naziv.
   */
  @java.lang.Override
  public java.lang.String getNaziv() {
    java.lang.Object ref = naziv_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      naziv_ = s;
      return s;
    }
  }
  /**
   * <code>string naziv = 2;</code>
   * @return The bytes for naziv.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNazivBytes() {
    java.lang.Object ref = naziv_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      naziv_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GODINA_FIELD_NUMBER = 3;
  private int godina_ = 0;
  /**
   * <code>int32 godina = 3;</code>
   * @return The godina.
   */
  @java.lang.Override
  public int getGodina() {
    return godina_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sifra_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sifra_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(naziv_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, naziv_);
    }
    if (godina_ != 0) {
      output.writeInt32(3, godina_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sifra_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sifra_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(naziv_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, naziv_);
    }
    if (godina_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, godina_);
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
    if (!(obj instanceof rs.raf.pds.v5.z2.gRPC.Predmet)) {
      return super.equals(obj);
    }
    rs.raf.pds.v5.z2.gRPC.Predmet other = (rs.raf.pds.v5.z2.gRPC.Predmet) obj;

    if (!getSifra()
        .equals(other.getSifra())) return false;
    if (!getNaziv()
        .equals(other.getNaziv())) return false;
    if (getGodina()
        != other.getGodina()) return false;
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
    hash = (37 * hash) + SIFRA_FIELD_NUMBER;
    hash = (53 * hash) + getSifra().hashCode();
    hash = (37 * hash) + NAZIV_FIELD_NUMBER;
    hash = (53 * hash) + getNaziv().hashCode();
    hash = (37 * hash) + GODINA_FIELD_NUMBER;
    hash = (53 * hash) + getGodina();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.Predmet parseFrom(
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
  public static Builder newBuilder(rs.raf.pds.v5.z2.gRPC.Predmet prototype) {
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
   * Protobuf type {@code Predmet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Predmet)
      rs.raf.pds.v5.z2.gRPC.PredmetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.internal_static_Predmet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.internal_static_Predmet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.v5.z2.gRPC.Predmet.class, rs.raf.pds.v5.z2.gRPC.Predmet.Builder.class);
    }

    // Construct using rs.raf.pds.v5.z2.gRPC.Predmet.newBuilder()
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
      sifra_ = "";
      naziv_ = "";
      godina_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.internal_static_Predmet_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.Predmet getDefaultInstanceForType() {
      return rs.raf.pds.v5.z2.gRPC.Predmet.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.Predmet build() {
      rs.raf.pds.v5.z2.gRPC.Predmet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.Predmet buildPartial() {
      rs.raf.pds.v5.z2.gRPC.Predmet result = new rs.raf.pds.v5.z2.gRPC.Predmet(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(rs.raf.pds.v5.z2.gRPC.Predmet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sifra_ = sifra_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.naziv_ = naziv_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.godina_ = godina_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.v5.z2.gRPC.Predmet) {
        return mergeFrom((rs.raf.pds.v5.z2.gRPC.Predmet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.v5.z2.gRPC.Predmet other) {
      if (other == rs.raf.pds.v5.z2.gRPC.Predmet.getDefaultInstance()) return this;
      if (!other.getSifra().isEmpty()) {
        sifra_ = other.sifra_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNaziv().isEmpty()) {
        naziv_ = other.naziv_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getGodina() != 0) {
        setGodina(other.getGodina());
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
              sifra_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              naziv_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              godina_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object sifra_ = "";
    /**
     * <code>string sifra = 1;</code>
     * @return The sifra.
     */
    public java.lang.String getSifra() {
      java.lang.Object ref = sifra_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sifra_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sifra = 1;</code>
     * @return The bytes for sifra.
     */
    public com.google.protobuf.ByteString
        getSifraBytes() {
      java.lang.Object ref = sifra_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sifra_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sifra = 1;</code>
     * @param value The sifra to set.
     * @return This builder for chaining.
     */
    public Builder setSifra(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sifra_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sifra = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSifra() {
      sifra_ = getDefaultInstance().getSifra();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sifra = 1;</code>
     * @param value The bytes for sifra to set.
     * @return This builder for chaining.
     */
    public Builder setSifraBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sifra_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object naziv_ = "";
    /**
     * <code>string naziv = 2;</code>
     * @return The naziv.
     */
    public java.lang.String getNaziv() {
      java.lang.Object ref = naziv_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        naziv_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string naziv = 2;</code>
     * @return The bytes for naziv.
     */
    public com.google.protobuf.ByteString
        getNazivBytes() {
      java.lang.Object ref = naziv_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        naziv_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string naziv = 2;</code>
     * @param value The naziv to set.
     * @return This builder for chaining.
     */
    public Builder setNaziv(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      naziv_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string naziv = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNaziv() {
      naziv_ = getDefaultInstance().getNaziv();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string naziv = 2;</code>
     * @param value The bytes for naziv to set.
     * @return This builder for chaining.
     */
    public Builder setNazivBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      naziv_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int godina_ ;
    /**
     * <code>int32 godina = 3;</code>
     * @return The godina.
     */
    @java.lang.Override
    public int getGodina() {
      return godina_;
    }
    /**
     * <code>int32 godina = 3;</code>
     * @param value The godina to set.
     * @return This builder for chaining.
     */
    public Builder setGodina(int value) {

      godina_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 godina = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGodina() {
      bitField0_ = (bitField0_ & ~0x00000004);
      godina_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Predmet)
  }

  // @@protoc_insertion_point(class_scope:Predmet)
  private static final rs.raf.pds.v5.z2.gRPC.Predmet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.v5.z2.gRPC.Predmet();
  }

  public static rs.raf.pds.v5.z2.gRPC.Predmet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Predmet>
      PARSER = new com.google.protobuf.AbstractParser<Predmet>() {
    @java.lang.Override
    public Predmet parsePartialFrom(
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

  public static com.google.protobuf.Parser<Predmet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Predmet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.Predmet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

