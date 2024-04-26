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

    void spendBalance(Double value){
        Double currentBalance = this.balance;
        this.balance -= value;
        propertyChangeSupport.firePropertyChange("payed", currentBalance, this.balance);
    }

    void gainBalance(Double value){
        Double currentBalance = this.balance;
        this.balance += value;
        propertyChangeSupport.firePropertyChange("payed", currentBalance, this.balance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
}
