package controler;

import model.Governance;
import model.Trade;
import model.User;
import model.buildings.Storage;

public class TradeControl {
    public void addHistory(){
        User user = new User(null,null, null, null, null, null, 0 );
    }
    public void addTrade(){
        Trade trade = new Trade();
    }
    public void accept(){
        Governance governance = new Governance();
        Storage storage = new Storage();
    }
}
