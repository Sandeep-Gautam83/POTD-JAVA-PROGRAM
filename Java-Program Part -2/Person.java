public class Person
{
    int pid, page;
    String pname, paddr;
    public Person(int pid, int page, String pname, String paddr) {
        this.pid = pid;
        this.page = page;
        this.pname = pname;
        this.paddr = paddr;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPaddr() {
        return paddr;
    }

    public void setPaddr(String paddr) {
        this.paddr = paddr;
    }
}
