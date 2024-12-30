public class POJOmain
{
    public static void main(String[] args) {
        POJOclass obj = new POJOclass();
        obj.setId(101);
        obj.setName("Sandeep");
        obj.setAddress("Pratapgarh");

        System.out.println("ID = "+obj.getId());
        System.out.println("Name = "+obj.getName());
        System.out.println("Address = "+obj.getAddress());
    }
}
