public abstract class Cipher {
    public Cipher() {
    }
    public abstract Cipher newCopy();
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);

    // Overloading encrypt
    public String encrypt(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char enC = encrypt(s.charAt(i));
            result.append(enC);
        }
        return result.toString();
    }

    public String decrypt(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i< s.length(); i++) {
            char deC = decrypt(s.charAt(i));
            result.append(deC);

        }
        return result.toString();
    }
}
