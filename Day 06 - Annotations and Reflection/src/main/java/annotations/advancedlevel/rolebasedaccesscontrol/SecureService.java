package annotations.advancedlevel.rolebasedaccesscontrol;

public class SecureService {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.print("Admin task performed.");
    }

    @RoleAllowed("USER")
    public void performUserTask() {
        System.out.print("User task performed.");
    }
}
