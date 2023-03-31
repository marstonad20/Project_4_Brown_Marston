public abstract class Cipher {
    public Cipher() {
    }
    public abstract Cipher newCopy();
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);

    public String encrypt(String s) {
        //TODO: implement
        return "";
    }
    public String decrypt(String s) {
        //TODO: implement
        return "";
    }
}
