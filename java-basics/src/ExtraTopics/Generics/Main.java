package ExtraTopics.Generics;

class ApiResponse<T> {
    private String message;
    private T data;

    public ApiResponse(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }
    public T getData() {
        return data;
    }
}

class UserDto {
    private String firstName;
    private String lastName;

    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserDto{firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        ApiResponse<String> api = new ApiResponse<>("Success", "Data loaded");
        System.out.println(api.getMessage());
        System.out.println(api.getData());

        UserDto user = new UserDto("John", "Doe");
        ApiResponse<UserDto> userApi = new ApiResponse<>("User loaded", user);
        System.out.println(userApi.getMessage());
        System.out.println(userApi.getData());
    }
}