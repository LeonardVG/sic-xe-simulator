package Regs;

public class Registrador {
    private byte[] reg;

    public Registrador() {
        reg = new byte[3];
    }

    public byte[] getReg() {
        return reg;
    }

    public void setReg(byte b1, byte b2, byte b3) {
        reg[0] = b1;
        reg[1] = b2;
        reg[2] = b3;
    }

    public String getValueAsString() {
        StringBuilder hexValue = new StringBuilder();
        for (byte b : reg) {
            hexValue.append(String.format("%02X", b));
        }
        return hexValue.toString();
    }
}
