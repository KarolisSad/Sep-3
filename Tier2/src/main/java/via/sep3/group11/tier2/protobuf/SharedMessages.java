// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SharedMessages.proto

package via.sep3.group11.tier2.protobuf;

public final class SharedMessages {
  private SharedMessages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GHostDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GHostDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GHost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GHost_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRefugee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRefugee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GHousing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GHousing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GEmail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GEmail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GDateOfBirth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GDateOfBirth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GAgreement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GAgreement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SharedMessages.proto\"\261\001\n\014GHostDetails\022" +
      "\021\n\tfirstName\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\020\n\010pas" +
      "sword\030\003 \001(\t\022\016\n\006gender\030\004 \001(\t\022\023\n\013nationali" +
      "ty\030\005 \001(\t\022\022\n\nmiddleName\030\006 \001(\t\022\020\n\010lastName" +
      "\030\007 \001(\t\022\"\n\013dateOfBirth\030\010 \001(\0132\r.GDateOfBir" +
      "th\"\306\001\n\005GHost\022\021\n\tfirstName\030\001 \001(\t\022\r\n\005email" +
      "\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\016\n\006gender\030\004 \001(\t" +
      "\022\023\n\013nationality\030\005 \001(\t\022\022\n\nmiddleName\030\006 \001(" +
      "\t\022\020\n\010lastName\030\007 \001(\t\022\"\n\013dateOfBirth\030\010 \001(\013" +
      "2\r.GDateOfBirth\022\032\n\007housing\030\t \001(\0132\t.GHous" +
      "ing\"\255\001\n\010GRefugee\022\r\n\005email\030\001 \001(\t\022\020\n\010passw" +
      "ord\030\002 \001(\t\022\016\n\006gender\030\003 \001(\t\022\023\n\013nationality" +
      "\030\004 \001(\t\022\021\n\tfirstName\030\005 \001(\t\022\022\n\nmiddleName\030" +
      "\006 \001(\t\022\020\n\010lastName\030\007 \001(\t\022\"\n\013dateOfBirth\030\010" +
      " \001(\0132\r.GDateOfBirth\"D\n\010GHousing\022\020\n\010capac" +
      "ity\030\001 \001(\005\022\032\n\007address\030\002 \001(\0132\t.GAddress\022\n\n" +
      "\002id\030\003 \001(\005\"\027\n\006GEmail\022\r\n\005email\030\001 \001(\t\"\204\001\n\010G" +
      "Address\022\017\n\007country\030\001 \001(\t\022\014\n\004city\030\002 \001(\t\022\022" +
      "\n\nstreetName\030\003 \001(\t\022\023\n\013houseNumber\030\004 \001(\t\022" +
      "\022\n\nroomNumber\030\005 \001(\t\022\020\n\010postCode\030\006 \001(\t\022\n\n" +
      "\002id\030\007 \001(\003\"8\n\014GDateOfBirth\022\013\n\003day\030\001 \001(\005\022\r" +
      "\n\005month\030\002 \001(\005\022\014\n\004year\030\003 \001(\005\"\253\001\n\nGAgreeme" +
      "nt\022\n\n\002id\030\001 \001(\003\022%\n\016dateOfCreation\030\002 \001(\0132\r" +
      ".GDateOfBirth\022\"\n\013hostDetails\030\003 \001(\0132\r.GHo" +
      "stDetails\022\032\n\007housing\030\004 \001(\0132\t.GHousing\022\032\n" +
      "\007refugee\030\005 \001(\0132\t.GRefugee\022\016\n\006status\030\006 \001(" +
      "\010\"\021\n\003GId\022\n\n\002id\030\001 \001(\003\"\007\n\005EmptyB#\n\037via.sep" +
      "3.group11.tier2.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GHostDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GHostDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GHostDetails_descriptor,
        new java.lang.String[] { "FirstName", "Email", "Password", "Gender", "Nationality", "MiddleName", "LastName", "DateOfBirth", });
    internal_static_GHost_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GHost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GHost_descriptor,
        new java.lang.String[] { "FirstName", "Email", "Password", "Gender", "Nationality", "MiddleName", "LastName", "DateOfBirth", "Housing", });
    internal_static_GRefugee_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GRefugee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRefugee_descriptor,
        new java.lang.String[] { "Email", "Password", "Gender", "Nationality", "FirstName", "MiddleName", "LastName", "DateOfBirth", });
    internal_static_GHousing_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GHousing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GHousing_descriptor,
        new java.lang.String[] { "Capacity", "Address", "Id", });
    internal_static_GEmail_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GEmail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GEmail_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_GAddress_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GAddress_descriptor,
        new java.lang.String[] { "Country", "City", "StreetName", "HouseNumber", "RoomNumber", "PostCode", "Id", });
    internal_static_GDateOfBirth_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GDateOfBirth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GDateOfBirth_descriptor,
        new java.lang.String[] { "Day", "Month", "Year", });
    internal_static_GAgreement_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GAgreement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GAgreement_descriptor,
        new java.lang.String[] { "Id", "DateOfCreation", "HostDetails", "Housing", "Refugee", "Status", });
    internal_static_GId_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
