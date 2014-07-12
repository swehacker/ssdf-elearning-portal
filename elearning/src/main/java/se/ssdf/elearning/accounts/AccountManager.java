package se.ssdf.elearning.accounts;

import se.ssdf.domain.User;

public interface AccountManager {
    public User create(String firstname, String lastname, String adress, String adress2, String zip, String country, String phone, String email, String username, String password);
}
