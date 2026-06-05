package home.dtos;

import java.util.List;

public class CreateOrganizationDto {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private List<CreateUserDto> users;

    public List<CreateUserDto> getUsers() {
        return users;
    }

    public void setUsers(List<CreateUserDto> users) {
        this.users = users;
    }

    private String name;

    private String email;

    private String phone;

    private String address;
}
