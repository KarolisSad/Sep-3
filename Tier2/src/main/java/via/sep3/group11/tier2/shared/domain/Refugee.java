package via.sep3.group11.tier2.shared.domain;

import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import java.util.Optional;

import static via.sep3.group11.tier2.shared.domain.ValidationHelper.*;

/**
 * Class representing a Refugee.
 * @version 27/11-2022
 * @author Christian Hougaard Pedersen
 */
public class Refugee {
    private String email;
    private String password;
    private char gender;
    private String nationality;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    /**
     * All-argument constructor used to create an instance of the object.
     * All arguments are initialized by calling their corresponding set-method.
     * @param firstName: The first name of the refugee to be created.
     * @param email: The email of the refugee to be created.
     * @param password: The password of the refugee to be created.
     * @param gender: The gender of the refugee to be created.
     * @param nationality: The nationality of the refugee to be created.
     * @param middleName: Optional field representing the middle name of the refugee to be created.
     * @param lastName: The last name of the refugee to be created.
     * @param dateOfBirth: The date of birth of the refugee to be created.
     * @throws ValidationException if any of the set-methods throws exceptions.
     */
    public Refugee(String email, String password, char gender, String nationality, String firstName, Optional<String> middleName, String lastName, Date dateOfBirth) throws ValidationException {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setGender(gender);
        setNationality(nationality);
        setDateOfBirth(dateOfBirth);
    }

    /**
     * Zero-argument constructor used to create an empty instance of a Refugee-object.
     */
    public Refugee() {
    }

    /**
     * Getter-method for the email of the Refugee.
     * @return the email of the Refugee.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method used for setting the email of the refugee.
     * The parameter is validated by calling the static method ValidateEmail.
     * @param email: The email to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setEmail(String email) throws ValidationException {
        ValidateEmail(email);
        this.email = email;
    }

    /**
     * Getter-method for the password of the Refugee.
     * @return the password of the refugee.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method used for setting the password of the refugee.
     * The parameter is validated by calling the static method ValidatePassword.
     * @param password: The password to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setPassword(String password) throws ValidationException {
        ValidatePassword(password);
        this.password = password;
    }

    /**
     * Getter-method for the gender of the refugee.
     * @return the gender of the refugee.
     */
    public char getGender() {
        return gender;
    }

    /**
     * Method used for setting the gender of the refugee.
     * The parameter is validated by calling the static method ValidateGender.
     * @param gender: The gender to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setGender(char gender) throws ValidationException {
        this.gender = ValidateGender(gender);
    }


    /**
     * Getter-method for the nationality of the refugee.
     * @return the nationality of the refugee.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Method used for setting the nationality of the refugee.
     * The parameter is validated by calling the static method ValidateNationality.
     * @param nationality: The nationality to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setNationality(String nationality) throws ValidationException {
        ValidateNationality(nationality);
        this.nationality = nationality;
    }

    /**
     * Getter-method for the first name of the refugee.
     * @return the first name of the refugee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method used for setting the first name of the refugee.
     * The parameter is validated by calling the static method ValidateFirstName.
     * @param firstName: The first name to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setFirstName(String firstName) throws ValidationException {
        ValidateFirstName(firstName);
        this.firstName = firstName;
    }

    /**
     * Getter-method for the middle name of the refugee.
     * @return the middle name of the refugee.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Method used for setting the middle name of the refugee.
     * The parameter is validated by calling the static method ValidateMiddleName.
     * @param middleName: The middle name to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setMiddleName(Optional<String> middleName) throws ValidationException {
        this.middleName = ValidateMiddleName(middleName);
    }

    /**
     * Getter-method for the last name of the refugee.
     * @return the last name of the refugee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method used for setting the last name of the refugee.
     * The parameter is validated by calling the static method ValidateLastName.
     * @param lastName: The last name to be set.
     * @throws ValidationException if validation throws an exception.
     */
    public void setLastName(String lastName) throws ValidationException {
        ValidateLastName(lastName);
        this.lastName = lastName;
    }

    /**
     * Getter-method for the date of birth of the refugee.
     * @return the date of birth of the refugee.
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Method used for setting the date of birth of the refugee.
     * @param dateOfBirth: The date of birth to be set to be set.
     * @throws ValidationException if parameter is null.
     */
    public void setDateOfBirth(Date dateOfBirth) throws ValidationException {
        if (dateOfBirth == null) {
            throw new ValidationException("Date of birth should not be null.");
        }
        this.dateOfBirth = dateOfBirth;
    }
}
