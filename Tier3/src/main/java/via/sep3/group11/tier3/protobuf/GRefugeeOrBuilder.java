// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SharedMessages.proto

package via.sep3.group11.tier3.protobuf;

public interface GRefugeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GRefugee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string gender = 3;</code>
   * @return The gender.
   */
  java.lang.String getGender();
  /**
   * <code>string gender = 3;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();

  /**
   * <code>string nationality = 4;</code>
   * @return The nationality.
   */
  java.lang.String getNationality();
  /**
   * <code>string nationality = 4;</code>
   * @return The bytes for nationality.
   */
  com.google.protobuf.ByteString
      getNationalityBytes();

  /**
   * <code>string firstName = 5;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 5;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string middleName = 6;</code>
   * @return The middleName.
   */
  java.lang.String getMiddleName();
  /**
   * <code>string middleName = 6;</code>
   * @return The bytes for middleName.
   */
  com.google.protobuf.ByteString
      getMiddleNameBytes();

  /**
   * <code>string lastName = 7;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 7;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>.GDateOfBirth dateOfBirth = 8;</code>
   * @return Whether the dateOfBirth field is set.
   */
  boolean hasDateOfBirth();
  /**
   * <code>.GDateOfBirth dateOfBirth = 8;</code>
   * @return The dateOfBirth.
   */
  via.sep3.group11.tier3.protobuf.GDateOfBirth getDateOfBirth();
  /**
   * <code>.GDateOfBirth dateOfBirth = 8;</code>
   */
  via.sep3.group11.tier3.protobuf.GDateOfBirthOrBuilder getDateOfBirthOrBuilder();

  /**
   * <code>string about = 9;</code>
   * @return The about.
   */
  java.lang.String getAbout();
  /**
   * <code>string about = 9;</code>
   * @return The bytes for about.
   */
  com.google.protobuf.ByteString
      getAboutBytes();

  /**
   * <code>int32 familySize = 10;</code>
   * @return The familySize.
   */
  int getFamilySize();
}
