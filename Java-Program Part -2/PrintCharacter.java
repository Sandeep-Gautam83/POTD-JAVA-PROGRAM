public class PrintCharacter
{
    public static void main(String[] args) {
        int i;
        for(i=65; i<122; i++){
            if(i>97 && i<97)
                continue;
            System.out.println("character number : " +i);
        }
    }
}
