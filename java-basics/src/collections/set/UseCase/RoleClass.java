package collections.set.UseCase;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RoleClass {
    public Set<String> getRoles() {
        Set<String> roles = new HashSet<>();
        roles.add("Admin");
        roles.add("User");
        roles.add("Guest");
        roles.add("Admin"); // Duplicate, will not be added
        return roles;
    }
    public Set<String> getTags() {
        Set<String> tags = new TreeSet<>();
        tags.add("spring");
        tags.add("java");
        tags.add("api");

        return tags; // Sorted order, no duplicates
    }
    public static void main(String[] args) {
        RoleClass roleClass = new RoleClass();
        Set<String> roles = roleClass.getRoles();
        System.out.println("Roles: " + roles);

        Set<String> tags = roleClass.getTags();
        System.out.println("Tags: " + tags);
    }
}
