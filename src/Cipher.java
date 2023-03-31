public abstract class Cipher {
    public Cipher() {
    }
    public abstract Cipher newCopy(Cipher cipher);
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);
    public String encrypt(String s) {
        return "";
    }
    public String decrypt(String s) {
        return "";
    }
}
