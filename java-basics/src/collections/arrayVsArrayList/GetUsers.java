package collections.arrayVsArrayList;

import java.util.List;

public class GetUsers {
    // ❌
    public String[] getUsers() {
        String[] users = {"John", "Jane", "Jack", "Jill"};
        return users;
    }
    // ✅
    public List<String> getUsersList() {
        List<String> users = List.of("John", "Jane", "Jack", "Jill");
        return users;
    }

    public static void main(String[] args) {
        GetUsers getUsers = new GetUsers();
        String[] usersArray = getUsers.getUsers();
        List<String> usersList = getUsers.getUsersList();

        System.out.println(usersArray[1]);
        System.out.println(usersList);
    }
}
