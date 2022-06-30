
import java.util.ArrayList;

public class Person {
    private int ID;
    private String fairness;
    private ArrayList<Coin> coins;

    public Person(int ID, String fairness){
        this.ID = ID;
        this.fairness = fairness;
        this.coins = new ArrayList<>();
    }

    public int tally(){
        int tallycount = 0;
        for(int i=0; i<coins.size(); i++){
            if(coins.get(i).getValue() == "Heads"){
                tallycount ++;
            }
        }
        return tallycount;
    }

    public void addCoin(Coin ca, Coin cb, Coin cc, Coin cd){
        this.coins.add(ca);
        this.coins.add(cb);
        this.coins.add(cc);
        this.coins.add(cd);
    }

    public int getID() {
        return ID;
    }

    public String getFairness() {
        return fairness;
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }
}
