package lt.itmokymai.spring;


public class ServiceB extends ServiceA {

    private String message;
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }


//    public ServiceB(String message) {
//        this.message = message;
//           }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
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
