package enums;

public enum ExistingUserEnum {
    LENA_KOLENO("lenakoleno1@mail.ru", "iop789iop", "");
    public final String username;
    public final String pass;
    public final String profileName;

    ExistingUserEnum(String username, String pass, String profileName) {
        this.username = username;
        this.pass = pass;
        this.profileName = profileName;
    }
}
