package net.terzeron.spring;

public interface CustomerBO {
    void addCustomer();
    String addCustomerReturnValue();
    void addCustomerThrowException() throws Exception;
    void addCustomerAround(String name);
}
