package lt.itmokymai.spring;


import java.util.List;

public class ServiceC extends ServiceA {


    ServiceA serviceA;

    List<Object> lists;
    private String message;

    public ServiceC() {
        super();
    }

    public ServiceC(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String getResult() {
        return "ServiceC result: " + lists;
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