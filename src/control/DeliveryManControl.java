package control;
import da.DeliveryManDA;
import domain.DeliveryManDomain;

public class DeliveryManControl{
    
    private DeliveryManDA DeliveryDA;
    
    public DeliveryManControl(){
        DeliveryDA = new DeliveryManDA();
    }
    
    public void AddStaff(DeliveryManDomain S){
        DeliveryDA.addRecord(S);
    }
    
    public DeliveryManDomain selectPhnRecord(String staffphn){
        return DeliveryDA.getphnRecord(staffphn);
    }
}