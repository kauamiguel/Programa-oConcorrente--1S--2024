import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Account {

    Double balance = 0.0;
    private PropertyChangeSupport propertyChangeSupport;

    public Account() throws Exception{
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    Double getBalance(){
        return this.balance;
    }

    //Spend the balance and trigger the property with name payed to observe the value of the account
    void spendBalance(Double value){
        Double currentBalance = this.balance;
        this.balance -= value;
        propertyChangeSupport.firePropertyChange("payed", currentBalance, this.balance);
    }

    //Gain the balance and trigger the property with name payed to observe the value of the account
    void gainBalance(Double value){
        Double currentBalance = this.balance;
        this.balance += value;
        propertyChangeSupport.firePropertyChange("payed", currentBalance, this.balance);
    }

    //Add a listener to observe the change in the current balance
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
}
