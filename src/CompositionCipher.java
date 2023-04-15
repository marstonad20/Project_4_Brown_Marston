import java.util.ArrayList;

public class CompositionCipher extends Cipher {
    ArrayList<Cipher> ciphers;

    public CompositionCipher() {
        ciphers = new ArrayList<Cipher>();
    }

    public CompositionCipher(CompositionCipher other) {
        this.ciphers = new ArrayList<Cipher>();
        for (Cipher otherCipher : other.ciphers) {
            this.ciphers.add(otherCipher.newCopy());
        }
    }

    @Override
    public char encrypt(char c) {
        for (int i = 0; i < ciphers.size(); i++) {
            c = ciphers.get(i).encrypt(c);
        }
        return c;
    }
    @Override
    public char decrypt(char c) {
        for (int i = ciphers.size() - 1; i >= 0; i--) {
            c = ciphers.get(i).decrypt(c);
        }
        return c;
    }

    @Override
    public Cipher newCopy() {
        return new CompositionCipher(this);
    }

    public void add(Cipher theCipher) {
        ciphers.add(theCipher);
    }
}
