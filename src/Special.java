public class Special extends Account {

    public Special(double balance,int id) {
        setBalance(balance);
        setMinBalance(getBalance());
        setId(id);

    }
}
