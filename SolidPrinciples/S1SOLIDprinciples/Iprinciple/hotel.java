package LLD.S1SOLIDprinciples.Iprinciple;
//According to this principle the client should not implement unnecessary methods so the interfaces should be seperate

public class hotel {
    
}

interface restEmp{
    public void cook();
    public void cleaner();
    public void server();
}

//Instead of this we can have different interface for different employee;
//====>Interface should be such,thst client should not implement unnecessary functions that they do not need
