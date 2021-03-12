package pl.javastart.formvalidation1;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "Pole nie może być puste")
    @Length(message = "Pole musi mieć co najmniej 3 znaki", min = 3)
    private String firstName;

    @NotBlank(message = "Pole nie może być puste")
    @Length(message = "Pole musi mieć co najmniej 3 znaki", min = 3)
    private String lastName;

    @NotBlank(message = "Pole nie może być puste")
    private String address;

    @NotBlank(message = "Pole nie może być puste")
    @Pattern(regexp = "^\\d{2}-\\d{3}$", message = "Wpisz poprawny kod pocztowy")
    private String zip;

    @NotBlank(message = "Pole nie może być puste")
    private String city;

    @Pattern(regexp = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$", message = "Adres e-mail musi być odpowiednio sformatowany")
    private String email;

    @NotBlank(message = "Pole nie może być puste")
    @Length(message = "Hasło musi mieć co najmniej 8 znaków", min = 8)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
            message = "Hasło musi zawierać min. 1 znak mały, duży i znak specjalny")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean confirmedConditions;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isConfirmedConditions() {
        return confirmedConditions;
    }

    public void setConfirmedConditions(boolean confirmedConditions) {
        this.confirmedConditions = confirmedConditions;
    }
}
