package lt.itmokymai.spring;


public class ServiceA {
    private String message;

    public ServiceA() {
        super();
    }


    public String getResult() {
        return getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void initBean() throws Exception {
        System.out.println(getMessage() + " Bean has been created");
    }

    public void destroyBean() throws Exception {
        System.out.println(getMessage() + " Bean has been deleted");
    }

}
