import java.util.Base64;

public class Base64passhiding
{
    public static void main(String[] args) {
        String msg="This is a secret message";
        String encmsg = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("Encypted message = :" +encmsg);

        byte []dm =Base64.getDecoder().decode(encmsg);
        String decmsg = new String(dm);
        System.out.println("Decryted message = :" +decmsg);
    }
}
