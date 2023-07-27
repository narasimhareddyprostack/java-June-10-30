interface User{
    public abstract void login();
    public abstract void logout();
    default void forgetPassword(){}
}