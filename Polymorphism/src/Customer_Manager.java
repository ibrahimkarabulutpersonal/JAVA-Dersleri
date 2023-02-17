public class Customer_Manager {
    Base_Logger[] baseLogger;
    Customer_Manager(Base_Logger... baseLogger1){
        this.baseLogger = baseLogger1;
    }
    public void log(){
        for(Base_Logger printer:baseLogger){
            printer.log("Customer Managerdan Loglandı");
        }
    }
}
